/* Nama File    : GenerikClass.java
 * Deskripsi    : Penerapan Generic pada keluarga Anabul
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 28 April 2026 
 */

// CLASS ANABUL
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

// CLASS KUCING (ditambah atribut bobot)
class Kucing extends Anabul {

    double bobot; // dalam kilogram

    Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    @Override
    void bersuara() {
        System.out.println(nama + " bersuara meong");
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan berjalan");
    }

    void tampilBobot() {
        System.out.println(nama + " memiliki bobot " + bobot + " kg");
    }
}

// CLASS ANGGORA
class Anggora extends Kucing {

    Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " Anggora bersuara meong lembut");
    }
}

// CLASS KEMBANGTELON 
class Kembangtelon extends Kucing {

    Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " Kembangtelon bersuara meong nyaring");
    }
}

// CLASS ANJING
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
        System.out.println(nama + " bergerak dengan berjalan");
    }
}

// CLASS BURUNG
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

// CLASS GENERIC DATUM
class Datum<T> {

    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        isi = isibaru;
    }
}

// CLASS MAIN
public class GenerikClass {
    public static void main(String[] args) {

        Anggora kucing1 = new Anggora("Milo", 3.5);
        Kembangtelon kucing2 = new Kembangtelon("Luna", 4.2);

        Datum<Anabul> datum1 = new Datum<>();
        Datum<Anabul> datum2 = new Datum<>();

        datum1.setIsi(kucing1);
        datum2.setIsi(kucing2);

        datum1.getIsi().bersuara();
        datum2.getIsi().bersuara();
        datum1.getIsi().bergerak();
        datum2.getIsi().bergerak();

        kucing1.tampilBobot();
        kucing2.tampilBobot();
    }
}