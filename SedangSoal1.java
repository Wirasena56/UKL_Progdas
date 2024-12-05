import java.util.Scanner;
public class SedangSoal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //input angka
        System.out.println("Masukkan angka: ");
        int Angka = input.nextInt();

        
        int hasil = 1;

        for (int i = 1; i <= Angka; ++i){
        hasil = hasil *= i;
        if (i == Angka) {
            System.out.print(i);
            
        } else {
            System.out.print(i + " + ");
        }
    }
    System.out.println(" = " + hasil);
    System.out.println("Faktorial dari  " + Angka + " adalah " + hasil );

    }
}

