/* Nama File    : DosenTamu.java
 * Deskripsi    : Main class untuk menguji DosenTamu
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 10 Maret 2026 
 */

public class DosenTamu extends Pegawai{
    private String NIDK;

    public DosenTamu(String NIP, String nama, Date TanggalLahir, Date TMT, double gajiPokok, String NIDK ) {
        super(NIP, nama, TanggalLahir, TMT, gajiPokok);
        this.NIDK = NIDK;
    }

    public String getNIDK() {
        return NIDK;
    }

    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }
}
