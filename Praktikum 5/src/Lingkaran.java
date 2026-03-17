/* Nama File    : Lingkaran.java
 * Deskripsi    : Main class untuk menguji Lingkaran
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 17 Maret 2026 
 */

public class Lingkaran extends BangunDatar implements IResize {
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
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void zoomIn() {
        jariJari = jariJari * 1.1;
    }

    @Override
    public void zoomOut() {
        jariJari = jariJari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jariJari = jariJari * percent / 100.0;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("JariJari : " + jariJari);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}