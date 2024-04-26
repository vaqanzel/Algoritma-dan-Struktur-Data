package Tugas;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int capacity = scanner.nextInt();

        Queue queue = new Queue(capacity);
        int choice;
        do {
            printMenu();
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline

            switch (choice) {
                case 1:
                    if (!queue.isFull()) {
                        enqueuePembeli(scanner, queue);
                    } else {
                        System.out.println("Antrian sudah penuh.");
                    }
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        int noHP = queue.dequeue();
                        System.out.println("Pembeli dengan nomor HP " + noHP + " telah keluar dari antrian.");
                    } else {
                        System.out.println("Antrian masih kosong.");
                    }
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.peek();
                    break;
                case 5:
                    queue.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama pembeli yang ingin dicek posisinya: ");
                    String nama = scanner.nextLine();
                    queue.peekPosition(nama);
                    break;
                case 7:
                    queue.daftarPembeli();
                    break;
                case 8:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (choice != 8);
    }

    public static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah pembeli ke antrian");
        System.out.println("2. Keluarkan pembeli dari antrian");
        System.out.println("3. Tampilkan antrian");
        System.out.println("4. Lihat pembeli terdepan");
        System.out.println("5. Lihat pembeli paling belakang");
        System.out.println("6. Cek posisi pembeli");
        System.out.println("7. Daftar pembeli dalam antrian");
        System.out.println("8. Keluar");
    }

    public static void enqueuePembeli(Scanner scanner, Queue queue) {
        System.out.print("Nama pembeli: ");
        String nama = scanner.nextLine();
        System.out.print("Nomor HP: ");
        int noHP = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline

        Pembeli pembeli = new Pembeli(nama, noHP);
        queue.enqueue(pembeli);
        System.out.println("Pembeli " + nama + " telah ditambahkan ke antrian.");
    }
}
