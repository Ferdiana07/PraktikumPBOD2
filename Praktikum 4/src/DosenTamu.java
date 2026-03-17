/* Nama File    : DosenTamu.java
 * Deskripsi    : Main class untuk menguji DosenTamu
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 10 Maret 2026 
 */

import java.util.Date;
import java.util.Calendar;

public class DosenTamu extends Pegawai {
    private String NIDK;
    private String fakultas;
    private Date tanggalAkhirKontrak;

    public DosenTamu(String NIP, String nama, Date TanggalLahir, Date TMT,double gajiPokok, String NIDK, String fakultas, Date tanggalAkhirKontrak) {
        super(NIP, nama, TanggalLahir, TMT, gajiPokok);
        this.NIDK = NIDK;
        this.fakultas = fakultas;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public int hitungSisaKontrak() {
        Calendar now = Calendar.getInstance();
        Calendar kontrak = Calendar.getInstance();
        kontrak.setTime(tanggalAkhirKontrak);

        int tahun = kontrak.get(Calendar.YEAR) - now.get(Calendar.YEAR);
        int bulan = kontrak.get(Calendar.MONTH) - now.get(Calendar.MONTH);

        return tahun * 12 + bulan;
    }

    public double hitungTunjangan() {
        return 0.025 * GetGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP : " + GetNIP());
        System.out.println("NIDK : " + NIDK);
        System.out.println("Nama : " + GetNama());
        System.out.println("Tanggal Lahir : " + formatTanggal(GetTanggalLahir()));
        System.out.println("TMT : " + formatTanggal(GetTMT()));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Sisa Kontrak : " + hitungSisaKontrak() + " bulan");
        System.out.println("Gaji Pokok : " + GetGajiPokok());
        System.out.println("Tunjangan : " + hitungTunjangan());
    }
}
