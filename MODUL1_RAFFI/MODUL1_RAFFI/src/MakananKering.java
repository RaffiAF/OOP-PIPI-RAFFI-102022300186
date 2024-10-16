// Don't delete any comments below!!!

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    // Todo : Create Constructor of MakananKering
    // Todo : Create Getter and Setter
    // Todo : Create Method ShowData

    private String nama;
    private int jumlah;
    private float harga;
    private String brand;

    public MakananKering(String nama, int jumlah, float harga, String brand) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public float getHarga(){
        return harga;
    }
    public void setHarga(){
        this.harga = harga;
    }
    
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand = brand;
    }

    public void tampilkanSemuaMakanan(){
        System.out.println("Nama: " +  nama + "Jumlah: " + jumlah + "Harga: " + harga + "Bahan: " + bahan);
    }

}