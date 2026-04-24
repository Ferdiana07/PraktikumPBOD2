/* Nama File    : Coercion.java
 * Deskripsi    : class Coercion
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 21 April 2026 
 */

public class Coercion {
    public static void main(String[] args) {

        int nilai = 65;
        System.out.println("Integer : " + nilai);
        char huruf = (char) nilai;
        System.out.println("Char : " + huruf);
        double real = (double) nilai;
        System.out.println("Double : " + real);

        int bilanganInt = 75;
        double bilanganReal = (double) bilanganInt;
        int bilanganIntBaru = (int) bilanganReal;
        System.out.println("Double : " + bilanganIntBaru);


        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("S : " + S);
        System.out.println("Z : " + Z);

        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("R : " + R);
        System.out.println("D : " + D);

        Integer A = Integer.parseInt(S);
        System.out.println("A : " + A);

        String T = A.toString();
        System.out.println("T : " + T);
    }
}