public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Momo", 2, "Persia");
        Hewan burung = new Burung("Rio", 1, "Hijau");
        System.out.println("Detail Hewan\n");
        
        System.out.println("ini adalah " + kucing.nama + " !");
        ((Kucing) kucing).bersuara();
        kucing.makan();
        ((Kucing) kucing).makan();
        kucing.detail();

        System.out.println("\n");

        System.out.println("ini adalah " + burung.nama + " !");
        ((Burung) burung).bersuara();
        burung.makan();
        ((Burung) burung).makan();
        burung.detail();
    }
}
