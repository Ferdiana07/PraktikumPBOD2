/* Nama File    : MMahasiswa.java
 * Deskripsi    : Main class untuk menguji MMahasiswa
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 203 Maret 2026 
 */

public class MMahasiswa{
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO","Pemrograman Berorientasi Objek",3);
        MataKuliah MBD = new MataKuliah("MBD","Manajemen Basis Data",3);
        Mahasiswa M1 = new Mahasiswa("Caesar","20051","Informatika");
        Dosen D1 = new Dosen("1234","Budi","Informatika");
        Kendaraan K1 = new Kendaraan("G1234","Motor");
        M1.setDosWal(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(MBD);
        M1.addMatkul(PBO);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah Sks Mata Kuliah = " + M1.getJumlahSks());

    }
}