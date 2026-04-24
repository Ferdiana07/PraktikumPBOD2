/* Nama File    : Mahasiswa.java
 * Deskripsi    : class Mahasiswa yang merupakan subclass dari CivitasAkademika
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 21 April 2026 
 */

public class Mahasiswa extends CivitasAkademika {
    private String nim;
    private Dosen  dosenWali;
 
    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
        this.dosenWali = null;
    }
 
    @Override
    public String getNomor() { 
        return nim; 
    }
 
    public String getNIM() { 
        return nim; 
    }
 
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }
 
    public Dosen getDosenWali() { 
        return dosenWali; 
    }
 
    public void tampilDataMahasiswa() {
        System.out.println("  NIM          : " + nim);
        System.out.println("  Nama         : " + nama);
        if (dosenWali != null)
            System.out.println("  Dosen Wali   : " + dosenWali.getNama());
        else
            System.out.println("  Dosen Wali   : Belum ada");
    }
}