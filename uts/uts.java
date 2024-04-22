package uts;

import java.util.Scanner;

public class uts {
    static int[] angka = {35, 42, 47, 17, 37, 45, 10, 22, 1, 19, 19, 1, 17, 47, 50, 44, 18};

    public static void insertionSort(int[] angka) {
        for (int i = 1; i < angka.length; i ++) {
            int temp = angka[i];
            int j = i - 1;
            while (j >= 0 && angka[j] > temp) {
                angka[j + 1] = angka[j];
                j = j -1;
            }
            angka[j + 1] = temp;
        }
    }

    public static int binarySearch(int search, int right, int left) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (search == angka[mid]) {
                return (mid);
            } else if (angka[mid] > search) {
                return binarySearch(search, left, mid - 1);
            } else {
                return binarySearch(search, mid + 1, right);
            }
        }
        return - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = angka.length;

        System.out.println("Data sebelum diurutkan: ");
        for (int i = 0; i < length; i++) {
            System.out.print("" + angka[i] + " ");
        }

        insertionSort(angka);
        System.out.println("\nData setelah pengurutan ascending: ");
        for (int j = 0; j < length; j++) {
            System.out.print("" + angka[j] + " ");
        }
        System.out.print("\nMasukkan angka yang dicari ");
        int search = sc.nextInt();
        int position = binarySearch(search, 0, length - 1);

        if (position == -1) {
            System.out.println("Angka " + search + " tidak ditemukan");
        } else {
            System.out.println("Angka " + search + " ditemukan pada indeks ke-" + position);
        }
    }
    
}
