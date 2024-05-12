package ASDJobsheet12;

public class Mahasiswa {
    public static class Node {
        int urutan, nim;
        String nama;
        Node next;
    
        Node(int urutan, int nim, String nama, Node next) {
            this.urutan = urutan;
            this.nim = nim;
            this.nama = nama;
            this.next = next;
        }
    }

    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List: \t");
            while (tmp != null) {
                System.out.println("Mahasiswa " + tmp.urutan);
                System.out.println("NIM     : " + tmp.nim);
                System.out.println("Nama    : " + tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int urutan, int nim, String nama) {
        Node ndInput = new Node(urutan, nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int urutan, int nim, String nama) {
        Node ndInput = new Node(urutan, nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int urutan, int nim, String nama) {
        Node ndInput = new Node(urutan, nim, nama, null);
        Node temp = head;
        do {
            if (temp.urutan == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void inserAt(int index, int urutan, int nim, String nama) {
        Node ndInput = new Node(urutan, nim, nama, null);
        if (index == 0) {
            addFirst(urutan, nim, nama);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(urutan, nim, nama, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public static class mahasiswaMain{
        public static void main(String[] args) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.addFirst(1, 111, "Anton");
            mhs.inserAt(1, 2, 112, "Prita");
            mhs.inserAt(2, 3, 113, "Yusuf");
            mhs.insertAfter(3, 4, 114, "Doni");
            mhs.addLast(5, 115, "Sari");
            mhs.print();
        }
    }
}
