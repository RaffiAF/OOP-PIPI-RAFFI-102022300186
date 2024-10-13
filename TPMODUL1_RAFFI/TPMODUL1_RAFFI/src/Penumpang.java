public class Penumpang {
    private String NIK, namaDepan, namaBelakang;

    public Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public String getNIK(){ 
        return NIK; 
    }
    public String getNamaDepan(){ 
        return namaDepan; 
    }
    public String getNamaBelakang(){ 
        return namaBelakang; 
    }
}
