/* Nama File    : AngkaSial.java
 * Deskripsi    : Berisi body dari file AngkaSial
 * Pembuat      : Kayis Hilmi Farih/24060123140152
 * Tanggal      : 8 Maret 2025
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws  AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial !");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!!!");
        }
    }
}

// Jawaban //
/* 
 * baris 12 akan tetap dieksekusi. Hal ini terjadi karena
 * angka 10 tidak termasuk dalam angka yang dilarang oleh exception.
 * Angka yang dilarang oleh exception adalah angka 13, yang dimana itu 
 * tepat berada pada baris 19, sedangkan angka 10 berada pada baris 18.
 * Otomatis yang akan dijalankan dulu adalah yang angka 10. Setelah dicek
 * menggunakan fungsi yang telah dibuat, outputnya adalah "10 bukan angka sial"
 * 
 * baris 21 akan tetap dieksekusi karena error yang terjadi pada baris ke 19
 * dimana angka 13 adalah angka yang men-trigger exception yang telah ditentukan
 */