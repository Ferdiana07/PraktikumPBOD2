/* Nama File    : DosenTetap.java
 * Deskripsi    : Class turunan Pegawai untuk Dosen Tetap
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 10 Maret 2026 
 */

import java.util.Date;
import java.util.Calendar;

public class DosenTetap extends Pegawai {

    private String NIDN;
    private String fakultas;
    private final int BUP = 65;

    public DosenTetap(String NIP, String nama, Date TanggalLahir,Date TMT, double gajiPokok,String NIDN, String fakultas) {
        super(NIP, nama, TanggalLahir, TMT, gajiPokok);
        this.NIDN = NIDN;
        this.fakultas = fakultas;
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
        int tahun = masaKerja[0]; // hanya tahun
        return 0.02 * tahun * GetGajiPokok();
    }

    @Override
    public void printInfo() {
        int[] mk = hitungMasaKerja();
        System.out.println("NIP : " + GetNIP());
        System.out.println("NIDN : " + NIDN);
        System.out.println("Nama : " + GetNama());
        System.out.println("Tanggal Lahir : " + formatTanggal(GetTanggalLahir()));
        System.out.println("Tanggal Masuk : " + formatTanggal(GetTMT()));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Masa Kerja : " + mk[0] + " tahun " + mk[1] + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(hitungTanggalPensiun()));
        System.out.println("Gaji Pokok : Rp " + GetGajiPokok());
        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}