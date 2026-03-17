/* Nama File    : Pegawai.java
 * Deskripsi    : Main class untuk menguji Pegawai
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 10 Maret 2026 
 */

import java.util.Date;
import java.text.SimpleDateFormat;



public class Pegawai {
    private String NIP;
    private String nama;
    private Date TanggalLahir;
    private Date TMT;
    private double gajiPokok;

    public Pegawai(){
    }

    public Pegawai(String NIP, String nama, Date TanggalLahir, Date TMT, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String GetNIP(){
        return NIP;
    }

    public void SetNIP(String NIP){
        this.NIP = NIP;
    }

    public String GetNama(){
        return nama;
    }

    public void SetNama(String nama){
        this.nama = nama;
    }

    public Date GetTanggalLahir(){
        return TanggalLahir;
    }

    public void SetTanggalLahir(Date TanggalLahir){
        this.TanggalLahir = TanggalLahir;
    }

    public Date GetTMT(){
        return TMT;
    }

    public void SetTMT(Date TMT){
        this.TMT = TMT;
    }

    public double GetGajiPokok(){
        return gajiPokok;
    }

    public void SetGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    protected String formatTanggal(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM yyyy");
        return sdf.format(date);
    }

    public void printInfo(){
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(TanggalLahir));
        System.out.println("TMT : " + formatTanggal(TMT));
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}
