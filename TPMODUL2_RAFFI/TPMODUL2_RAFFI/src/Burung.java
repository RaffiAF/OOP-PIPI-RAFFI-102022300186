public class Burung extends Hewan {
    String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void makan() {
        System.out.println(nama + " sedang makan biji-bijian.");
    }

    public void bersuara() {
        System.out.println(nama + " berkicau.");
    }

    @Override
    public void detail() {
        super.detail();
        System.out.println("Warna bulu: " + warnaBulu);
    }
}
