import java.util.Scanner;

public class PlatNomor {
    public static void main(String[] args) {
        
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        String[][] KOTA = {
            {"BANTEN"}, {"JAKARTA"}, {"BANDUNG"}, {"CIREBON"},
            {"BOGOR"}, {"PEKALONGAN"}, {"SEMARANG"}, {"SURABAYA"},
            {"MALANG"}, {"TEGAL"}
        };

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().charAt(0);

        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Kota dengan plat nomor " + inputKode + " adalah: " + KOTA[index][0]);
        } else {
            System.out.println("Kode plat nomor tidak valid.");
        }
    }
}
