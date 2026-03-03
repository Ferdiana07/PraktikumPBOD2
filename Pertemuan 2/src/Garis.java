/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 27 Februari 2026 
 */

public class Garis {

    Titik T1;
    Titik T2;
    static int countergaris;

    Garis(){
        T1 = new Titik(0,0);
        T2 = new Titik(1,1);
        countergaris++;
    }

    Garis(Titik Titik1,Titik Titik2){
        this.T1 = Titik1;
        this.T2 = Titik2;
        countergaris++;
    }

    Titik getT1(){
        return T1;
    }

    Titik getT2(){
        return T2;
    }

    void setT1(Titik TA){
        T1 = TA;
    }

    void setT2(Titik TA){
        T2 = TA;
    }

    double PanjangGaris(Garis G1){
        return Math.sqrt(Math.pow((G1.getT2().absis - G1.getT1().absis),2) + Math.pow((G1.getT2().ordinat - G1.getT1().ordinat),2));
    }

    double gradien(Garis G1){
        return (G1.getT2().ordinat - G1.getT1().ordinat) / (G1.getT2().absis - G1.getT1().absis);
    }

    Titik getTengah(Garis G1){
        double x = (G1.getT1().absis + G1.getT2().absis) / 2;
        double y = (G1.getT1().ordinat + G1.getT2().ordinat) / 2;
        Titik T3 = new Titik(x,y);
        return T3;
    }

    boolean CekSejajar(Garis G1,Garis G2){
        if (gradien(G1) == gradien(G2) ){
            return true;
        }else{
            return false;
        }
    }

    boolean CekTegakLurus(Garis G1,Garis G2){
        if (gradien(G1) * gradien(G2) == -1 ){
            return true;
        }else{
            return false;
        }
    }

    void TampilTitik(Garis G1){
        System.out.println("Titik Awal: (" + 
            G1.getT1().absis + ", " + 
            G1.getT1().ordinat + ")");

        System.out.println("Titik Akhir: (" + 
            G1.getT2().absis + ", " + 
            G1.getT2().ordinat + ")");
    }

    void TampilPersamaan(Garis G1){
        double M = gradien(G1);
        double C = (G1.getT1().ordinat - (M * G1.getT1().absis));
        System.out.println("y = " + M +"x + " + C);
    }

    static int getCounterGaris(){
        return countergaris;
    }

}
