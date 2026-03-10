/* Nama File    : MBangunDatar.java
 * Deskripsi    : Main class untuk menguji MBangunDatar
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 10 Maret 2026 
 */

public class MBangunDatar {
    public static void main(String[] args) {            
        Persegi P1 = new Persegi(4, "Merah", "Solid");
        Persegi P2 = new Persegi(4, "Biru", "Solid");
        Lingkaran L1 = new Lingkaran(5, "Kuning", "Solid");
        Lingkaran L2 = new Lingkaran(10, "Hijau", "Solid");

        System.out.println("Info P1: ");
        P1.printInfo();
        System.out.println("Info P2: ");
        P2.printInfo();
        System.out.println("Info L1: ");
        L1.printInfo();
        System.out.println("Info L2: ");
        L2.printInfo();

        BangunDatar.printCounterBangunDatar();
    }
}
