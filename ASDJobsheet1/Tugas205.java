package ASDJobsheet1;

import java.util.Scanner;

public class Tugas205 {
    static float v, s, t;
    static Scanner sc = new Scanner(System.in);

    static void kecepatan() {
        System.out.print("Masukkan jarak : ");
        s = sc.nextFloat();
        System.out.print("Masukkan waktu : ");
        t = sc.nextFloat();
        v = s/t;
        System.out.println("Hasil perhitungan : " +v);
    }

    static void jarak() {
        System.out.print("Masukkan kecepatan : ");
        v = sc.nextFloat();
        System.out.print("Masukkan waktu : ");
        t = sc.nextFloat();
        s = v*t;
        System.out.println("Hasil perhitungan : " +s);
    }

    static void waktu() {
        System.out.print("Masukkan jarak : ");
        s = sc.nextFloat();
        System.out.print("Masukkan kecepatan : ");
        v = sc.nextFloat();
        t = s/v;
        System.out.println("Hasil perhitungan : " +t);
    }
    public static void main(String[] args) {
        System.out.println("1. Menghitung Kecepatan");
        System.out.println("2. Menghitung Jarak");
        System.out.println("3. Menghitung Waktu");
        System.out.print("Pilih Menu (1/2/3): ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                kecepatan();
                break;
        
            case 2:
                jarak();
                break;

            case 3:
                waktu();
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
