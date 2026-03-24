/* Nama File    : PNS.java
 * Deskripsi    : Abstract class PNS
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 17 Maret 2026 
 */
import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 1; 

    public PNS(String nama, LocalDate tgl, String alamat, double pendapatan, String nip) {
        super(nama, tgl, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl, double pendapatan, String nip) {
        super(nama, tgl, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return hitungTahunKerja() + A;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}