import java.util.Scanner;

public class KampusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kampus[] mhsiswa = new Kampus[3];

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
}
