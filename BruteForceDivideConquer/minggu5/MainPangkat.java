package minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen]; 
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan:");
            int nilai = sc.nextInt(); 
            System.out.println("Masukkan nilai pemangkat:");
            int pangkat = sc.nextInt(); 
            png[i] = new Pangkat(nilai, pangkat); // Membuat objek Pangkat dengan konstruktor
        }

        System.out.println("Pilih method yang ingin dijalankan:");
        System.out.println("1. Pangkat Brute Force");
        System.out.println("2. Pangkat Divide and Conquer");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat)); 
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat)); 
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
