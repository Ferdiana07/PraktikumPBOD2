/* Nama File    : BangunDatar.java
 * Deskripsi    : Main class untuk menguji BangunDatar
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 10 Maret 2026 
 */

public class BangunDatar {
    private int jmlhSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlhSisi, String warna, String border){
        this.jmlhSisi = jmlhSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
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
