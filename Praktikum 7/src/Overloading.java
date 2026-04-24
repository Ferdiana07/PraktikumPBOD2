/* Nama File    : Overloading.java
 * Deskripsi    : Penerapan Overloading
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 21 April 2026 
 */

public class Overloading {
    String NIM;
    String Nama;
    String ProgramStudi;


    Overloading() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    Overloading(String nim, String nama, String prodi) {
        this.NIM = nim;
        this.Nama = nama;
        this.ProgramStudi = prodi;
    }

    Overloading(Overloading mhsLain) {
        this.NIM = mhsLain.NIM;
        this.Nama = mhsLain.Nama;
        this.ProgramStudi = mhsLain.ProgramStudi;
    }



    void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    void setProgramStudi(Overloading mhsLain) {
        this.ProgramStudi = mhsLain.ProgramStudi;
    }

    void tampilData() {
        System.out.println("NIM  : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Prodi: " + ProgramStudi);
        System.out.println("-----------------------");
    }


    public static void main(String[] args) {
        Overloading m1 = new Overloading();
        System.out.println("Objek m1");
        m1.tampilData();


        Overloading m2 = new Overloading("240601224120051","Budi","Informatika");
        System.out.println("Objek m2");
        m2.tampilData();

        Overloading m3 = new Overloading(m2);
        System.out.println("Objek m3 (Cloning dari m2)");
        m3.tampilData();

        m1.setProgramStudi();
        System.out.println("m1 setelah setProgramStudi()");
        m1.tampilData();

        m1.setProgramStudi("Sistem Informasi");
        System.out.println("m1 setelah setProgramStudi(String)");
        m1.tampilData();

        m1.setProgramStudi(m2);
        System.out.println("m1 setelah setProgramStudi(Mahasiswa)");
        m1.tampilData();
    }
}