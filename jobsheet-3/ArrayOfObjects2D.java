public class ArrayOfObjects2D {
    public static void main(String[] args) {
        PersegiPanjang[][] ppArray = new PersegiPanjang[2][3]; 

        // Mengisi array dengan objek PersegiPanjang
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                ppArray[i][j] = new PersegiPanjang();
                ppArray[i][j].panjang = (i + 1) * 10; 
                ppArray[i][j].lebar = (j + 1) * 5;    
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Persegi Panjang ke-" + j);
                System.out.println("Panjang: " + ppArray[i][j].panjang + ", lebar: " + ppArray[i][j].lebar);
            }
        }
    }
}
