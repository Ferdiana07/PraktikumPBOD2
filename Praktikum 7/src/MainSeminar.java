/* Nama File    : MainSeminar.java
 * Deskripsi    : program utama untuk simulasi seminar
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 21 April 2026 
 */

public class MainSeminar {

    public static void main(String[] args) {

        // Membuat objek dosen
        Dosen d1 = new Dosen("Pak Aris", "D001");
        Dosen d2 = new Dosen("Pak Edy", "D002");

        // Membuat objek mahasiswa
        Mahasiswa m1 = new Mahasiswa("Slamet", "M001");
        Mahasiswa m2 = new Mahasiswa("Dudung", "M002");
        Mahasiswa m3 = new Mahasiswa("Eka", "M003");
        Mahasiswa m4 = new Mahasiswa("Mutia", "M004");
        Mahasiswa m5 = new Mahasiswa("Ferdi", "M005");

        // Set dosen wali
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        // Membuat seminar
        Seminar sem = new Seminar();

        // Registrasi peserta
        sem.registrasi(d1);
        sem.registrasi(d2);
        sem.registrasi(m1);
        sem.registrasi(m2);
        sem.registrasi(m3);
        sem.registrasi(m4);
        sem.registrasi(m5);

        // Menampilkan jumlah peserta
        System.out.println("Jumlah Peserta : " + sem.countPeserta());
        System.out.println();

        // Menampilkan daftar peserta
        sem.tampilPeserta();
        System.out.println();

        // Menampilkan jumlah mahasiswa
        System.out.println("Jumlah Mahasiswa : " + sem.countMahasiswa());
        System.out.println();

        System.out.println("=== DATA MAHASISWA ===");
        m1.tampilDataMahasiswa();
        System.out.println();
        m2.tampilDataMahasiswa();
        System.out.println();
        m3.tampilDataMahasiswa();
        System.out.println();
        m4.tampilDataMahasiswa();
        System.out.println();
        m5.tampilDataMahasiswa();
    }
}

// KESIMPULAN
// Polimorfisme adalah konsep dalam pbo yang memungkinkan satu method memiliki banyak perilaku berbeda tergantung pada tipe data atau objek yang digunakan.
// Cara kerjanya bisa dengan overloading yaitusatu method dapat memiliki nama yang sama tetapi parameter berbeda.
// Selain itu ada juga coercion yaitu perubahan tipe data dari satu bentuk ke bentuk lain misalnya dari string menjadi integer.
// ada juga inclusion yaitu objek dari kelas turunan dapat digunakan sebagai objek dari kelas induk.