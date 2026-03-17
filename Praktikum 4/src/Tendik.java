/* Nama File    : Tendik.java
 * Deskripsi    : Main class untuk menguji Tendik
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 10 Maret 2026 
 */

import java.util.Calendar;
import java.util.Date;

public class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;

    public Tendik(String NIP, String nama, Date TanggalLahir, Date TMT,double gajiPokok, String bidang) {
        super(NIP, nama, TanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public int[] hitungMasaKerja() {
        Calendar now = Calendar.getInstance();
        Calendar tmt = Calendar.getInstance();
        tmt.setTime(GetTMT());

        int tahun = now.get(Calendar.YEAR) - tmt.get(Calendar.YEAR);
        int bulan = now.get(Calendar.MONTH) - tmt.get(Calendar.MONTH);

        if (bulan < 0) {
            tahun--;
            bulan += 12;
        }

        return new int[]{tahun, bulan};
    }

    public Date hitungTanggalPensiun() {
        Calendar pensiun = Calendar.getInstance();
        pensiun.setTime(GetTanggalLahir());
        pensiun.add(Calendar.YEAR, BUP);
        pensiun.add(Calendar.MONTH, 1);
        pensiun.set(Calendar.DAY_OF_MONTH, 1);
        return pensiun.getTime();
    }

    public double hitungTunjangan() {
        int[] masaKerja = hitungMasaKerja();
        return 0.01 * masaKerja[0] * GetGajiPokok();
    }

    @Override
    public void printInfo() {
        int[] mk = hitungMasaKerja();

        System.out.println("NIP : " + GetNIP());
        System.out.println("Nama : " + GetNama());
        System.out.println("Tanggal Lahir : " + formatTanggal(GetTanggalLahir()));
        System.out.println("TMT : " + formatTanggal(GetTMT()));
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + mk[0] + " tahun " + mk[1] + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun()));
        System.out.println("Gaji Pokok : " + GetGajiPokok());
        System.out.println("Tunjangan : " + hitungTunjangan());
    }
}
