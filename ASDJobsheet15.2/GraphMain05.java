import java.util.Scanner;

public class GraphMain05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // PERCOBAAN1
        // Graph05 gedung = new Graph05(6);
        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);
        // gedung.degree(0);
        // gedung.printGraph();
        // System.out.print("Masukkan posisi gedung asal   : ");
        // int asal = sc.nextInt();
        // System.out.print("Masukkan posisi gedung tujuan : ");
        // int tujuan = sc.nextInt();
        // gedung.checkEdge(asal, tujuan);
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();

        // PERCOBAAN 2
        // GraphMatriks05 gdg = new GraphMatriks05(4);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("\nHasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();

        // TUGAS
        System.out.print("Masukkan kapasitas gedung : ");
        int k = sc.nextInt();
        Graph05 gedung = new Graph05(k);
        int choose;;
        do {
            System.out.println("\n===========================================");
            System.out.println("|               GRAF GEDUNG               |");
            System.out.println("===========================================");
            System.out.println("| 1. Add Edge                             |");
            System.out.println("| 2. Remove Edge                          |");
            System.out.println("| 3. Degree                               |");
            System.out.println("| 4. Print Graph                          |");
            System.out.println("| 5. Check Edge                           |");
            System.out.println("| 6. Update Distance                      |");
            System.out.println("| 7. Counting Edge                        |");
            System.out.println("| 8. Exit                                 |");
            System.out.println("===========================================");
            System.out.print("Pilih Menu (1/2/3/4/5/6): ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("\n===========================================");
                    System.out.println("|            MENAMBAHKAN GEDUNG           |");
                    System.out.println("===========================================");
                    System.out.print("Masukkan posisi gedung asal   : ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan posisi gedung tujuan : ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak antara gedung  : ");
                    int jarak = sc.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;

                case 2:
                    System.out.println("\n===========================================");
                    System.out.println("|       MENGHAPUS JALUR ANTAR GEDUNG      |");
                    System.out.println("===========================================");
                    System.out.print("Masukkan posisi gedung asal   : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan posisi gedung tujuan : ");
                    tujuan = sc.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;

                case 3:
                    System.out.println("\n===========================================");
                    System.out.println("| MENAMPILKAN JUMLAH LINTASAN TIAP GEDUNG |");
                    System.out.println("===========================================");
                    System.out.print("Masukkan posisi gedung asal   : ");
                    asal = sc.nextInt();
                    gedung.degree(asal);
                    break;
                
                case 4:
                    System.out.println("\n===========================================");
                    System.out.println("|               MENCETAK GRAF             |");
                    System.out.println("===========================================");
                    gedung.printGraph();
                    break;

                case 5:
                    System.out.println("\n===========================================");
                    System.out.println("|        MENGECEK JALUR ANTAR GEDUNG      |");
                    System.out.println("===========================================");
                    System.out.print("Masukkan posisi gedung asal   : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan posisi gedung tujuan : ");
                    tujuan = sc.nextInt();
                    gedung.checkEdge(asal, tujuan);
                    break;

                case 6:
                    System.out.println("\n===========================================");
                    System.out.println("|        MENGUBAH JARAK ANTAR GEDUNG      |");
                    System.out.println("===========================================");
                    System.out.print("Masukkan posisi gedung asal   : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan posisi gedung tujuan : ");
                    tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak antara gedung  : ");
                    jarak = sc.nextInt();
                    gedung.updateJarak(asal, tujuan, jarak);
                    break;

                case 7:
                    System.out.println("\n===========================================");
                    System.out.println("|           MENGHITUNG JUMLAH EDGE        |");
                    System.out.println("===========================================");
                    gedung.hitungEdge();
                    break;

                default:
                    break;
            }
        } while (choose != 8);
    }
}
