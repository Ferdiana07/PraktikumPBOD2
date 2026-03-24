/* Nama File    : Pengusaha.java
 * Deskripsi    : Class Pengusaha yang merupakan subclass dari Manusia 
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 17 Maret 2026 
 */
import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;
    private static final int B = 5;

    public Pengusaha(String nama, LocalDate tgl, String alamat, double pendapatan, String npwp) {
        super(nama, tgl, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return hitungTahunKerja() + B;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}