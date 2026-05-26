/* Nama File    : LambdaList.java
 * Deskripsi    : Implementasi Lambda dengan List
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 26 Mei 2026
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswalist = new ArrayList<>();
        mahasiswalist.add("Caesar");
        mahasiswalist.add("Ferdiana"); 
        mahasiswalist.add("Suwandi");

        mahasiswalist.forEach((nama) -> System.out.println(nama));
    }
}