import java.util.Scanner;
public class SulitSoal1 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.println("Masukkan jumlah siswa");
    int jumlahsiswa = input.nextInt();
    
    int totalnilai = 0;
        for (int i = 1; i <= jumlahsiswa; i++ ){
           System.out.println("Masukkan nilai siswa " + i);
           int nilai = input.nextInt();
           totalnilai = totalnilai + nilai; 
    
            }

            double ratarata = totalnilai / jumlahsiswa;
            System.out.println("==================");
            System.out.println("Total nilai " + totalnilai);
            System.out.println("Jumlah Siswa: "+ jumlahsiswa);
            System.out.println("Rata-rata nilai siswa: " + ratarata);          
            System.out.println("==================");

            
                
            }
            
        }
    
    



