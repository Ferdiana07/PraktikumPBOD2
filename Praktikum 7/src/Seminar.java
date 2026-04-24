/* Nama File    : Seminar.java
 * Deskripsi    : class Seminar yang memiliki array CivitasAkademika sebagai peserta seminar
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 21 April 2026 
 */

public class Seminar {
    private CivitasAkademika[] peserta = new CivitasAkademika[100];
    private int banyakPeserta;


    public Seminar() {
        banyakPeserta = 0;
    }

    public void registrasi(CivitasAkademika p) {
        if (banyakPeserta < peserta.length) {
            peserta[banyakPeserta] = p;
            banyakPeserta++;

        } else {
            System.out.println("Seminar penuh!");
        }
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void tampilPeserta() {
        System.out.println("=== DAFTAR PESERTA SEMINAR ===");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println("Peserta ke-" + (i + 1));
            System.out.println("Nomor : " + peserta[i].getNomor());
            System.out.println("Nama  : " + peserta[i].getNama());
            System.out.println("---------------------------");
        }
    }

    public int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (peserta[i] instanceof Mahasiswa) {
                jumlah++;
            }
        }
        return jumlah;
    }

}