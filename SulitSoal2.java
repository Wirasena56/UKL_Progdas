import java.util.Scanner;
public class SulitSoal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


  System.out.print("Masukkan jumlah elemen array: ");
  int n = input.nextInt();


  int[] array = new int[n];


  System.out.println("Masukkan elemen-elemen array:");
  for (int i = 0; i < n; i++) {
      array[i] = input.nextInt();
  }


  for (int i = 0; i < array.length; i++) {
      int elemen = array[i];
      int frekuensi = 0;


      for (int j = 0; j < array.length; j++) {
          if (array[j] == elemen) {
              frekuensi++;
          }
      }


      boolean sudahDihitung = false;
      for (int k = 0; k < i; k++) {
          if (array[k] == elemen) {
              sudahDihitung = true;
              break;
          }
      }

      if (!sudahDihitung) {
          System.out.println(elemen + " muncul " + frekuensi + " kali");
      }
  }

    }
}
