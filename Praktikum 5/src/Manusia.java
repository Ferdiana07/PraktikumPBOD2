/* Nama File    : Manusia.java
 * Deskripsi    : Abstract class Manusia
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 17 Maret 2026 
 */

import java.time.LocalDate;
import java.time.Period;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // Constructor lengkap
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Constructor tanpa alamat
    public Manusia(String nama, LocalDate tgl_mulai_kerja, double pendapatan) {
        this(nama, tgl_mulai_kerja, "", pendapatan);
        counterMns++;
    }

    // Getter & Setter
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    // Hitung masa kerja (abstract)
    public abstract int hitungMasaKerja();

    // Cetak info
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    // Helper hitung selisih tahun
    protected int hitungTahunKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
    }
}
