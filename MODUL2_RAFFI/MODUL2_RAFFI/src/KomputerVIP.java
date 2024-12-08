class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    private boolean vipCard;
 
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    @Override
    public void informasi();
    super.informasi();
    if(vipCard){
        System.out.println("Status\t Member VIP");
        System.out.println("");
    else{
        System.out.println("Status \t Non VIP");
        System.out.println("Beneft member VIP");
    }
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void login(String username){
        System.out.println("Login dengan username : " + username);
    }
 
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam){
        System.out.println("Bermain selama" + jam + "jam");
    }
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int jam, int menitTambahan){
        System.out.println("Nambah billing selama" + jam + menitTambahan + "menit");
    }
}