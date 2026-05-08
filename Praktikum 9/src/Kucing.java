/* Nama File    : Anabul.java
 * Deskripsi    : Implementasi Kelas Anabul
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 5 Mei 2026
 */

public class Kucing extends Anabul {

    private double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara meong");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan berjalan");
    }

    public void tampilBobot() {
        System.out.println(getNama() + " memiliki bobot " + bobot + " kg");
    }

    // getter
    public double getBobot() {
        return bobot;
    }

    // setter
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }
}