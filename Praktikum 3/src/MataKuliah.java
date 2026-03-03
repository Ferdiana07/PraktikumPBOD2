/* Nama File    : MataKuliah.java
 * Deskripsi    : Main class untuk menguji MataKuliah
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 203 Maret 2026 
 */

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah(){
        idMatKul = "-";
        nama = "-";
        sks = 0;
    }

    public MataKuliah(String idMatKul, String namal, int sks){
        this.idMatKul = idMatKul;
        this.nama = namal;
        this.sks = sks;
    } 
    
    public String getIdMatKul(){
        return idMatKul;
    }   

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}
