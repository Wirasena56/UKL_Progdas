import java.util.Scanner;
import java.util.Random;
public class SedangSoal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random acak = new Random();

        while (true) {
            // Menambahkan  Angka random
            int num1 = acak.nextInt(10) + 1;
            int num2 = acak.nextInt(10) + 1;
            String[] operators = {"+", "-", "*", "/"};
            String operator = operators[acak.nextInt(operators.length)];

            // Proses hitung setiap operator agar bisa digunakan
            double correctResult = 0;
            switch (operator) {
                case "+":
                    correctResult = num1 + num2;
                    break;
                case "-":
                    correctResult = num1 - num2;
                    break;
                case "*":
                    correctResult = num1 * num2;
                    break;
                case "/":
                    correctResult = (double) num1 / num2;
                    break;
            }

          // output hasil, jawaban
            System.out.println("Apa hasil dari: " + num1 + " " + operator + " " + num2 + " ?");
            System.out.print("Jawaban: ");
            double userAnswer = input.nextDouble();

        //output apakah jawaban benar atau salah
            if (userAnswer == correctResult) {
                System.out.println("Benar! Jawaban mu yaitu: " + correctResult);
            } else {
                System.out.println("Salah!. Jawaban yang benar yaitu: " + correctResult);
            }

         //Pilihan untuk lanjut atau tidak
            System.out.print("Apakah Mau Lanjut? (1. Yes 2. No) : ");
            int response = input.nextInt();
            if (response == 2) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}
