/* Nama File    : MBangunDatar.java
 * Deskripsi    : Main class untuk menguji MBangunDatar
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 17 Maret 2026 
 */

public class MBangunDatar {
    public static void main(String[] args) {

        BangunDatar P1 = new Persegi(4, "Merah", "Solid");
        Persegi P2 = new Persegi(5, "Biru", "Putus");

        BangunDatar L1 = new Lingkaran(7, "Kuning", "Solid");
        Lingkaran L2 = new Lingkaran(14, "Hijau", "Tebal");

        P1.printInfo();
        P2.printInfo();
        L1.printInfo();
        L2.printInfo();

        System.out.println("Luas P1 = P2? " + P1.isEqualLuas(P2));
        System.out.println("Keliling L1 = L2? " + L1.isEqualKeliling(L2));

        P2.zoomIn();
        P2.printInfo();

        L2.zoom(200);
        L2.printInfo();

        BangunDatar.printCounterBangunDatar();
    }
}
