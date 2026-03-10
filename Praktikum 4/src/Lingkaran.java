/* Nama File    : Lingkaran.java
 * Deskripsi    : Main class untuk menguji Lingkaran
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 10 Maret 2026 
 */

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran() {
        setjmlhSisi(0);
    }

    public Lingkaran(double jariJari, String warna, String border) {
        super(0, warna, border);
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("JariJari : " + jariJari);
    }

}