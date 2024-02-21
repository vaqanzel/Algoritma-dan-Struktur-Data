import java.util.Scanner;

public class HitungNilaiAkhir {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==============================");

        //INPUT NILAI
        System.out.print("Masukkan nilai tugas: ");
        double tugas = scanner.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = scanner.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = scanner.nextDouble();
        
        System.out.println("==============================");
        System.out.println("==============================");

        // HITUNG NILAI AKHIR
        double nilaiAkhir = hitungNilaiAkhir(tugas, kuis, uts, uas);

        if (nilaiAkhir == -1) {
            System.out.println("Nilai tidak valid");
        } else {
            System.out.println("Nilai akhir: " + nilaiAkhir);
       
            
            String nilaiHuruf = konversiNilai(nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);

            System.out.println("==============================");
            System.out.println("==============================");
           
            String keterangan = nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
                    nilaiHuruf.equals("C+") || nilaiHuruf.equals("C") ? " SELAMAT ANDA LULUS" : "TIDAK LULUS";
            System.out.println("Keterangan: " + keterangan);
        }
    }

    public static double hitungNilaiAkhir(double tugas, double kuis, double uts, double uas) {
        // Cek Nilai Valid
        if (!(0 <= tugas && tugas <= 100) || !(0 <= kuis && kuis <= 100) || !(0 <= uts && uts <= 100) || !(0 <= uas && uas <= 100)) {
            return -1;
        }

        // Hitung Nilai Ahhir 
        return 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas;
    }

    public static String konversiNilai(double nilaiAkhir) {
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            return "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            return "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            return "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            return "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            return "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
