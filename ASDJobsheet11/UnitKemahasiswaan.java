package ASDJobsheet11;

import java.util.Scanner;

public class UnitKemahasiswaan {
    static class Node {
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
    int size;

    UnitKemahasiswaan(int kapasitas) {
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Daftar Antrian Unit Kemahasiswaan: ");
            while (tmp != null) {
                System.out.println("Mahasiswa " + tmp.urutan);
                System.out.println("NIM     : " + tmp.nim);
                System.out.println("Nama    : " + tmp.nama);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Daftar antrian kosong");
        }
    }

    void enqueue(int urutan, int nim, String nama) {
        Node ndInput = new Node(urutan, nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            head = head.next;
            size--;
            if (isEmpty()) {
                tail = null;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = sc.nextInt();
        UnitKemahasiswaan uk = new UnitKemahasiswaan(kapasitas);
        int pilih;

        do {
            System.out.println("\n1. Antrian Baru");
            System.out.println("2. Hapus Antrian Terdepan");
            System.out.println("3. Daftar Antrian");
            System.out.print("Pilih menu (1/2/3): ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nomor Urut Mahasiswa : ");
                    int urutan = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa        : ");
                    int nim = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa       : ");
                    String nama = sc.nextLine();
                    uk.enqueue(urutan, nim, nama);
                    break;
    
                case 2:
                    uk.dequeue();
                    System.out.println("Antrian terdepan berhasil dihapus");
                    break;
    
                case 3:
                    uk.print();
                    break;
    
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);

    }
}
