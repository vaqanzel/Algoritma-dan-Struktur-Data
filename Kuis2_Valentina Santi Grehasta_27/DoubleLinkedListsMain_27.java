import java.util.Scanner;

public class DoubleLinkedListsMain_27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        DoubleLinkedLists_27 dll27 = new DoubleLinkedLists_27();

        System.out.println("======== QUIZ 2 PRAKTIKUM ASD TI ========");
        System.out.print("Dibuat Oleh : ");
        String nama27 = sc27.nextLine();
        System.out.print("NIM : ");
        String nim27 = sc27.nextLine();
        System.out.print("Absen : ");
        String absen27 = sc27.nextLine();
        System.out.println("=========================================");
        System.out.println("Sistem Antrian Resto");

        
        boolean menu27 = true;
        while (menu27) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hitung total pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih (1-6): ");
            int pilih27 = sc27.nextInt();
            sc27.nextLine();  

            switch (pilih27) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("---------------------------------------------");
                    System.out.print("Nama Customer: ");
                    String namaPembeli27 = sc27.nextLine();
                    System.out.print("Nomor HP: ");
                    String noHp27 = sc27.nextLine();
                    dll27.addPembeli27(namaPembeli27, noHp27);
                    break;
                case 2:
                    dll27.printPembeli27();
                    break;
                case 3:
                    if (!dll27.isEmptyPembeli27()) {
                        Pembeli_27 currentPembeli27 = dll27.headPembeli27;
                        System.out.println(currentPembeli27.namaPembeli27 + " telah memesan Menu");
                        System.out.println("---------------------------------------------");
                        System.out.println("Transaksi input pesanan");
                        System.out.println("---------------------------------------------");
                        System.out.print("Pesanan: ");
                        String namaPesanan27 = sc27.nextLine();
                        System.out.print("Harga: ");
                        int harga27 = sc27.nextInt();
                        sc27.nextLine(); 
                        dll27.addPesanan27(namaPesanan27, harga27);
                        dll27.removeFirstPembeli27();
                    } else {
                        System.out.println("Tidak ada antrian.");
                    }
                    break;
                case 4:
                    dll27.UrutPesanan27();
                    dll27.printPesanan27();
                    break;
                case 5:
                    dll27.printTotalPendapatan27();
                    break;
                case 6:
                    menu27 = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        sc27.close();
    
    }
}