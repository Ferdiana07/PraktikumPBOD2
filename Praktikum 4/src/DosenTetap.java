/* Nama File    : DosenTetap.java
 * Deskripsi    : Main class untuk menguji DosenTetap
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 10 Maret 2026 
 */

public class DosenTetap extends Pegawai{
    private String NIDN;

    public DosenTetap(String NIP, String nama, Date TanggalLahir, Date TMT, double gajiPokok, String NIDN) {
        super(NIP, nama, TanggalLahir, TMT, gajiPokok);
        this.NIDN = NIDN;
    }

    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }
    
}
