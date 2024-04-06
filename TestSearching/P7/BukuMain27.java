
package TestSearching.P7;

import java.util.Scanner;
import java.util.ArrayList;

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
            String kodeBuku = s1.nextLine();
            System.out.print("Judul buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock     \t: ");
            int stock = s.nextInt();

            Buku27 m = new Buku27(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        // Mengurutkan data buku sebelum melakukan pencarian binary search
        data.bubbleSort();

        System.out.println("---------------------------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("------------------------------------------------------------------------- ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Judul Buku yang dicari: ");
        System.out.print("Judul Buku : ");
        String cariJudul = s1.nextLine();
        System.out.println("Menggunakan sequential Search");
        ArrayList<Integer> positions = data.FindAllSeqSearch(cariJudul);
        data.TampilMultipleData(cariJudul, positions);

        //Pencarian menggunakan binary search
        System.out.println("===============================");
        System.out.println("Menggunakan binary search");
        int posisiJudul = data.FindBinarySearch(cariJudul);
        data.Tampilposisi(cariJudul, posisiJudul);
        data.TampilData(cariJudul, posisiJudul);
    }
}
