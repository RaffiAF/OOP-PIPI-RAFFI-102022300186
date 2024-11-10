public class Kucing extends Hewan {
    String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    public void makan() {
        System.out.println(nama + " sedang makan ikan.");
    }

    public void bersuara() {
        System.out.println(nama + " mengeong.");
    }

    @Override
    public void detail() {
        super.detail();
        System.out.println("Ras: " + ras);
    }
}
