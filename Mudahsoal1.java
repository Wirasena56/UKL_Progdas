import java.util.Scanner;
public class Mudahsoal1 {

    public static void main (String[]args){
    Scanner input = new Scanner (System.in);
    
    int hargaminimjarak = 4000;
    int hargajarak1070 = 5000;
    int hargaplusjarak = 6000;
    int Biayavolume= 50000;
    int volume= 100;

    //Memasukkan input (berat,jarak tempuh,panjang,lebar,tinggi)
    System.out.println("Masukkan Berat Paket");
    int beratpaket = input.nextInt();

    System.out.println("Masukkan jarak tempuh Paket");
    int jaraktempuh = input.nextInt();

    System.out.println("Masukkan panjang Paket");
    int panjang = input.nextInt();

    System.out.println("Masukkan lebar Paket");
    int lebar = input.nextInt();

    System.out.println("Masukkan tinggi Paket");
    int tinggi = input.nextInt();

    //Proses menghitung Volume
        int resultvolume = panjang*lebar*tinggi;
        
        System.out.println("==== Detail Total Paket ===");
       // Proses menghitung biaya jarak

       // Biaya untuk jarak kurang dari 10 km
       int biayaJarak = 0;
        if (jaraktempuh < 10) {
            System.out.println("Info: Jarak anda kurang dari 10 km, biaya per kg adalah Rp. 4000");
            biayaJarak = jaraktempuh * hargaminimjarak * beratpaket; 
        } 
        
        // Biaya untuk jarak antara 10 km hingga 70 km
        else if (jaraktempuh <= 70) {
            System.out.println("Info: Jarak anda antara 10 km hingga 70 km, biaya per kg adalah Rp. 5000");
            biayaJarak = jaraktempuh * hargajarak1070 * beratpaket; 
        } 
        
        // Biaya untuk jarak lebih dari 70 km
        else {
            System.out.println("Info: Jarak anda lebih dari 70 km, biaya per kg adalah Rp. 6000");
            biayaJarak = jaraktempuh * hargaplusjarak * beratpaket; 
        }

       // Proses menghitung biaya volume
        int biayaVolume = 0;
       if (resultvolume > volume) {
        System.out.println("Info: Volume paket anda melebihi 100 cm3, ada tambahan biaya sebesar Rp. 50.000");

          biayaVolume = resultvolume += Biayavolume; 
       } 

       // Menghitung total biaya
       int totalBiaya = biayaJarak + biayaVolume;
        // Output hasil
        System.out.println("====== Total Akhir =======");
        System.out.println("\n1. Biaya Jarak: Rp " + biayaJarak);
        System.out.println("2. Volume Paket Anda: " + resultvolume + " cm3");
        System.out.println("4. Total Biaya Pengiriman: Rp " + totalBiaya);
        System.out.println("========================");
    }
}
    // jarak tempuh < 10 biaya 4000
    // jarak tempuh 10 - 70 biaya 5000
    // jarak tempuh > 70 biaya 6000
    


    
    
