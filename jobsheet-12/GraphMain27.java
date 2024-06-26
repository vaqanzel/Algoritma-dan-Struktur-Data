
import java.util.Scanner;

public class GraphMain27 {
    public static void main(String[] args) throws Exception {
        Graph27 gedung = new Graph27(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        // Scanner scanner = new Scanner(System.in);
        // while (true) {
        //     System.out.print("Masukkan gedung asal: ");
        //     int asal = scanner.nextInt();
        //     System.out.print("Masukkan gedung tujuan: ");
        //     int tujuan = scanner.nextInt();

        //     boolean adaJalur = gedung.cekJalur(asal, tujuan);
        //     if (adaJalur) {
        //         System.out.println("Gedung " + (char) ('A' + asal) + " dan gedung " + (char) ('A' + tujuan) + " bertetangga");
        //     } else {
        //         System.out.println("Gedung " + (char) ('A' + asal) + " dan gedung " + (char) ('A' + tujuan) + " tidak bertetangga");
        //     }

        //     System.out.print("Ingin memasukkan data lagi? (ya/tidak): ");
        //     String lanjut = scanner.next();
        //     if (!lanjut.equalsIgnoreCase("ya")) {
        //         break;
        //     }
        // }

        GraphMatriks27 gdg = new GraphMatriks27(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        for (int i = 0; i < 4; i++) {
            gdg.degree(i);
        }
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        for (int i = 0; i < 4; i++) {
            gdg.degree(i);
        }
    }
}
