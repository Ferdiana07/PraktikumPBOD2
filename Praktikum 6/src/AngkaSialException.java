/**
 * File : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 24 Maret 2026 
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}