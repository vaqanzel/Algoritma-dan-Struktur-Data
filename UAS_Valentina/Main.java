import java.util.Scanner;

public class Main {
    static BarangRental[] barangRentals = {
        new BarangRental("S 4567 YV", "Honda Beat", "Motor", 2017, 10000),
        new BarangRental("N 4511 VS", "Honda Vario", "Motor", 2018, 10000),
        new BarangRental("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000),
        new BarangRental("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000),
        new BarangRental("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000)
    };

    static TransaksiRental[] transaksiRentals = new TransaksiRental[100];
    static int transaksiRental = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("Menu:");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut nama peminjam");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    daftarKendaraan();
                    break;
                case 2:
                    peminjaman(scanner);
                    break;
                case 3:
                    tampilkanTransaksi();
                    break;
                case 4:
                    urutkanTransaksi();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilih != 5);

        scanner.close();
    }

    static void daftarKendaraan() {
        System.out.println("++++++++++++++++++++++\nDaftar Kendaraan Rental Serba Serbi\n++++++++++++++++++++++");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s\n", "Nomor TNKB", "Nama Kendaraan", "Jenis", "Tahun", "Biaya Sewa Perjam");
        for (BarangRental br : barangRentals) {
            System.out.printf("%-10s %-15s %-10s %-10d %-10d\n", br.noTNKB, br.namaKendaraan, br.jenisKendaraan, br.tahun, br.biayaSewa);
        }
    }

    static void peminjaman(Scanner scanner) {
        scanner.nextLine();

        System.out.print("Masukkan Nama Peminjam: ");
        String namaPeminjam = scanner.nextLine();
        System.out.print("Masukkan Nomor TNKB: ");
        String noTNKB = scanner.nextLine();
        System.out.print("Masukkan Lama Pinjam : ");
        int lamaPinjam = scanner.nextInt();
        System.out.print("Apakah Member (ya/tidak): ");
        String Members = scanner.next();
        boolean Member = Members.equalsIgnoreCase("ya");

        BarangRental br = null;
        for (BarangRental b : barangRentals) {
            if (b.noTNKB.equals(noTNKB)) {
                br = b;
                break;
            }
        }

        if (br == null) {
            System.out.println("Kendaraan tidak ditemukan.");
            return;
        }

        TransaksiRental transaksi = new TransaksiRental(namaPeminjam, lamaPinjam, br, Member);
        transaksiRentals[transaksiRental++] = transaksi;

        System.out.println("Transaksi berhasil dibuat.");
        System.out.println("++++++++++++++++++++++\nDaftar Seluruh Transaksi\n++++++++++++++++++++++");
        System.out.printf("%-10s %-15s %-10s %-10s %-15s %-10s\n", "Kode", "Nama Peminjam", "Lama Pinjam", "Total Biaya", "Nomor TNKB", "Nama Kendaraan");
        for (int i = 0; i < transaksiRental; i++) {
            TransaksiRental tr = transaksiRentals[i];
            System.out.printf("%-10d %-15s %-10d %-10.2f %-15s %-10s\n", tr.kodeTransaksi, tr.namaPeminjam, tr.lamaPinjam, tr.totalBiaya, tr.br.noTNKB, tr.br.namaKendaraan);
        }
    }

    static void tampilkanTransaksi() {
        System.out.println("++++++++++++++++++++++\nDaftar Seluruh Transaksi\n++++++++++++++++++++++");
        System.out.printf("%-10s %-15s %-10s %-10s %-15s %-10s\n", "Kode", "Nama Peminjam", "Lama Pinjam", "Total Biaya", "Nomor TNKB", "Nama Kendaraan");
        for (int i = 0; i < transaksiRental; i++) {
            TransaksiRental tr = transaksiRentals[i];
            System.out.printf("%-10d %-15s %-10d %-10.2f %-15s %-10s\n", tr.kodeTransaksi, tr.namaPeminjam, tr.lamaPinjam, tr.totalBiaya, tr.br.noTNKB, tr.br.namaKendaraan);
        }
    }

    
    static void urutkanTransaksi() {
        for (int i = 0; i < transaksiRental - 1; i++) {
            for (int j = 0; j < transaksiRental - i - 1; j++) {
                if (transaksiRentals[j].namaPeminjam.compareTo(transaksiRentals[j + 1].namaPeminjam) > 0) {
                    TransaksiRental temp = transaksiRentals[j];
                    transaksiRentals[j] = transaksiRentals[j + 1];
                    transaksiRentals[j + 1] = temp;
                }
            }
        }
        System.out.println("Transaksi berhasil diurutkan berdasarkan nama peminjam.");
        System.out.println("++++++++++++++++++++++\nDaftar Seluruh Transaksi Setelah Diurutkan\n++++++++++++++++++++++");
        System.out.printf("%-10s %-15s %-10s %-10s %-15s %-10s\n", "Kode", "Nama Peminjam", "Lama Pinjam", "Total Biaya", "Nomor TNKB", "Nama Kendaraan");
        for (int i = 0; i < transaksiRental; i++) {
            TransaksiRental tr = transaksiRentals[i];
            System.out.printf("%-10d %-15s %-10d %-10.2f %-15s %-10s\n", tr.kodeTransaksi, tr.namaPeminjam, tr.lamaPinjam, tr.totalBiaya, tr.br.noTNKB, tr.br.namaKendaraan);
        }
    }
}





