import java.util.Scanner;

public class MenghitungIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=========================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=========================");
        
        double totalNilai = 0;
        int totalSks = 0;
        
        String[] mataKuliah = {"Pancasila", "Konsep Teknologi Informasi", "CTPS",
                               "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                               "Keselamatan & Kesehatan Kerja"};
        double[] nilaiAngka = new double[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];
        
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
            bobotNilai[i] = hitungNilaiSetara(nilaiAngka[i]);
            
            totalNilai += bobotNilai[i] * 3; 
            totalSks += 3; 
        }
        
        System.out.println("=========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=========================");
        System.out.println("MK\t\t\t Nilai Angka\t Nilai Huruf\t Bobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-30s%-15.2f%-15s%-10.2f\n",      mataKuliah[i],      nilaiAngka[i],     konversiNilaiHuruf(nilaiAngka[i]),     bobotNilai[i]);
        }
        
        double ips = totalNilai / totalSks;
        System.out.println("===========================");
        System.out.println("IP : " + ips);
    }
    
    public static double hitungNilaiSetara(double nilaiAngka) {
        if (nilaiAngka > 80) {
            return 4.0;
        } else if (nilaiAngka > 73) {
            return 3.5;
        } else if (nilaiAngka > 65) {
            return 3.0;
        } else if (nilaiAngka > 60) {
            return 2.5;
        } else if (nilaiAngka > 50) {
            return 2.0;
        } else if (nilaiAngka > 39) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
    
    public static String konversiNilaiHuruf(double nilaiAngka) {
        if (nilaiAngka > 80) {
            return "A";
        } else if (nilaiAngka > 73) {
            return "B+";
        } else if (nilaiAngka > 65) {
            return "B";
        } else if (nilaiAngka > 60) {
            return "C+";
        } else if (nilaiAngka > 50) {
            return "C";
        } else if (nilaiAngka > 39) {
            return "D";
        } else {
            return "E";
        }
    }
}
