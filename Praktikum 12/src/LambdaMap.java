/* Nama File    : LambdaMap.java
 * Deskripsi    : Implementasi Lambda dengan Map 
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 26 Mei 2026
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {

        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("24060124120051", "Caesar");
        mahasiswaMap.put("24060124120052", "Ferdiana");
        mahasiswaMap.put("24060124120053", "Suwandi");

        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println();
        });
    }
}