/* Nama File    : Petani.java
 * Deskripsi    : Class Petani yang merupakan subclass dari Manusia 
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 17 Maret 2026 
 */
import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;
    private static final int C = 0; 

    public Petani(String nama, LocalDate tgl, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0; 
    }

    @Override
    public int hitungMasaKerja() {
        return hitungTahunKerja() + C;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}