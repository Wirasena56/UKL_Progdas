import java.util.Scanner;
public class MudahSoal3 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        //looping
        System.out.println("Masukkan angka: ");
        
        for (int i = input.nextInt();  i > 0 ; i--){
           
        //kalimat khusus untuk dimasukkan di looping
        if (i % 3 == 0) {
            System.out.println(i + ". Saya angkatan 33");
        }

        else if (i % 2 == 0){
            System.out.println(i +". Saya anak moklet");
        }

        else if (i == 1) {
            System.out.println(i + ". saya senang");
        }

        else {
            System.out.println(i + ". saya anak wikusama");
        }

        
        }
        
       
    }
}
