package ASDJobsheet5;

import java.util.Scanner;

public class BruteForceDivideConquer {

    public static class Faktorial {
    
        public int nilai;

        int faktorialBF(int n) {
            int fakto = 1;
            for (int i = 1; i <= n; i++) {
                fakto = fakto * i;
            }
            return fakto;
        }

        int faktorialDC(int n) {
            if (n == 1) {
                return 1;
            }
            else {
                int fakto = n * faktorialDC(n-1);
                return fakto;
            }
        }
        
    }

    public static class mainFaktorial {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------------------------------------------------------------");
            System.out.print("Masukkan jumlah elemen: ");
            int iJml = sc.nextInt();
    
            Faktorial[] fk = new Faktorial[10];
            for (int i = 0; i < iJml; i++) {
                fk[i] = new Faktorial();
                System.out.print("Masukkan nilai data ke-" + (i+1) + ": ");
                int iNilai = sc.nextInt();
                fk[i].nilai = iNilai;
            }
    
            System.out.println("HASIL - BRUTE FORCE");
            for (int i = 0; i < iJml; i++) {
                System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah: " + fk[i].faktorialBF(fk[i].nilai));
            }
    
            System.out.println("HASIL - DIVIDE CONQUER");
            for (int i = 0; i < iJml; i++) {
                System.out.println("Hasil perhitungan faktorial menggunakan Divide Concure adalah: " + fk[i].faktorialDC(fk[i].nilai));
            }
        }
        
    }
    
}
