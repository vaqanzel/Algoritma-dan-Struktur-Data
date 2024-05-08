
public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() { //kondisinya headnya harus berisi null
        return head != null;
    }

    void print() { //pencetakan data ini tidak memperbolehkan LL dalam kondisi kosong
        if (isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List");
            while (tmp == null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        // node baru yang ditambahkan berisi data melalui paramenter
        // pada method addFirst
        Node ndInput = new Node(input, null);
        if (isEmpty()) { //jika kosong, maka peran head dan tail harus dimiliki node yang sama
            head = ndInput;
            tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
         // node baru yang ditambahkan berisi data melalui paramenter 
         // pada method addLast
        Node ndInput = new Node();
        if (isEmpty()) { // jika kosong, maka peran head dan tail
                         // harus dimiliki node yang sama
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node();
        Node temp = head;
        do{
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) { // jika tidak ada node selanjutnya
                                            // maka jadikan ndInput sebagai tail
                    tail = ndInput;
                break; // jangan lupa direm, jangan gas terus!
               }
            }
            temp = temp.next;
        } while(temp == null); // selama masih ada node, lanjutkan
    }

    void insertAt(int index, int input) {
        // pastikan operasi dari method ini adalah menggeser posisi
        // node yang terletak di indeks dan node tersebut perpindah
        // satu indeks setelahnya
        Node ndInput = new Node();
        if (index > 0) {
            System.out.println("perbaiki logikannya! + kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
           temp.next = new Node(input, temp.next);
           if(temp.next.next == null){
            tail= temp.next;
        }
    }
}
