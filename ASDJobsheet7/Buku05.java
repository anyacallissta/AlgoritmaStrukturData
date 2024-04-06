package ASDJobsheet7;

import java.util.Scanner;

public class Buku05 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;
    
    public Buku05(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println("=========================================================");
        System.out.println("Kode buku       : " + kodeBuku);
        System.out.println("Judul buku      : " + judulBuku);
        System.out.println("Tahun terbit    : " + tahunTerbit);
        System.out.println("Pengarang       : " + pengarang);
        System.out.println("Stock           : " + stock);
    }

    public static class PencarianBuku05 {
        Buku05 listBk[] = new Buku05[5];
        int idx;

        void tambah(Buku05 m) {
            if (idx < listBk.length) {
                listBk[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh!");
            }
        }

        void tampil() {
            for (Buku05 m : listBk) {
                m.tampilDataBuku();
            }
        }

        // public int FindSeqSearch(int cari) {
        //     int posisi = -1;
        //     for (int j = 0; j < listBk.length; j++) {
        //         if (listBk[j].kodeBuku == cari) {
        //             posisi = j;
        //             break;
        //         }
        //     }
        //     return posisi;
        // }

        // public Buku05 FindBuku(int cari) {
        //     for (int j = 0; j < listBk.length; j++) {
        //         if (listBk[j].kodeBuku == cari) {
        //             return listBk[j];
        //         }
        //     }
        //     return null;
        // }

        // public int FIndBinarySearch(int cari, int left, int right) {
        //     int mid;
        //     if (right >= left) {
        //         mid = left + (right - left) / 2;
        //         if (cari == listBk[mid].kodeBuku) {
        //             return (mid);
        //         } else if (listBk[mid].kodeBuku > cari) {
        //             return FIndBinarySearch(cari, left, mid - 1);
        //         } else {
        //             return FIndBinarySearch(cari, mid + 1, right);
        //         }
        //     }
        //     return -1;
        // }

        public int FindSeqSearchString(String cari) {
            int posisi = -1;
            for (int j = 0; j < listBk.length; j++) {
                if (listBk[j].kodeBuku.equals(cari)) {
                    posisi = j;
                    break;
                }
            }
            return posisi;
        }

        public int FinBinSearchString(String cari, int left, int right) {
            if (right >= left) {
                int mid = left + (right - left) / 2;
                int result = listBk[mid].kodeBuku.compareTo(cari);
                if (result == 0) {
                    return mid;
                } else if (result > 0) {
                    return FinBinSearchString(cari, left, mid - 1);
                } else {
                    return FinBinSearchString(cari, mid + 1, right);
                }
            }
            return -1;
        }

        public void TampilPosisi(String x, int pos) {
            if (pos != -1) {
                System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
            } else {
                System.out.println("Data : " + x + " tidak ditemukan");
            }
        }

        public void TampilData(String x, int pos) {
            if (pos != -1) {
                System.out.println("Kode buku       : " + x);
                System.out.println("Judul           : " + listBk[pos].judulBuku);
                System.out.println("Tahun terbit    : " + listBk[pos].tahunTerbit);
                System.out.println("Pengarang       : " + listBk[pos].pengarang);
                System.out.println("Stock           : " + listBk[pos].stock);
            } else {
                System.out.println("Data " + x + " tidak ditemukan");
            }
        }

        public static class BukuMain05 {
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                Scanner s1 = new Scanner(System.in);

                PencarianBuku05 data = new PencarianBuku05();
                int jumBuku = 5;

                System.out.println("---------------------------------------------------------");
                System.out.println("Masukkan data buku secara urut dari kode buku terkecil : ");
                for (int i = 0; i < jumBuku; i++) {
                    System.out.println("---------------------------------------------------------");
                    System.out.print("Kode buku     : ");
                    String kodeBuku = s.nextLine();
                    System.out.print("Judul buku    : ");
                    String judulBuku = s1.nextLine();
                    System.out.print("Tahun terbit  : ");
                    int tahunTerbit = s.nextInt();
                    s.nextLine();
                    System.out.print("Pengarang     : ");
                    String pengarang = s1.nextLine();
                    System.out.print("Stock         : ");
                    int stock = s.nextInt();
                    s.nextLine();

                    Buku05 m = new Buku05(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
                    data.tambah(m);
                }
                System.out.println("---------------------------------------------------------");
                System.out.println("Data keseluruhan buku      : ");
                data.tampil();

                System.out.println("_________________________________________________________");
                System.out.println("_________________________________________________________");
                System.out.println("Pencarian data");
                System.out.println("Masukkan kode buku yang dicari");
                System.out.print("Kode buku : ");
                String cari = s.nextLine();
                System.out.println("Menggunakan sequential search");
                // int posisi = data.FindSeqSearch(cari);
                int posisi = data.FindSeqSearchString(cari);
                data.TampilPosisi(cari, posisi);
                data.TampilData(cari, posisi);

                // Buku05 dataBuku = data.FindBuku(cari);
                // dataBuku.tampilDataBuku();

                System.out.println("=========================================================");
                System.out.println("Menggunakan binary search");
                // posisi = data.FIndBinarySearch(cari, 0, jumBuku - 1);
                posisi = data.FinBinSearchString(cari, 0, jumBuku - 1);
                data.TampilPosisi(cari, posisi);
                data.TampilData(cari, posisi);
            }
        }
        
    }
}