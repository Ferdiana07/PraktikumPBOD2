/* Nama File    : Anabul.java
 * Deskripsi    : Implementasi Kelas Anabul
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 5 Mei 2026
 */

public class Anabul {

    private String nama;
    private String panggilan;

    public Anabul(String nama) {
        this.nama = nama;
        this.panggilan = nama;
    }

    public void bersuara() {
        System.out.println(getNama() + " mengeluarkan suara.");
    }

    public void bergerak() {
        System.out.println(getNama() + " sedang bergerak.");
    }

    // getter
    public String getNama() {
        return panggilan;
    }

    // setter
    public void setNama(String nama) {
        this.panggilan = nama;
    }

    public String getNamaAsli() {
        return nama;
    }
}