package Tugas;

public class Queue {
    private Pembeli[] antrian;
    private int front;
    private int rear;
    private int size;
    private int max;

    public Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Pembeli pembeli) {
        if (!isFull()) {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            antrian[rear] = pembeli;
            size++;
        } else {
            System.out.println("Antrian sudah penuh.");
        }
    }

    public int dequeue() {
        int noHP = -1;
        if (!isEmpty()) {
            noHP = antrian[front].getNoHP();
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
            size--;
        } else {
            System.out.println("Antrian masih kosong.");
        }
        return noHP;
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Antrian:");
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].getNama() + " - " + antrian[i].getNoHP());
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].getNama() + " - " + antrian[i].getNoHP());
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Pembeli terdepan: " + antrian[front].getNama() + " - " + antrian[front].getNoHP());
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Pembeli paling belakang: " + antrian[rear].getNama() + " - " + antrian[rear].getNoHP());
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void peekPosition(String nama) {
        if (!isEmpty()) {
            for (int i = front; i != rear; i = (i + 1) % max) {
                if (antrian[i].getNama().equals(nama)) {
                    System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + (i + 1));
                    return;
                }
            }
            if (antrian[rear].getNama().equals(nama)) {
                System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + (rear + 1));
            } else {
                System.out.println("Pembeli " + nama + " tidak ditemukan dalam antrian.");
            }
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void daftarPembeli() {
        if (!isEmpty()) {
            System.out.println("Daftar pembeli dalam antrian:");
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].getNama() + " - " + antrian[i].getNoHP());
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].getNama() + " - " + antrian[i].getNoHP());
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }
}
