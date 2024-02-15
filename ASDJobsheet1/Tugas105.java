package ASDJobsheet1;

import java.util.Scanner;

public class Tugas105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char [][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        
        System.out.print("Input salah satu kode plat 'A/B/D/E/F/G/H/L/N/T' (huruf kapital): ");
        char plat = sc.nextLine().charAt(0);
        if (plat == kode[0]) {
            System.out.println(""+kota[0][0]+""+kota[0][1]+""+kota[0][2]+""+kota[0][3]+""+kota[0][4]+""+kota[0][5]);
        } else if (plat == kode[1]) {
            System.out.println(""+kota[1][0]+""+kota[1][1]+""+kota[1][2]+""+kota[1][3]+""+kota[1][4]+""+kota[1][5]+""+kota[1][6]);
        } else if (plat == kode[2]) {
            System.out.println(""+kota[2][0]+""+kota[2][1]+""+kota[2][2]+""+kota[2][3]+""+kota[2][4]+""+kota[2][5]+""+kota[2][6]);
        } else if (plat == kode[3]) {
            System.out.println(""+kota[3][0]+""+kota[3][1]+""+kota[3][2]+""+kota[3][3]+""+kota[3][4]+""+kota[3][5]+""+kota[3][6]);
        } else if (plat == kode[4]) {
            System.out.println(""+kota[4][0]+""+kota[4][1]+""+kota[4][2]+""+kota[4][3]+""+kota[4][4]);
        } else if (plat == kode[5]) {
            System.out.println(""+kota[5][0]+""+kota[5][1]+""+kota[5][2]+""+kota[5][3]+""+kota[5][4]+""+kota[5][5]+""+kota[5][6]+""+kota[5][7]+""+kota[5][8]+""+kota[5][9]);
        } else if (plat == kode[6]) {
            System.out.println(""+kota[6][0]+""+kota[6][1]+""+kota[6][2]+""+kota[6][3]+""+kota[6][4]+""+kota[6][5]+""+kota[6][6]+""+kota[6][7]);
        } else if (plat == kode[7]) {
            System.out.println(""+kota[7][0]+""+kota[7][1]+""+kota[7][2]+""+kota[7][3]+""+kota[7][4]+""+kota[7][5]+""+kota[7][6]+""+kota[7][7]); 
        } else if (plat == kode[8]) {
            System.out.println(""+kota[8][0]+""+kota[8][1]+""+kota[8][2]+""+kota[8][3]+""+kota[8][4]+""+kota[8][5]);
        } else if (plat == kode[9]) {
            System.out.println(""+kota[9][0]+""+kota[9][1]+""+kota[9][2]+""+kota[9][3]+""+kota[9][4]);
        }
    }
    
}
