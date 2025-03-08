/* Nama File    : Asersi2.java
 * Deskripsi    : Berisi main dari class Menu dan Pesanan
 * Pembuat      : Kayis Hilmi Farih/24060123140152
 * Tanggal      : 8 Maret 2025
 */

class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
}


public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}


// Jawaban
/*
 * Secara konsep, penggunaan asersi diatas adalah saah. Mengapa ?
 * Karena pengaturan kondisi pada asersi yang dimasukkan adalah salah.
 * asersi akan aktif jika kondisi yang diatur dalam asersi tersebut terpenuhi.
 * 
 * Ouput dari asersi tersebut menunjukkan bahwa "jari jari tidak boleh nol!!!"
 * sedangkan kondisi yang harus terpenuhi adalah jari jari > 0.
 * Hal ini menyalahi aturan bahwa kondisi assertion dan output yang dikeluarkan sangat bertolakbelakang
 * 
 * Perbaikan yang perlu dilakukan adalah dengan menggati kondisi asseri
 * menjadi jariJari == 0
 */