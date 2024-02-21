import java.util.Scanner;

public class RumusJarakKecepatanwaktu {
    // FUNGSI MENAMPILKAN MENU
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.println("0. Keluar");
    }

    // fUGSI MENGHITUNG KECEPATAN
    public static void hitungKecepatan(double s, double t) {
        double v = s / t;
        System.out.println("Kecepatan: " + v + " m/s");
    }

    // FUNGSI MENGHITUNG JARAK
    public static void hitungJarak(double v, double t) {
        double s = v * t;
        System.out.println("Jarak: " + s + " meter");
    }

    // FUNGSI MENGHITUNG WAKTU
    public static void hitungWaktu(double s, double v) {
        double t = s / v;
        System.out.println("Waktu: " + t + " detik");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            displayMenu();
            System.out.print("Pilih menu (0-3): ");
            choice = scanner.nextInt();

            double s, t, v;
            switch (choice) {
                case 1:
                    System.out.print("Masukkan jarak (meter): ");
                    s = scanner.nextDouble();
                    System.out.print("Masukkan waktu (detik): ");
                    t = scanner.nextDouble();
                    hitungKecepatan(s, t);
                    break;
                case 2:
                    System.out.print("Masukkan kecepatan (m/s): ");
                    v = scanner.nextDouble();
                    System.out.print("Masukkan waktu (detik): ");
                    t = scanner.nextDouble();
                    hitungJarak(v, t);
                    break;
                case 3:
                    System.out.print("Masukkan jarak (meter): ");
                    s = scanner.nextDouble();
                    System.out.print("Masukkan kecepatan (m/s): ");
                    v = scanner.nextDouble();
                    hitungWaktu(s, v);
                    break;
                case 0:
                    System.out.println("Terima kasih!!!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan 0-3.");
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}
