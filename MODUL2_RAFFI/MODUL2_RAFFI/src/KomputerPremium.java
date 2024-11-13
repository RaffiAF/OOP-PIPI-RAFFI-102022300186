class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    private boolean ruangPrivat;
    
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void pesan(int nomorKomputer){
        System.out.println("Memesenan Komputer nomor: " + nomorKomputer);
    }
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void tambahLayanan(String makanan){
        System.out.println("Menambah Layanan makanan: " + makanan);
    }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void detailTambahLayanan(String makanan, String minuman){
        System.out.println("Menambah layanan makanan" + makanan + "dan minuman: " + minuman);
    }
}
