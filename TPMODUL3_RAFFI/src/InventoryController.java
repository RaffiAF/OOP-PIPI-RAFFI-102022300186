import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class InventoryController {
    @FXML
    private TableView<Album> tableView;
    @FXML
    private TableColumn<Album, String> columnAlbumName;
    @FXML
    private TableColumn<Album, String> columnArtist;
    @FXML
    private TableColumn<Album, Integer> columnAvailable;
    @FXML
    private TableColumn<Album, Integer> columnTotal;
    
    @FXML
    private TextField textAlbumName;
    @FXML
    private TextField textArtist;
    @FXML
    private TextField textAvailable;
    @FXML
    private TextField textTotal;
    
    @FXML
    private Button btnAdd, btnUpdate, btnDelete, btnRent;

    private ObservableList<Album> albumList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        columnAlbumName.setCellValueFactory(data -> data.getValue().albumNameProperty());
        columnArtist.setCellValueFactory(data -> data.getValue().artistProperty());
        columnAvailable.setCellValueFactory(data -> data.getValue().availableProperty().asObject());
        columnTotal.setCellValueFactory(data -> data.getValue().totalProperty().asObject());

        tableView.setItems(albumList);

        btnAdd.setOnAction(e -> addAlbum());
        btnUpdate.setOnAction(e -> updateAlbum());
        btnDelete.setOnAction(e -> deleteAlbum());
        btnRent.setOnAction(e -> rentSelected());
    }

    private void addAlbum() {
        albumList.add(new Album(
            textAlbumName.getText(),
            textArtist.getText(),
            Integer.parseInt(textAvailable.getText()),
            Integer.parseInt(textTotal.getText())
        ));
        clearFields();
    }

    private void updateAlbum() {
        Album selected = tableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setAlbumName(textAlbumName.getText());
            selected.setArtist(textArtist.getText());
            selected.setAvailable(Integer.parseInt(textAvailable.getText()));
            selected.setTotal(Integer.parseInt(textTotal.getText()));
            tableView.refresh();
        }
        clearFields();
    }

    private void deleteAlbum() {
        Album selected = tableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            albumList.remove(selected);
        }
    }

    private void rentSelected() {
        Album selected = tableView.getSelectionModel().getSelectedItem();
        if (selected != null && selected.getAvailable() > 0) {
            selected.setAvailable(selected.getAvailable() - 1);
            tableView.refresh();
        }
    }

    private void clearFields() {
        textAlbumName.clear();
        textArtist.clear();
        textAvailable.clear();
        textTotal.clear();
    }
}
