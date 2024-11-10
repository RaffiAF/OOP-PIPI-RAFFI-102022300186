public class Hewan {
    String nama;
    int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public void detail() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun.");
    }
}
