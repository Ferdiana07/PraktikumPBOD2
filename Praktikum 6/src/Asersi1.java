/* Nama File    : Asersi1.java
 * Deskripsi    : Abstract class Asersi
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 24 Maret 2026 
 */

public class Asersi1{
    public static void main(String[] args){
        int x = 0;
        if(x>0){
            System.out.println("x adalah bilangan positif");
        }else{
            assert(x<0): "x adalah bilangan negatif";
            System.out.println("x adalah bilangan negatif");
        }
    }
}