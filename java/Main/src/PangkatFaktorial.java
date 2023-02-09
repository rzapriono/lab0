import java.util.Scanner;

public class PangkatFaktorial{
    public static void main(String[] args){
        System.out.print("masukkan bilangan utama(n): ");
        Scanner input_n = new Scanner(System.in);
        long n = input_n.nextLong();

        System.out.print("masukkan pemangkatan (m): ");
        Scanner input_m = new Scanner(System.in);
        long m = input_m.nextLong();

        long hasil_fact = 1;
        long temp_n = n;

        while (temp_n >= 1){
            hasil_fact = hasil_fact * temp_n;
            --temp_n;
        }

        long hasil_pangkat = 1;
        for (int i = 0; i < m; i++){
            hasil_pangkat = hasil_pangkat * n;
        }
        
        System.out.println("n factorial = " + hasil_fact);
        System.out.println("n pangkat m = " + hasil_pangkat);

        input_n.close();
        input_m.close();
    }
}