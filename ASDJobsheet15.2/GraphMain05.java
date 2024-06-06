import java.util.Scanner;

public class GraphMain05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // PERCOBAAN1
        Graph05 gedung = new Graph05(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        System.out.print("Masukkan posisi gedung asal   : ");
        int asal = sc.nextInt();
        System.out.print("Masukkan posisi gedung tujuan : ");
        int tujuan = sc.nextInt();
        gedung.checkEdge(asal, tujuan);
        gedung.removeEdge(1, 3);
        gedung.printGraph();

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
    }
}
