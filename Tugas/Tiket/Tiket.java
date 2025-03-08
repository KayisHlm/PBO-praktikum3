/* Nama File    : Tiket.java
 * Deskripsi    : Berisi body dari file Tiket
 * Pembuat      : Kayis Hilmi Farih/24060123140152
 * Tanggal      : 8 Maret 2025
 */


package Tiket;

public class Tiket {
	public static void pesanJumlahTiket(int jumlahTiket) {
 		// Asumsi jumlah tiket yang tersedia (boleh diganti)
     int tiketTersedia = 150;

     // To DO : Assertion untuk memastikan jumlah pemesanan lebih dari 0
        assert(jumlahTiket>0):"Jumlah pemesanan harus lebih dari 0"; 
   	
    // To Do : Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
        assert(jumlahTiket<=tiketTersedia):"Jumlah pemesanan tidak boleh melebihi tiket yang tersedia";

   	System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }

	public static void isEWallet(int EWallet) {
        
 		// To Do : Memeriksa apakah index e-wallet yang dipilih valid
         if (EWallet<1 || EWallet >4) {
            System.out.println("Pilihan e-wallet tidak valid");
         }
         // To Do : Assertion untuk memastikan e-wallet yang dipilih valid
         assert(EWallet>=1 && EWallet<=4):"Pilihan e-wallet tidak valid";

     System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

	private static String getEWallet(int index) {
            return switch (index) {
                case 1 -> "OVO";
                case 2 -> "GoPay";
                case 3 -> "DANA";
                case 4 -> "LinkAja";
                default -> "";
            };
	}
}
