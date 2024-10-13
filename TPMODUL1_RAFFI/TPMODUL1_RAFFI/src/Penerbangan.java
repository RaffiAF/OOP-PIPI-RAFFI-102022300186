public class Penerbangan {
    private String nomorPenerbangan, bandaraKeberangkatan, bandaraTujuan;
    private String waktuKeberangkatan, waktuKedatangan;
    private float hargaTiket;

    public Penerbangan(String nomor, String keberangkatan, String tujuan,
                       String waktuBerangkat, String waktuTiba, float harga) {
        this.nomorPenerbangan = nomor;
        this.bandaraKeberangkatan = keberangkatan;
        this.bandaraTujuan = tujuan;
        this.waktuKeberangkatan = waktuBerangkat;
        this.waktuKedatangan = waktuTiba;
        this.hargaTiket = harga;
    }

    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan + " ---> Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan + " ---> Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Harga Tiket: Rp." + hargaTiket);
    }

    public String getNomorPenerbangan(){ 
        return nomorPenerbangan; 
    }
    public String getBandaraKeberangkatan(){ 
        return bandaraKeberangkatan; 
    }
    public String getBandaraTujuan(){ 
        return bandaraTujuan; 
    }
    public String getWaktuKeberangkatan(){ 
        return waktuKeberangkatan; 
    }
    public String getWaktuKedatangan(){ 
        return waktuKedatangan; 
    }
    public float getHargaTiket(){ 
        return hargaTiket; 
    }
}
