/* Nama File    : CivitasAkademika.java
 * Deskripsi    : class CivitasAkademika
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 21 April 2026 
 */

abstract class CivitasAkademika {
    protected String nama;
 
    public CivitasAkademika(String nama) {
        this.nama = nama;
    }
 
    public String getNama() {
        return nama;
    }
 
    public abstract String getNomor();
}