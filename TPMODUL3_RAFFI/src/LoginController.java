import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Validasi sederhana
        if ("admin".equals(username) && "password".equals(password)) {
            errorLabel.setText("Login successful!");
        } else {
            errorLabel.setText("Invalid username or password.");
        }
    }
}
