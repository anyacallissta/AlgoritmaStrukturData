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
            System.out.print("Masukkan jumlah bulan: ");
            int elm = sc.nextInt();

            Sum sm = new Sum(elm);
            System.out.println("============================================================");
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("Masukkan untung bulan ke-" + (i+1) + " = ");
                sm.keuntungan[i] = sc.nextDouble();
            }

            System.out.println("============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah: " + sm.totalBF(sm.keuntungan));
            System.out.println("============================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah: " + sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
        }
        
    }
}
