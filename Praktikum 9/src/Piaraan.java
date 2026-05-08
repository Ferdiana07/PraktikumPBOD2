/* Nama File    : Piaraan.java
 * Deskripsi    : Implementasi Kelas Piaraan
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 5 Mei 2026
 */

public class Piaraan {

    private int nbelm;
    private Anabul[] Lanabul;

    // konstruktor
    public Piaraan(int ukuran) {
        Lanabul = new Anabul[ukuran];
        nbelm = 0;
    }

    // getter jumlah elemen
    public int getNbelm() {
        return nbelm;
    }

    // enqueue
    public void enqueueAnabul(Anabul anabul) {

        if (nbelm < Lanabul.length) {
            Lanabul[nbelm] = anabul;
            nbelm++;
        }

        else {
            System.out.println("Antrean penuh!");
        }
    }

    // cek member
    public boolean isMember(Anabul anabul) {

        for (int i = 0; i < nbelm; i++) {

            if (Lanabul[i] == anabul) {
                return true;
            }
        }

        return false;
    }

    // ambil elemen pertama
    public Anabul getAnabul() {

        if (nbelm > 0) {
            return Lanabul[0];
        }

        return null;
    }

    // dequeue
    public Anabul dequeueAnabul() {

        if (nbelm == 0) {
            return null;
        }

        Anabul keluar = Lanabul[0];

        for (int i = 0; i < nbelm - 1; i++) {
            Lanabul[i] = Lanabul[i + 1];
        }

        Lanabul[nbelm - 1] = null;
        nbelm--;

        return keluar;
    }

    // tampil anabul
    public void showAnabul() {

        System.out.println("DAFTAR ANABUL :");

        for (int i = 0; i < nbelm; i++) {
            System.out.println((i + 1) + ". " + Lanabul[i].getNama());
        }
    }

    // hitung keluarga kucing
    public int countKucing() {

        int jumlah = 0;

        for (int i = 0; i < nbelm; i++) {

            if (Lanabul[i] instanceof Kucing) {
                jumlah++;
            }
        }

        return jumlah;
    }

    // total bobot kucing
    public double bobotKucing() {

        double total = 0;

        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] instanceof Kucing) {
                total = total + ((Kucing) Lanabul[i]).getBobot();
            }
        }

        return total;
    }

    // tampil jenis anabul
    public void showJenisAnabul() {
        System.out.println("JENIS ANABUL :");
        for (int i = 0; i < nbelm; i++) {
            System.out.println(Lanabul[i].getNama()+ " => "+ Lanabul[i].getClass().getName()
            );
        }
    }
}