package ASDJobsheet8;

import java.util.Scanner;

public class Utama05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = scanner.nextInt();
        Gudang05 gudang = new Gudang05(kapasitas);

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang      : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang      : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori    : ");
                    String kategori = scanner.nextLine();
                    Barang05 barangBaru = new Barang05(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    gudang.lihatBarangTeratas();
                    break;

                case 5:
                    gudang.lihatBarangTerbawah();
                    break;                    

                case 6:
                    System.out.println("1. Kode barang");
                    System.out.println("2. Nama barang");
                    System.out.print("Cari barang berdasarkan (1/2): ");
                    int choose = scanner.nextInt();
                    scanner.nextLine();
                    if (choose == 1) {
                        System.out.print("Masukkan kode barang yang dicari: ");
                        int cariKode = scanner.nextInt();
                        gudang.cariKodeBarang(cariKode);
                    } else if (choose == 2) {
                        System.out.print("Masukkan nama barang yang dicari: ");
                        String cariNama = scanner.nextLine();
                        gudang.cariNamaBarang(cariNama);
                    }
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");;
            }
        }
    }
}
