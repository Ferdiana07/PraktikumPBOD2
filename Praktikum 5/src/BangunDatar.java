/* Nama File    : BangunDatar.java
 * Deskripsi    : Abstract class BangunDatar
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 17 Maret 2026 
 */

public abstract class BangunDatar {
    private int jmlhSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;
    public abstract double getLuas();
    public abstract double getKeliling();

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlhSisi, String warna, String border){
        this.jmlhSisi = jmlhSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public int getjmlhSisi(){
        return jmlhSisi;
    }

    public void setjmlhSisi(int jmlhSisi){
        this.jmlhSisi = jmlhSisi;
    }

    public String getWarna(){
        return warna;
    }   

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi : " + jmlhSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek BangunDatar: " + counterBangunDatar);
    }
}