/* Nama File    : GenerikOperator.java
 * Deskripsi    : Implementasi Generik Operator Tukar dan Bobot2 menggunakan keluarga kelas Anabul
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 28 April 2026
 */


// CLASS OPERATOR GENERIK
class OperatorGenerik {
    public static <T> void Tukar(Datum<T> a,Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T extends Kucing>
    double Bobot2(T k1, T k2) {
        return k1.bobot + k2.bobot;
    }
}

// CLASS MAIN
public class GenerikOperator {
    public static void main(String[] args) {

        // TUKAR INTEGER
        Datum<Integer> a = new Datum<>();
        Datum<Integer> b = new Datum<>();

        a.setIsi(3);
        b.setIsi(6);

        System.out.println("Sebelum:");
        System.out.println("a = " + a.getIsi());
        System.out.println("b = " + b.getIsi());

        OperatorGenerik.Tukar(a, b);

        System.out.println("Sesudah:");
        System.out.println("a = " + a.getIsi());
        System.out.println("b = " + b.getIsi());


        // TUKAR STRING
        Datum<String> s1 = new Datum<>();
        Datum<String> s2 = new Datum<>();

        s1.setIsi("Jokowi");
        s2.setIsi("Prabowo");

        System.out.println("Sebelum:");
        System.out.println("s1 = " + s1.getIsi());
        System.out.println("s2 = " + s2.getIsi());

        OperatorGenerik.Tukar(s1, s2);

        System.out.println("Sesudah:");
        System.out.println("s1 = " + s1.getIsi());
        System.out.println("s2 = " + s2.getIsi());


        // TUKAR ANABUL
        Datum<Anabul> h1 = new Datum<>();
        Datum<Anabul> h2 = new Datum<>();

        h1.setIsi(new Anjing("Joko"));
        h2.setIsi(new Anggora("Milo", 3.5));

        System.out.println("Sebelum:");
        h1.getIsi().bersuara();
        h2.getIsi().bersuara();

        OperatorGenerik.Tukar(h1, h2);

        System.out.println("Sesudah:");
        h1.getIsi().bersuara();
        h2.getIsi().bersuara();


        // BOBOT2 KUCING
        Anggora k1 = new Anggora("Luna", 4.2);
        Kembangtelon k2 = new Kembangtelon("Mimi", 3.8);

        double total = OperatorGenerik.Bobot2(k1, k2);
        System.out.println("\nTotal bobot dua kucing = "+ total + " kg" );
    }
}