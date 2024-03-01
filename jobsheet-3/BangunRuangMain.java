import java.util.Scanner;

public class BangunRuangMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input atribut untuk Kerucut
        System.out.println("Kerucut:");
        System.out.print("Masukkan jari-jari: ");
        double jariJariKerucut = scanner.nextDouble();
        System.out.print("Masukkan sisi miring: ");
        double sisiMiringKerucut = scanner.nextDouble();
        Kerucut kerucut = new Kerucut(jariJariKerucut, sisiMiringKerucut);

        // Input atribut untuk LimasSegiEmpat
        System.out.println("\nLimas Segi Empat:");
        System.out.print("Masukkan panjang sisi alas: ");
        double sisiAlasLimas = scanner.nextDouble();
        System.out.print("Masukkan tinggi limas: ");
        double tinggiLimas = scanner.nextDouble();
        LimasSegiEmpat limasSegiEmpat = new LimasSegiEmpat(sisiAlasLimas, tinggiLimas);

        // Input atribut untuk Bola
        System.out.println("\nBola:");
        System.out.print("Masukkan jari-jari: ");
        double jariJariBola = scanner.nextDouble();
        Bola bola = new Bola(jariJariBola);

        System.out.println("\nHasil Perhitungan:");
        System.out.println("Luas Permukaan Kerucut: " + kerucut.hitungLuasPermukaan());
        System.out.println("Volume Kerucut: " + kerucut.hitungVolume());
        System.out.println("\nLuas Permukaan Limas Segi Empat: " + limasSegiEmpat.hitungLuasPermukaan());
        System.out.println("Volume Limas Segi Empat: " + limasSegiEmpat.hitungVolume());
        System.out.println("\nLuas Permukaan Bola: " + bola.hitungLuasPermukaan());
        System.out.println("Volume Bola: " + bola.hitungVolume());
    }
}
