
/* Nama File    : Persegi.java
 * Deskripsi    : Main class untuk menguji Persegi
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 10 Maret 2026 
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setjmlhSisi(4);
    }

    public Persegi(double sisi,String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }


    @Override
    public void printInfo() {
        System.out.println("Jumlah Sisi : " + getjmlhSisi());
        System.out.println("Warna : " + getWarna());
        System.out.println("Border : " + getBorder());
        System.out.println("Sisi : " + sisi);
    }

}
