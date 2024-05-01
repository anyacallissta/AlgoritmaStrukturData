package ASDJobsheet10;

import java.util.Scanner;

public class Nasabah05 {
    String norek, nama, alamat;
    int umur;
    double saldo;
    Nasabah05[] data;
    int front, rear, size, max;
    
    Nasabah05(String norek, String nama, String alamat, int umur, double saldo) {
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }

    Nasabah05() {

    }

    public Nasabah05(int n) {
        max = n;
        data = new Nasabah05[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama + " " + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen: " + size);
        }
    }

    public void enqueue(Nasabah05 dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah05 dequeue() {
        Nasabah05 dt = new Nasabah05();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public static class nasabahMain {
        public static void menu() {
            System.out.println("Pilih menu: ");
            System.out.println("1. Antrian baru");
            System.out.println("2. Antrian keluar");
            System.out.println("3. Cek antrian terdepan");
            System.out.println("4. Cek semua antrian");
            System.out.println("------------------------");
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int max, pilih;
            System.out.print("Masukkan kapasitas queue: ");
            int jumlah = sc.nextInt();
            Nasabah05 antri = new Nasabah05(jumlah);

            do {
                menu();
                pilih = sc.nextInt();
                sc.nextLine();
                switch (pilih) {
                    case 1:
                        System.out.print("No Rekening   : ");
                        String norek = sc.nextLine();
                        System.out.print("Nama          : ");
                        String nama = sc.nextLine();
                        System.out.print("Alamat        : ");
                        String alamat = sc.nextLine();
                        System.out.print("Umur          : ");
                        int umur = sc.nextInt();
                        System.out.print("Saldo         : ");
                        double saldo = sc.nextDouble();
                        Nasabah05 nb = new Nasabah05(norek, nama, alamat, umur, saldo);
                        sc.nextLine();
                        antri.enqueue(nb);
                        break;
                    case 2:
                        Nasabah05 data = antri.dequeue();
                        if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0) {
                            System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                            break;
                        }
                    case 3:
                        antri.peek();
                        break;
                    case 4:
                        antri.print();
                        break;
                    }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        }
    }
}