import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        System.out.print("Masukkan Nama Mahasiswa: ");
        Scanner input_nama = new Scanner(System.in);
        String nama = input_nama.next();
        //tes
        System.out.print("Masukkan Nilai Asli: ");
        Scanner input_nilai_asli = new Scanner(System.in);
        double nilai_asli = input_nilai_asli.nextDouble();

        System.out.print("Masukkan Durasi: ");
        Scanner input_durasi = new Scanner(System.in);
        double durasi = input_durasi.nextDouble();

        double nilai_akhir;

        if (durasi < 60.0){
            nilai_akhir = 1.2 * nilai_asli;
        }
        else if (durasi <= 70 & durasi >= 60.0){
            nilai_akhir = nilai_asli;
            
        }
        else if (durasi < 90.0 & durasi > 70){
            nilai_akhir = 0.75 * nilai_asli;
        }
        else if (durasi <= 100 & durasi >= 90){
            nilai_akhir = 0.5 * nilai_asli;
        }
        else
            nilai_akhir = 0.2 * nilai_asli;

        System.out.println(nama + " mendapatkan nilai akhir " + nilai_akhir);

        input_nama.close();
        input_durasi.close();
        input_nilai_asli.close();
    }
}
