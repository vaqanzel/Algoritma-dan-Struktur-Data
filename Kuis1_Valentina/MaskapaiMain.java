package Kuis1_Valentina;
import java.util.Scanner;
public class MaskapaiMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah maskapai: ");
        int jumlahMaskapai = scanner.nextInt();
        Maskapai27[] maskapai = new Maskapai27[jumlahMaskapai];

        for (int i = 0; i < jumlahMaskapai; i++) {
            System.out.println("Maskapai ke-" + (i + 1));
            System.out.print("Nomor: ");
            String nomor = scanner.next();
            System.out.print("Tujuan: ");
            String tujuan = scanner.next();
            System.out.print("Jumlah Tiket: ");
            int tiket = scanner.nextInt();
            System.out.print("Jumlah Tersedia: ");
            int tersedia = scanner.nextInt();
            System.out.print("Jumlah Terdaftar: ");
            int terdaftar = scanner.nextInt();
            maskapai[i] = new Maskapai27(nomor, tujuan, tiket, tersedia, terdaftar);
        }

        System.out.println("\nInformasi Maskapai Paling Sepi:");
        Maskapai27 maskapaiPalingSepi = Maskapai27.cariMaskapaiPalingSepi(maskapai);
        maskapaiPalingSepi.tampilInformasi();

        System.out.println("Daftar Maskapai Berdasarkan Harga Tiket");
        System.out.println("\nDaftar Maskapai Berdasarkan Harga Tiket :");
        Maskapai27.daftarMaskapai(maskapai);
    }
}
