/* Nama File    : Anjing.java
 * Deskripsi    : Implementasi Kelas Anjing
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 5 Mei 2026
 */

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara guk guk");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan berjalan");
    }
}