/* Nama File    : Mahasiswa.java
 * Deskripsi    : Main class untuk menguji mahasiswa
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 203 Maret 2026 
 */
import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String NIM;
    private String Prodi;
    ArrayList<MataKuliah> listMatkul;
    private DosenTetap DosenWali;
    private Kendaraan Kendaraan;

    public Mahasiswa(){
        this.listMatkul = new ArrayList<MataKuliah>();
    }

    public Mahasiswa(String Nama,String nim,String prodi){
        nama = Nama;
        NIM = nim;
        Prodi = prodi;
        this.listMatkul = new ArrayList<MataKuliah>();
    }

    public String getNama(){
        return nama;
    }

    public String getNIM(){
        return NIM;
    }

    public String getProdi(){
        return Prodi;
    }

    public DosenTetap getDosenWali() {
        return DosenWali;
    }

    public Kendaraan getKendaraan() {
        return Kendaraan;
    }

    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void setProdi(String prodi){
        this.Prodi = prodi;
    }

    public void setDosWal(DosenTetap dosenwali){
        this.DosenWali = dosenwali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.Kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah newMatKul){
        this.listMatkul.add(newMatKul);
    }

    public int getJumlahSks(){
        int total = 0;
        for (int i = 0;i < listMatkul.size();i++){
            total += listMatkul.get(i).getSks();
        }
        return total;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();   
    }

    void printMhs() {
        System.out.println("NIM:" + NIM);
        System.out.println("Nama:" + nama);
        System.out.println("Prodi:" + Prodi);
    }

    void printDetailMhs(){
        System.out.println("NIM:" + NIM);
        System.out.println("Nama:" + nama);
        System.out.println("Prodi:" + Prodi);
        System.out.println("Dosen Wali: " + DosenWali.getNama()); 
        System.out.println("Kendaraan: " + Kendaraan.getJenis()); 
        
        for(int i = 0;i < listMatkul.size();i++){
            System.out.println("Mata Kuliah: ");
            System.out.println(listMatkul.get(i).getNama());
        }
    }

}
