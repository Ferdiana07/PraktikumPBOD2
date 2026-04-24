/* Nama File    : Dosen.java
 * Deskripsi    : class Dosen yang merupakan subclass dari CivitasAkademika
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 21 April 2026 
 */

public class Dosen extends CivitasAkademika {
    private String nip;
 
    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }
 
    @Override
    public String getNomor() { 
        return nip; 
    }
 
    public String getNIP() { 
        return nip; 
    }
}