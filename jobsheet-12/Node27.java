public class Node27{
    int data;
    Node27 prev, next;
    int jarak;

    Node27(Node27 prev, int data, int jarak, Node27 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}