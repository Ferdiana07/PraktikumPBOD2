/* Nama File    : GenerikLarik.java
 * Deskripsi    : Implementasi Generik Operator Tukar dan Bobot2 menggunakan keluarga kelas Anabul
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 28 April 2026
 */

// CLASS DATA GENERIK
class Data<T> {

    private T[] ruang;
    private int banyak;

    Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    // setIsi
    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= 100) {
            ruang[posisi - 1] = objek;
            if (posisi > banyak) {
                banyak = posisi;
            }

        } else {
            System.out.println(
                "Posisi harus 1 sampai 100"
            );
        }
    }

    // getIsi
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= banyak) {
            return ruang[posisi - 1];

        } else {
            return null;
        }
    }

    // getSize
    public int getSize() {
        return banyak;
    }
}


// CLASS MAIN
public class GenerikLarik {
    public static void main(String[] args) {
        
        Data<Anabul> dataAnabul = new Data<>();

        // APLIKASI setIsi
        dataAnabul.setIsi(1,new Anjing("Joko"));
        dataAnabul.setIsi(2,new Anggora("Milo", 3.5));
        dataAnabul.setIsi(3,new Burung("Tata"));
        dataAnabul.setIsi(4,new Kembangtelon("Mimi", 4.0));

        // APLIKASI getIsi
        System.out.println("Isi Data Anabul");
        for (int i = 1;i <= dataAnabul.getSize();i++) {
            Anabul a = dataAnabul.getIsi(i);
            if (a != null) {
                a.bersuara();
            }
        }

        // APLIKASI getSize
        System.out.println("\nJumlah elemen = " + dataAnabul.getSize());
    }
}

//KESIMPULAN
//Konsep generik bekerja dengan cara membuat class atau method yang bisa digunakan untuk berbagai tipe data tanpa harus menulis ulang kode. 
// Dengan generik tipe data ditentukan saat objek dibuat sehingga program menjadi lebih fleksibel dan aman dari kesalahan tipe data. 
// Misalnya pada class Generik<T> tipe T bisa diisi objek apa saja seperti Integer, String, atau objek Anabul sehingga satu class bisa dipakai untuk banyak kebutuhan tanpa membuat class baru.