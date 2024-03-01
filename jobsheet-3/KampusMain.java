import java.util.Scanner;

public class KampusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kampus[] mhsiswa = new Kampus[3];

        
        inputDataMahasiswa(scanner, mhsiswa);
        tampilkanDataMahasiswa(mhsiswa);
        double rataIpk = hitungRataIpk(mhsiswa);
        System.out.println("Rata-rata IPK: " + rataIpk);
        tampilkanMaxIpk(mhsiswa);
    }

    public static void inputDataMahasiswa(Scanner scanner, Kampus[] mhsiswa) {
        for (int i = 0; i < mhsiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            Kampus mahasiswa = new Kampus();
            System.out.print("Masukkan nama : ");
            mahasiswa.nama = scanner.nextLine();
            System.out.print("Masukkan nim : ");
            mahasiswa.nim = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            mahasiswa.jenisKelamin = scanner.nextLine().charAt(0);
            System.out.print("Masukkan IPK : ");
            mahasiswa.ipk = Double.parseDouble(scanner.nextLine());

            mhsiswa[i] = mahasiswa;
        }
    }
    public static void tampilkanDataMahasiswa(Kampus[] mhsiswa) {
        System.out.println();
        for (int i = 0; i < mhsiswa.length; i++) {
            System.out.println("Data Mahasiswa ke- " + (i + 1));
            System.out.println("Nama : " + mhsiswa[i].nama);
            System.out.println("NIM : " + mhsiswa[i].nim);
            System.out.println("Jenis Kelamin : " + mhsiswa[i].jenisKelamin);
            System.out.println("Nilai IPK : " + mhsiswa[i].ipk);
            System.out.println();
        }
    }

    public static double hitungRataIpk(Kampus[] mhsiswa) {
        double totalIpk = 0;
        for (Kampus mahasiswa : mhsiswa) {
            totalIpk += mahasiswa.ipk;
        }
        return totalIpk / mhsiswa.length;
    }

    public static void tampilkanMaxIpk(Kampus[] mhsiswa) {
        double maxIpk = mhsiswa[0].ipk;
        int indexMax = 0;
        for (int i = 1; i < mhsiswa.length; i++) {
            if (mhsiswa[i].ipk > maxIpk) {
                maxIpk = mhsiswa[i].ipk;
                indexMax = i;
            }
        }
        System.out.println("Data Mahasiswa dengan IPK Terbesar:");
        System.out.println("Nama : " + mhsiswa[indexMax].nama);
        System.out.println("NIM : " + mhsiswa[indexMax].nim);
        System.out.println("Jenis Kelamin : " + mhsiswa[indexMax].jenisKelamin);
        System.out.println("Nilai IPK : " + mhsiswa[indexMax].ipk);
    }
}
