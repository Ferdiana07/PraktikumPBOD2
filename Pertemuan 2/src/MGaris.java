/* Nama File    : MGaris.java
 * Deskripsi    : Main class untuk menguji class Garis
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 27 Februari 2026 
 */

public class MGaris {
    public static void main(String[] args) {

        Titik T1 = new Titik(1, 2);
        Titik T2 = new Titik(4, 6);
        Titik T3 = new Titik(2, 3);
        Titik T4 = new Titik(5, 7);
        Titik T5 = new Titik(-2, 0);
        Titik T6 = new Titik(0, 4);

        Garis G1 = new Garis(T1,T2);
        Garis G2 = new Garis(T3,T4);
        Garis G3 = new Garis();
        Garis G4 = new Garis(T5,T6);

        System.out.println("Jumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
        System.out.println("Jumlah objek Garis yang telah dibuat: " + G1.getCounterGaris());

        System.out.println("\nPanjang G1: " + G1.PanjangGaris(G1));
        System.out.println("Panjang G2: " + G2.PanjangGaris(G2));
        System.out.println("Panjang G3: " + G2.PanjangGaris(G3));

        System.out.println("\nGradien G1: " + G1.gradien(G1));
        System.out.println("Gradien G2: " + G2.gradien(G2));

        Titik tengah1 = G1.getTengah(G1);
        System.out.println("\nTitik Tengah G1 : (" + tengah1.absis + ", " + tengah1.ordinat + ")");
        Titik tengah2 = G2.getTengah(G2);
        System.out.println("Titik Tengah G2 : (" + tengah2.absis + ", " + tengah2.ordinat + ")");

        System.out.println("\nApakah G1 dan G2 sejajar:" + G1.CekSejajar(G1, G2));
        System.out.println("Apakah G1 dan G2 tegak lurus: " + G1.CekTegakLurus(G1, G2));

        G1.TampilTitik(G1);
        G2.TampilTitik(G2);

        G1.TampilPersamaan(G1);
        G2.TampilPersamaan(G4);
    }
}