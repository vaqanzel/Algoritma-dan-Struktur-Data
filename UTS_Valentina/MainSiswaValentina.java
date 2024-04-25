package UTS_Valentina;

import java.util.Arrays;
import java.util.Scanner;

public class MainSiswaValentina {
   
    public static void main(String[] args) {
        Scanner inputValentina = new Scanner(System.in);

        System.out.print("Masukkan jumlah data siswa: ");
        int jumlahSiswaValentina = inputValentina.nextInt();
        inputValentina.nextLine(); 
        
        SiswaValentina[] daftarSiswaValentina = new SiswaValentina[jumlahSiswaValentina];

        for (int i = 0; i < jumlahSiswaValentina; i++) {
            System.out.println("\nMasukkan informasi siswa ke-" + (i + 1) + ":");
            System.out.print("NISN: ");
            String nisn = inputValentina.nextLine();
            System.out.print("Nama: ");
            String nama = inputValentina.nextLine();
            System.out.print("Alamat: ");
            String alamat = inputValentina.nextLine();
            System.out.print("Tahun: ");
            int tahun = inputValentina.nextInt();
            System.out.print("Nilai: ");
            double nilai = inputValentina.nextDouble();
            inputValentina.nextLine(); 

            daftarSiswaValentina[i] = new SiswaValentina(nisn, nama, alamat, tahun, nilai);
        }

        System.out.println("\nDAFTAR SISWA:");
        for (int i = 0; i < jumlahSiswaValentina; i++) {
            System.out.println("\nSISWA ke-" + (i + 1) + ":");
            System.out.println("NISN: " + daftarSiswaValentina[i].nisn);
            System.out.println("Nama: " + daftarSiswaValentina[i].nama);
            System.out.println("NIK: " + daftarSiswaValentina[i].alamat);
            System.out.println("Umur: " + daftarSiswaValentina[i].tahun);
            System.out.println("Nilai: " + daftarSiswaValentina[i].nilai);
        }
        SekolahValentina.urutkanSiswa(daftarSiswaValentina);

        System.out.println("\nDAFTAR SISWA (berdasarkan tahun masuk siswa terlama hingga terbaru):");
        for (int i = 0; i < jumlahSiswaValentina; i++) {
            System.out.println("\nSiswa ke-" + (i + 1) + ":");
            System.out.println("NISN : " + daftarSiswaValentina[i].nisn);
            System.out.println("Nama : " + daftarSiswaValentina[i].nama);
            System.out.println("Alamat : " + daftarSiswaValentina[i].alamat);
            System.out.println("Tahun : " + daftarSiswaValentina[i].tahun);
            System.out.println("Nilai : " + daftarSiswaValentina[i].nilai);
        }

        System.out.print("\nMasukkan Nama Siswa yang ingin dicari: ");
        String namaCari = inputValentina.nextLine();
        Arrays.sort(daftarSiswaValentina, (a, b) -> a.nama.compareTo(b.nama)); 
        int index = Arrays.binarySearch(daftarSiswaValentina, new SiswaValentina("", namaCari, "", 0, 0), (a, b) -> a.nama.compareTo(b.nama));
        if (index >= 0) {
            System.out.println("\nSiswa dengan nama " + namaCari + " ditemukan:");
            System.out.println("NISN : " + daftarSiswaValentina[index].nisn);
            System.out.println("Alamat : " + daftarSiswaValentina[index].alamat);
            System.out.println("Tahun : " + daftarSiswaValentina[index].tahun);
            System.out.println("Nilai : " + daftarSiswaValentina[index].nilai);
        } else {
            System.out.println("\nSiswa dengan nama " + namaCari + " tidak ditemukan.");
        }

        inputValentina.close();
    }
}
