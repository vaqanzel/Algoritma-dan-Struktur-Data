package minggu5;
import java.util.Scanner;
public class MainSum2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("Program Menghitung Keuntungan Total Perusahaan (Satuan Juta. Misal 5.9)");
        System.out.println("Masukkan jumlah perusahaan: ");
        int noperusahaan = sc.nextInt();

        Sum[] perusahaan = new Sum[noperusahaan];
        for (int i = 0; i < noperusahaan; i++) {
            System.out.println("Masukkan jumlah bulan untuk perusahaan " + (i+1) + ": ");
            int bulan = sc.nextInt();
            perusahaan[i] = new Sum(bulan);

            System.out.println("Masukkan keuntungan per bulan untuk perusahaan " + (i+1) + ": ");
            for (int j = 0; j < bulan; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + ": ");
                perusahaan[i].keuntungan[j] = sc.nextDouble();
            }
        }

        System.out.println("======================================================");
        for (int i = 0; i < noperusahaan; i++) {
            System.out.println("Total keuntungan perusahaan " + (i+1) + ": ");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = " +
                    perusahaan[i].totalBF(perusahaan[i].keuntungan));
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = " +
                   perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, perusahaan[i].elemen-1));
        }
    }
}


