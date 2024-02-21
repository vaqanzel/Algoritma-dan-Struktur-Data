public class RoyalGarden {
    // STOCK BUNGA PADA SETIAP CABANG
    static int[][] dataStock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000};

    // FUNGSI JIKA SEMUA BUNGA HABIS TERJUAL
    public static void pendapatanPerCabang() {
        for (int i = 0; i < dataStock.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < dataStock[i].length; j++) {
                totalPendapatan += dataStock[i][j] * hargaBunga[j];
            }
            System.out.println("Pendapatan Cabang " + (i+1) + ": Rp " + totalPendapatan);
        }
    }

    // FUNGSI JUMLAH STOCK BUNGA CABANG 4 
    public static void stockPerJenisBunga() {
        System.out.println("Jumlah Stock Bunga pada Cabang RoyalGarden 4:");
        for (int i = 0; i < dataStock[3].length; i++) {
            System.out.println("Bunga " + NamaBunga(i) + ": " + dataStock[3][i]);
        }
    }

    //FUNGSI NAMA BUNGA BERDASARKAN INDEX
    public static String NamaBunga(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }

    // FUNGSI KURANGI BUNGA MATI
    public static void kurangiStockBunga() {
       
        int[] bungaMati = {-1, -2, 0, -5};
        for (int i = 0; i < dataStock[3].length; i++) {
            dataStock[3][i] += bungaMati[i];
            if (dataStock[3][i] < 0) {
                dataStock[3][i] = 0; 
            }
        }
    }

    public static void main(String[] args) {
        
        pendapatanPerCabang();
        System.out.println();
        stockPerJenisBunga();
        System.out.println();
       
        kurangiStockBunga();
        System.out.println("\nJumlah Stock Bunga pada Cabang RoyalGarden 4 setelah bunga mati:");
        stockPerJenisBunga();
    }
}
