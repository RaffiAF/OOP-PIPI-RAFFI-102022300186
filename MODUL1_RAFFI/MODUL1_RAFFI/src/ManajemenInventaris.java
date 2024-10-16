// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();

    public void tambahMakananKering() {
        Scanner scanner = new Scanner(System.in);

        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        // Todo : Create a new object for MakananKering
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"

        System.out.println("Masukkan Nama Makanan: ");
        String nama = Scanner.nextLine();
        System.out.println("Masukkan Jumlah Makanan: ");
        int jumlah = Scanner.nextInt();
        System.out.println("Masukkan Harga Makanan: ");
        double harga = Scanner.nextDouble();
        System.out.println("Masukkan Brand Makanan: ");
        String brand = Scanner.nextLine();

        MakananKering makanan = new MakananKering(nama, jumlah, jumlah, brand);

        System.out.println("Makanan kering berhasil ditambahkan: ");
        
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan

        // Todo : Create a new object for MakananBasah
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
        } else {
            // Todo : Create print notification for Makanan Kering  
            for 
            }
            // Todo : Create print notification for  Makanan Basah
            for 
            }
        }
    }
}