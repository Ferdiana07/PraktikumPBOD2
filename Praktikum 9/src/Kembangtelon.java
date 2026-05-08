/* Nama File    : Kembangtelon.java
 * Deskripsi    : Implementasi Kelas Kembangtelon
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 5 Mei 2026
 */

public class Kembangtelon extends Kucing {

    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + 
                " Kembangtelon bersuara meong nyaring");
    }
}