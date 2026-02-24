/* Nama File    : MTitik.java
 * Deskripsi    : berisi atribut dan method dalam class titik
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 20 Februari 2026 
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik(3,-5);

        System.out.println("Jumlah objek titik yang telah dibuat: " + Titik.getCounterTitik());
        System.out.println("Jumlah objek titik yang telah dibuat: " + T2.getCounterTitik());

        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.geser(3,4);

        T1.printTitik();
        T2.printTitik();

        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Kuadran T2: " + T2.getKuadran());

        System.out.println("Jarak Pusat T1: " + T1.getJarakPusat());
        System.out.println("Jarak Pusat T2: " + T2.getJarakPusat());

        System.out.println("Jarak T1 dan T2: " + T1.getJarak(T2));
        System.out.println("Jarak T1 dan T2: " + T2.getJarak(T1));

        T1.RefleksiX();
        T2.RefleksiY();

        T1.printTitik();
        T2.printTitik();

        T1 = T1.getRefleksiX();
        T2 = T2.getRefleksiX();
        T1.printTitik();
        T2.printTitik();
        





        
    }
}