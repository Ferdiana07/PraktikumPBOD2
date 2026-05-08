/* Nama File    : GenerikAnabul.java
 * Deskripsi    : Implementasi Main GenerikAnabul
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 5 Mei 2026
 */

public class GenerikAnabul{

    public static void main(String[] args) {

        // objek hewan
        Anggora kucing1 = new Anggora("Joko", 3.5);
        Kembangtelon kucing2 = new Kembangtelon("Owo", 4.2);
        Anjing anjing1 = new Anjing("Teddy");
        Burung burung1 = new Burung("Bahlil");

        // objek piaraan
        Piaraan klinik = new Piaraan(10);

        // enqueue
        klinik.enqueueAnabul(kucing1);
        klinik.enqueueAnabul(kucing2);
        klinik.enqueueAnabul(anjing1);
        klinik.enqueueAnabul(burung1);

        // tampil anabul
        klinik.showAnabul();

        System.out.println();

        // tampil jenis
        klinik.showJenisAnabul();

        System.out.println();

        // jumlah kucing
        System.out.println("Jumlah keluarga kucing : "+ klinik.countKucing());

        // total bobot
        System.out.println("Total bobot kucing : "+ klinik.bobotKucing() + " kg");
        System.out.println();

        // cek member
        System.out.println("Apakah Joko ada di antrean? "+ klinik.isMember(kucing1));

        // get anabul pertama
        System.out.println("Anabul pertama : "+ klinik.getAnabul().getNama());

        // dequeue
        Anabul keluar = klinik.dequeueAnabul();

        System.out.println("Anabul keluar : "+ keluar.getNama());

        System.out.println();

        // tampil antrean akhir
        klinik.showAnabul();
    }
}

/* Konsep koleksi bekerja dengan cara menyimpan banyak objek dalam satu wadah agar lebih mudah diatur dan diproses. 
Pada program ini koleksi dipakai untuk menyimpan antrean hewan sehingga data bisa ditambah, dicek, diambil, dan dihapus dengan lebih rapi dan efisien */