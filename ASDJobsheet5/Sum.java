package ASDJobsheet5;

import java.util.Scanner;

public class Sum {
    
    int elemen;
    double keuntungan[], total;

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }

    public static class mainSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("============================================================");
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
            System.out.print("Masukkan jumlah perusahaan: ");
            int comp = sc.nextInt();

            Sum[] sm = new Sum[comp];
            for (int i = 0; i < comp; i++) {
                System.out.println("============================================================");
                System.out.println("Perusahaan ke-" + (i+1));
                System.out.print("Masukkan jumlah bulan: ");
                int elm = sc.nextInt();
                sm[i] = new Sum(elm);
                for (int j = 0; j < sm[i].elemen; j++) {
                    System.out.print("Masukkan keuntungan bulan ke-" + (j+1) + " : ");
                    sm[i].keuntungan[j] = sc.nextDouble();
                }
            }

            System.out.println("============================================================");
            System.out.println("Algoritma Brute Force");
            for (int i = 0; i < comp; i++) {
                System.out.println("Total keuntungan perusahaan " + (i+1) + " selama " + sm[i].elemen + " bulan adalah: " + sm[i].totalBF(sm[i].keuntungan));

            }
            System.out.println("============================================================");
            System.out.println("Algoritma Divide Conquer");
            for (int i = 0; i < comp; i++) {
                System.out.println("Total keuntungan perusahaan " + (i+1) + " selama " + sm[i].elemen + " bulan adalah: " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
            }
        }
        
    }
}
