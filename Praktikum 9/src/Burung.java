/* Nama File    : Burung.java
 * Deskripsi    : Implementasi Kelas Burung
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 5 Mei 2026
 */

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara cuit");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan terbang");
    }
}