/* Nama File    : InclusionAnabul.java
 * Deskripsi    : Penerapan Inclusion dengan kelas Anabul, Kucing, Anjing, dan Burung
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 21 April 2026 
 */
//CLASS ANABUL
class Anabul {
    String nama;

    Anabul(String nama) {
        this.nama = nama;
    }

    void bersuara() {
        System.out.println(nama + " mengeluarkan suara.");
    }

    void bergerak() {
        System.out.println(nama + " sedang bergerak.");
    }
}

//CLASS KUCING
class Kucing extends Anabul {

    Kucing(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " bersuara meong");
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
}

//CLASS ANJING
class Anjing extends Anabul {

    Anjing(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " bersuara guk guk");
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
}

//CLASS BURUNG
class Burung extends Anabul {

    Burung(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " bersuara cuit");
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }
}


public class InclusionAnabul {
    public static void main(String[] args) {

        Anabul kucing = new Kucing("Slamet");
        Anabul anjing = new Anjing("Joko");
        Anabul burung = new Burung("Tata");

        kucing.bersuara();
        anjing.bersuara();
        burung.bersuara();

        kucing.bergerak();
        anjing.bergerak();
        burung.bergerak();
    }
}