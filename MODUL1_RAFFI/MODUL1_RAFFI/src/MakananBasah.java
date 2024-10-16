// Don't delete any comments below!!!
public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    // Todo : Create Constructor of MakananBasah
    // Todo : Create Getter and Setter
    // Todo : Create Method ShowData

    private String nama;
    private int jumlah;
    private float harga;
    private String bahan;

    public MakananBasah(String nama, int jumlah, float harga, String bahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.bahan = bahan;
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
    
    public String getBahan(){
        return bahan;
    }
    public void setBahan(){
        this.bahan = bahan;
    }

    public void tampilkanSemuaMakanan(){
        System.out.println("Nama: " +  nama + "Jumlah: " + jumlah + "Harga: " + harga + "Bahan: " + bahan);
    }
}