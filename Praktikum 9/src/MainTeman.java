/* Nama File    : MainTeman.java
 * Deskripsi    : Implementasi Main Koleksi Kelas Dasar
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 5 Mei 2026
 */

public class MainTeman {
    public static void main(String[] args) {
        // Kamus
        Teman T;
        String Teman1;
        String Teman2;
        String Teman3;
        String Teman4;
        String Teman5;
        String Teman6;
        String Teman7;
        String Teman8;
        String Teman9;
        String Teman10;
        String Teman11;
        String Teman12;
        String Teman13;
        String Teman14;
        String Teman15;
        String Teman16;
        String Teman17;
        String Teman18;
        String Teman19;
        String Teman20;
        String Teman5_New;

        // Algoritma
        T = new Teman();
        Teman1 = "Ali";
        Teman2 = "Azka";
        Teman3 = "Basil";
        Teman4 = "Caesar";
        Teman5 = "Crystiano";
        Teman6 = "Devano";
        Teman7 = "Dinda";
        Teman8 = "Elza";
        Teman9 = "Ferdy";
        Teman10 = "Ghatfan";
        Teman11 = "Hanif";
        Teman12 = "Hasta";
        Teman13 = "Izzatu";
        Teman14 = "Marchella";
        Teman15 = "Menza";
        Teman16 = "Andhika";
        Teman17 = "Lutfi";
        Teman18 = "Naufal Dwi";
        Teman19 = "Naufal Rayan";
        Teman20 = "Novelya";
        Teman5_New = "Bayu";

        System.out.println("NBElement : " + T.getNbelm());

        T.addNama(Teman1);
        T.addNama(Teman2);
        T.addNama(Teman3);
        T.addNama(Teman4);
        T.addNama(Teman5);
        T.addNama(Teman6);
        T.addNama(Teman7);
        T.addNama(Teman8);
        T.addNama(Teman9);
        T.addNama(Teman10);

        System.out.println("Nama Teman 1 : " + T.getNama(1));
        System.out.println("Apakah Ferdy merupakan teman : " + T.isMember("Ferdy"));
        System.out.println("NBElement Sekarang : " + T.getNbelm());

        T.addNama(Teman11);
        T.addNama(Teman12);
        T.addNama(Teman13);
        T.addNama(Teman14);
        T.addNama(Teman15);
        T.addNama(Teman16);
        T.addNama(Teman17);
        T.addNama(Teman18);
        T.addNama(Teman19);
        T.addNama(Teman20);

        System.out.println("Count Nama Azka : " + T.countNama("Azka"));
        System.out.println("Count Nama Ferdy : " + T.countNama("Ferdy"));

        System.out.println("Set Nama Teman ke 2 menjadi 'Azka (Update)'");
        T.setNama(2, "Azkha");

        System.out.println("Ganti Nama Crystiano Menjadi Bayu");
        T.gantiNama(Teman5, Teman5_New);

        System.out.println("Seluruh teman sekarang : ");
        T.showTeman();

        System.out.println("Delete Azkha");
        T.delNama("Azkha");

        System.out.println("Seluruh teman setelah delete : ");
        T.showTeman();
        System.out.println("NBElement Akhir : " + T.getNbelm());
    }
}
