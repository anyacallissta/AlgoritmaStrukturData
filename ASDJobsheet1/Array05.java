package ASDJobsheet1;

import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaiMK = new int[8];
        String [] nilaiHuruf = new String[8];
        double [] bobotNilai = new double[8];
        int i = 0;
        double totalSks = 0, nsks = 0;

        String [] matkul = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critikal Thinking and Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"    
        };

        int [] sks = {
            2,
            4,
            4,
            6,
            4,
            4,
            6,
            4
        };

        for (int j = 0; j < sks.length; j++) {
            totalSks += sks[j];
        }

        for ( i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka mata kuliah " +matkul[i]+ ": ");
            nilaiMK[i] = sc.nextInt();
        }

        for (int j = 0; j < i; j++) {
            if (nilaiMK[j] > 80 && nilaiMK[j] <= 100) {
                nilaiHuruf[j] = "A";
                bobotNilai[j] = 4.0;
            } else if (nilaiMK[j] >73 && nilaiMK[j] <=80) {
                nilaiHuruf[j] = "B+";
                bobotNilai[j] = 3.5;
            } else if (nilaiMK[j] >65 && nilaiMK[j] <=73) {
                nilaiHuruf[j] = "B";
                bobotNilai[j] = 3.0;
            } else if (nilaiMK[j] >60 && nilaiMK[j] <=65) {
                nilaiHuruf[j] = "C+";
                bobotNilai[j] = 2.5;
            } else if (nilaiMK[j] >50 && nilaiMK[j] <=60) {
                nilaiHuruf[j] = "C";
                bobotNilai[j] = 2.0;
            } else if (nilaiMK[j] >39 && nilaiMK[j] <=50) {
                nilaiHuruf[j] = "D";
                bobotNilai[j] = 1.0;
            } else {
                nilaiHuruf[j] = "E";
                bobotNilai[j] = 0.0;
            }

            nsks += bobotNilai[j] * sks[j];
        }    

        double ip = nsks / totalSks;

        System.out.println();
        System.out.println("                                      HASIL KONVERSI NILAI                                     ");
        System.out.println("===============================================================================================");
        System.out.println("|   Mata Kuliah                           |   Nilai Angka  |   Nilai Huruf   |   Nilai Setara |");
        System.out.println("===============================================================================================");
        for (int j = 0; j < i; j++) {
            System.out.printf("| %-39s | %-14d | %-15s | %-14.2f |\n", matkul[j], nilaiMK[j], nilaiHuruf[j], bobotNilai[j]);
        }
        System.out.printf("\nIP: %.2f\n", ip);
        System.out.println("===============================================================================================");
    }
}
