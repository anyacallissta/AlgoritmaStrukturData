package ASDJobsheet1;

import java.util.Scanner;

public class Pemilihan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("= AKUMULASI NILAI AKHIR MAHASISWA =");
        System.out.println("===================================");
        System.out.print("Masukkan Nilai Tugas  : ");
        float tugas = sc.nextFloat();
        System.out.print("Masukkan Nilai Kuis   : ");
        float kuis = sc.nextFloat();
        System.out.print("Masukkan Nilai UTS    : ");
        float uts = sc.nextFloat();
        System.out.print("Masukkan Nilai UAS    : ");
        float uas = sc.nextFloat();
            
        if (tugas < 0 || tugas > 100 || kuis < 0 && kuis > 100 || uts < 0 && uts > 100 || uas < 0 && uas > 100) {
            System.out.print("Nilai tidak valid.");
        }      

        float nilaiAkhir = (tugas * 0.2F) + (kuis * 0.2F) + (uts * 0.3F) + (uas * 0.4F);
        String nilaiHuruf = sc.nextLine();

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >73 && nilaiAkhir <=80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >65 && nilaiAkhir <=73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >60 && nilaiAkhir <=65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >39 && nilaiAkhir <=50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        
        
        System.out.println("\n===================================");
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("===================================");

        if (nilaiHuruf == "A" || nilaiHuruf == "B+" || nilaiHuruf == "B" || nilaiHuruf == "C+" || nilaiHuruf == "C") {
            System.out.println("Anda dinyatakan 'LULUS'");
        } else {
            System.out.println("Anda dinyatakan 'TIDAK LULUS'");
        }
    }
}
