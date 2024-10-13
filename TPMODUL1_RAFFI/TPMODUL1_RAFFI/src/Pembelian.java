import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    private static ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    private static Penumpang penumpang;
    private static Penerbangan penerbangan;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        daftarPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", 
                "06:30", "08:15", 1200000.0f));
        daftarPenerbangan.add(new Penerbangan("QZ902", "SUB, Surabaya", "KNO, Medan", 
                "09:00", "11:45", 1350000.0f));

        while (true) {
            System.out.println("\n====== EAD Ticket Booking System ======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");

            int menu = inputAngka(scanner);

            if (menu == 1) tampilkanDaftarPenerbangan();
            else if (menu == 2) beliTiket(scanner);
            else if (menu == 3) tampilkanPesanan();
            else if (menu == 4) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
        scanner.close();
    }

    private static void tampilkanDaftarPenerbangan() {
        System.out.println();
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarPenerbangan.get(i).tampilDaftarPenerbangan();
        }
    }

    private static void beliTiket(Scanner scanner) {
        System.out.println("\nMasukkan isi data diri anda terlebih dahulu!");
        System.out.print("Masukkan NIK: ");
        String NIK = scanner.nextLine();
        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = scanner.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = scanner.nextLine();

        penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

        System.out.println("\nTerima Kasih telah Mengisi Data Pelanggan.");
        System.out.println("Silakan Pilih Tiket Penerbangan yang Tersedia");
        tampilkanDaftarPenerbangan();

        System.out.print("\nPilih nomor penerbangan (ex: 1): ");
        int nomor = inputAngka(scanner);
        if (nomor >= 1 && nomor <= daftarPenerbangan.size()) {
            penerbangan = daftarPenerbangan.get(nomor - 1);
            System.out.println("Pemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
        } else {
            System.out.println("Nomor penerbangan tidak valid.");
        }
    }

    private static void tampilkanPesanan() {
        if (penumpang == null || penerbangan == null) {
            System.out.println("\nPembelian Tiket Tidak Ada");
        } else {
            System.out.println("\n====== Detail Tiket Penerbangan ======");
            System.out.println("Nomor Induk Kependudukan: " + penumpang.getNIK());
            System.out.println("Nama Depan: " + penumpang.getNamaDepan());
            System.out.println("Nama Belakang: " + penumpang.getNamaBelakang());
            System.out.println("Nomor Penerbangan: " + penerbangan.getNomorPenerbangan());
            System.out.println("Bandara Keberangkatan: " + penerbangan.getBandaraKeberangkatan() + 
                               " ---> Bandara Tujuan: " + penerbangan.getBandaraTujuan());
            System.out.println("Waktu Keberangkatan: " + penerbangan.getWaktuKeberangkatan() + 
                               " ---> Waktu Kedatangan: " + penerbangan.getWaktuKedatangan());
            System.out.println("Harga Tiket: Rp." + penerbangan.getHargaTiket());
        }
    }

    private static int inputAngka(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Input harus berupa angka!");
            scanner.next();
        }
        int angka = scanner.nextInt();
        scanner.nextLine();
        return angka;
    }
}
