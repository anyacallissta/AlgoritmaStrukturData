public class Node05 {
    int data, jarak;
    Node05 prev, next;

    Node05(Node05 prev, int data, int jarak, Node05 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
