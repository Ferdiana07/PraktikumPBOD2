/* Nama File    : Anggora.java
 * Deskripsi    : Implementasi Kelas Anggora
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 5 Mei 2026
 */

public class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " Anggora bersuara meong lembut");
    }
}