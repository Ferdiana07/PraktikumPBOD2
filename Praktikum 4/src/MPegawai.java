/* Nama File    : MPegawai.java
 * Deskripsi    : Main class untuk menguji Pegawai
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 10 Maret 2026 
 */

import java.util.Date;
import java.util.Calendar;

public class MPegawai {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(1990, Calendar.MAY, 5);
        Date tglLahir1 = cal1.getTime();
        cal1.set(2015, Calendar.JANUARY, 1);
        Date tmt1 = cal1.getTime();
        DosenTetap dt = new DosenTetap("9545647548","Andi",tglLahir1,tmt1,5000000,"78647324","Fakultas Sains dan Matematika");


        Calendar cal2 = Calendar.getInstance();
        cal2.set(1985, Calendar.MARCH, 10);
        Date tglLahir2 = cal2.getTime();
        cal2.set(2020, Calendar.JUNE, 1);
        Date tmt2 = cal2.getTime();
        cal2.set(2027, Calendar.DECEMBER, 31);
        Date kontrak = cal2.getTime();
        DosenTamu dta = new DosenTamu("11223344","Budi",tglLahir2,tmt2,4000000,"998877","Fakultas Teknik",kontrak);


        Calendar cal3 = Calendar.getInstance();
        cal3.set(1992, Calendar.APRIL, 15);
        Date tglLahir3 = cal3.getTime();
        cal3.set(2018, Calendar.FEBRUARY, 1);
        Date tmt3 = cal3.getTime();
        Tendik tk = new Tendik("55667788","Siti",tglLahir3,tmt3,3500000,"Akademik");

        System.out.println("===== DOSEN TETAP =====");
        dt.printInfo();
        System.out.println("\n===== DOSEN TAMU =====");
        dta.printInfo();
        System.out.println("\n===== TENDIK =====");
        tk.printInfo();
    }
}
