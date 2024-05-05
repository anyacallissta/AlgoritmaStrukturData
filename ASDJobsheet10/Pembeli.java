package ASDJobsheet10;

import java.util.Scanner;

public class Pembeli {
    String nama;
    int noHp;

    public Pembeli(String nama, int noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }

    public static class queue {
        Pembeli[] antrian, semuaPembeli;
        int front, rear, size, max;

        public queue(int n) {
            max = n;
            antrian = new Pembeli[max];
            semuaPembeli = new Pembeli[max];
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

        public void enqueue(Pembeli antri) {
            if (isFull()) {
                System.out.println("Antrian sudah penuh");
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
                antrian[rear] = antri;
                semuaPembeli[size] = antri;
                size++;
            }
        }
    
        public int dequeue() {
            Pembeli antri = null;
            if (isEmpty()) {
                System.out.println("Antrian masih kosong");
            } else {
                antri = antrian[front];
                antrian[front] = null;
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
            return front;
        }

        public void print() {
            if (isEmpty()) {
                System.out.println("Antrian masih kosong");
            } else {
                int i = front;
                while (i != rear) {
                    System.out.println("Nama: " + antrian[i].nama + " No HP: " + antrian[i].noHp);
                    i = (i + 1) % max;
                }
                System.out.println("Nama: " + antrian[i].nama + " No HP: " + antrian[i].noHp);
                System.out.println("Jumlah antrian: " + size);
            }
        }

        public void peek() {
            if (!isEmpty()) {
                System.out.println("Pembeli terdepan: " + antrian[front].nama + " " + antrian[front].noHp);
            } else {
                System.out.println("Antrian masih kosong");
            }
        }

        public void peekRear() {
            if (!isEmpty()) {
                System.out.println("Pembeli paling belakang: " + antrian[rear].nama + " " + antrian[rear].noHp);
            } else {
                System.out.println("Antrian masih kosong");
            }
        }

        public void peekPosition(String nama) {
            if (!isEmpty()) {
                for (int i = front; i != (rear + 1) % max; i = (i + 1) % max) {
                    if (antrian[i] != null && antrian[i].nama.equalsIgnoreCase(nama)) {
                        System.out.println("Pembeli " + nama + " berada di antrian ke-" + ((i - front + max) % max + 1));
                        return;
                    }
                }
                System.out.println("Pembeli " + nama + " tidak ditemukan di dalam antrian");
            } else {
                System.out.println("Antrian masih kosong");
            }
        }

        public void daftarPembeli() {
            if (!isEmpty()) {
                System.out.println("Daftar seluruh pembeli: ");
                for (int i = 0; i < max; i++) {
                    if (semuaPembeli[i] != null) {
                        System.out.printf("%d. Nama: %s | No HP: %d\n", (i + 1), semuaPembeli[i].nama, semuaPembeli[i].noHp);
                    }
                }
            } else {
                System.out.println("Antrian masih kosong");
            }
        }

        public static void menu() {
            System.out.println("\n1. Pembeli baru");
            System.out.println("2. Antrian terdepan keluar");
            System.out.println("3. Pembeli terdepan");
            System.out.println("4. Pembeli paling belakang");
            System.out.println("5. Lihat posisi pembeli");
            System.out.println("6. Daftar antrian");
            System.out.println("7. Daftar semua pembeli");
            System.out.print("Pilih menu (1/2/3/4/5/6/7): ");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan kapasitas antrian: ");
            int n = sc.nextInt();
            sc.nextLine();
            queue warung = new queue(n);
            int pilih;
            do {
                menu();
                pilih = sc.nextInt();
                sc.nextLine();
                switch (pilih) {
                    case 1:
                        System.out.print("Nama pembeli  : ");
                        String nama = sc.nextLine();
                        System.out.print("No HP pembeli : ");
                        int noHp = sc.nextInt();
                        sc.nextLine();
                        Pembeli pembeli = new Pembeli(nama, noHp);
                        warung.enqueue(pembeli);
                        break;

                    case 2:
                        int dataKeluar = warung.dequeue();
                        if (dataKeluar != -1) {
                            System.out.println("Antrian terdepan telah keluar");
                            break;
                        }

                    case 3:
                        warung.peek();
                        break;

                    case 4:
                        warung.peekRear();
                        break;
                    
                    case 5:
                        System.out.print("Masukkan nama pembeli yang ingin dicari: ");
                        String cariNama = sc.nextLine();
                        warung.peekPosition(cariNama);
                        break;

                    case 6:
                        warung.print();
                        break;

                    case 7:
                        warung.daftarPembeli();
                        break;
                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
        }
    }
}
