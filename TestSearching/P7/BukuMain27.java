package TestSearching.P7;

import java.util.Scanner;

public class BukuMain27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku27 data = new PencarianBuku27();
        int jumBuku = 5;

        System.out.println("--------------------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------------");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s.nextLine(); 
            System.out.print("Judul buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock     \t: ");
            int stock = s.nextInt();

            Buku27 m = new Buku27(kodeBuku, judulBuku, tahunTerbit, pengarang, stock); // Menggunakan constructor dengan String
            data.tambah(m);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");

        System.out.println(" --------------------------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("------------------------------------------------------------------------- ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        String cari = s.nextLine(); // Mengubah input menjadi String
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari); // Memanggil metode pencarian dengan String
        data.Tampilposisi(Integer.parseInt(cari), posisi); // Mengubah kembali ke int untuk menampilkan output
        data.TampilData(Integer.parseInt(cari), posisi);

        Buku27 dataBuku = data.FindBuku(cari);
        if (dataBuku != null) {
            dataBuku.tampilDataBuku();
        } else {
            System.out.println("Buku dengan kode " + cari + " tidak ditemukan.");
        }

        //Percobaan2
        System.out.println("===============================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(Integer.parseInt(cari), posisi); // Mengubah kembali ke int untuk menampilkan output
        data.TampilData(Integer.parseInt(cari), posisi);
    }
}
