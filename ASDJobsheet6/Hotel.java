package ASDJobsheet6;

import java.util.Scanner;

public class Hotel {
    String nama, kota;
    int harga;
    byte bintang;

    Hotel(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    public static class HotelService {
        Hotel[] rooms = new Hotel[5];
        int idx;

        void tambahHotel(Hotel h){
            if (idx < rooms.length) {
                rooms[idx] = h;
                idx++;
            } else {
                System.out.println("Data sudah penuh");
            }
        }

        void tampilAll() {
            for (Hotel h : rooms) {
                System.out.println("Nama hotel  : " + h.nama);
                System.out.println("Kota        : " + h.kota);
                System.out.println("Harga       : " + h.harga);
                System.out.println("Bintang     : " + h.bintang);
                System.out.println("-------------------------");
            }
        }

        void BSAscHarga() {
            for (int i = 0; i < rooms.length - 1; i++) {
                for (int j = 1; j < rooms.length - i; j++) {
                    if (rooms[j] != null && rooms[j-1] != null) {
                        if (rooms[j].harga < rooms[j-1].harga) {
                            Hotel tmp = rooms[j];
                            rooms[j] = rooms[j-1];
                            rooms[j-1] = tmp;
                        }
                    }
                }
            }
        }

        void SSAscHarga() {
            for (int i = 0; i < rooms.length - 1; i++) {
                int idxMin = i;
                for (int j = i+1; j < rooms.length; j++) {
                    if (rooms[j].harga < rooms[idxMin].harga) {
                        idxMin = j;
                    }
                }
                Hotel tmp = rooms[idxMin];
                rooms[idxMin] = rooms[i];
                rooms[i] = tmp;
            }
        }

        void BSDescBintang() {
            for (int i = 0; i < rooms.length; i++) {
                for (int j = 1; j < rooms.length - i; j++) {
                    if (rooms[j].bintang > rooms[j-1].bintang) {
                        Hotel tmp = rooms[j];
                        rooms[j] = rooms[j-1];
                        rooms[j-1] = tmp;
                    }
                }
            }
        }

        void SSDescBIntang() {
            for (int i = 0; i < rooms.length - 1; i++) {
                int idxMin = i;
                for (int j = i+1; j < rooms.length; j++) {
                    if (rooms[j].bintang > rooms[idxMin].bintang) {
                        idxMin = j;
                    }
                }
                Hotel tmp = rooms[idxMin];
                rooms[idxMin] = rooms[i];
            }
        }
    }

    public static class mainHotel {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            HotelService listrooms = new HotelService();
            Hotel h1 = new Hotel("Four Season", "Bali", 1000000, (byte)5);
            Hotel h2 = new Hotel("Mandapa", "Bali", 9000000, (byte)5);
            Hotel h3 = new Hotel("DoubleTree", "Jakarta", 2000000, (byte)4);
            Hotel h4 = new Hotel("Oberoi", "Lombok", 4000000, (byte)5);
            Hotel h5 = new Hotel("Amanjiwo", "Magelang", 5000000, (byte)4);

            listrooms.tambahHotel(h1);
            listrooms.tambahHotel(h2);
            listrooms.tambahHotel(h3);
            listrooms.tambahHotel(h4);
            listrooms.tambahHotel(h5);

            System.out.println("Filter daftar rekomendasi hotel");
            System.out.println("1. Mulai harga termurah (bubble sort)");
            System.out.println("2. Mulai harga termurah (selection sort)");
            System.out.println("3. Mulai rating tertinggi (bubble sort)");
            System.out.println("4. Mulai rating tertinggi (selection sort)");
            System.out.print("Pilih filter (1/2/3/4): ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("=================================================");
                    System.out.println("| Daftar Rekomendasi Hotel Mulai Harga Termurah |");
                    System.out.println("|                   Bubble Sort                 |");
                    System.out.println("=================================================");
                    listrooms.BSAscHarga();
                    listrooms.tampilAll();
                    break;
            
                case 2:
                    System.out.println("=================================================");
                    System.out.println("| Daftar Rekomendasi Hotel Mulai Harga Termurah |");
                    System.out.println("|                  Selection Sort               |");
                    System.out.println("=================================================");
                    listrooms.SSAscHarga();
                    listrooms.tampilAll();
                    break;

                case 3:
                    System.out.println("===================================================");
                    System.out.println("| Daftar Rekomendasi Hotel Mulai Rating Tertinggi |");
                    System.out.println("|                     Bubble Sort                 |");
                    System.out.println("===================================================");
                    listrooms.BSDescBintang();;
                    listrooms.tampilAll();
                    break;

                case 4:
                    System.out.println("===================================================");
                    System.out.println("| Daftar Rekomendasi Hotel Mulai Rating Tertinggi |");
                    System.out.println("|                   Selection Sort                |");
                    System.out.println("===================================================");
                    listrooms.SSDescBIntang();
                    listrooms.tampilAll();
                    break;

                default:
                    break;
            }
        }
        
    }
}
