/* Nama File    : Dosenn.java
 * Deskripsi    : Main class untuk menguji dosen
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 203 Maret 2026 
 */

public class Dosen {
    private String NIP;
    private String Nama;
    private String Prodi;

    public Dosen(){
        NIP = "-";
        Nama = "-";
        Prodi = "-";
    }

    public Dosen(String nip,String nama,String prodi){
        NIP = nip;
        Nama = nama;
        Prodi = prodi;
    }

    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return Nama;
    }

    public String getProdi(){
        return Prodi;
    }

    public void setNIP(String nip){
        NIP = nip;
    }

    public void setNama(String nama){
        Nama = nama;
    }

    public void setProdi(String prodi){
        Prodi = prodi;
    }

}
