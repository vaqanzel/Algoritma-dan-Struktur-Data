import java.util.Scanner;
public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input panjang array
        System.out.print("Masukkan panjang array: ");
        int panjangArray = sc.nextInt();
        
        // Membuat array ppArray dengan panjang yang ditentukan oleh pengguna
        PersegiPanjang[] ppArray = new PersegiPanjang[panjangArray];
        
        // Input data untuk setiap objek PersegiPanjang dalam array
        for (int i = 0; i < panjangArray; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        // Menampilkan data setiap objek PersegiPanjang dalam array
        for (int i = 0; i < panjangArray; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
