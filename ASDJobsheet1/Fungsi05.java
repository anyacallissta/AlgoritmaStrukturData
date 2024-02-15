package ASDJobsheet1;

public class Fungsi05 {
    static int [][] n = new int[4][4];
    static int penjualanRG1, penjualanRG2, penjualanRG3, penjualanRG4;
    static int [][] s = new int[1][4];
    static int hargaAglonema = 75000;
    static int hargaKeladi = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar = 10000;
    
    static void RoyalGarden1() {
        n[0][0] = 10;
        n[0][1] = 5;
        n[0][2] = 15;
        n[0][3] = 7;
        penjualanRG1 = (n[0][0] * hargaAglonema) + (n[0][1] * hargaKeladi) + (n[0][2] * hargaAlocasia) + (n[0][3] * hargaMawar);
    }

    static void RoyalGarden2() {
        n[1][0] = 6;
        n[1][1] = 11;
        n[1][2] = 9;
        n[1][3] = 12;
        penjualanRG2 = (n[1][0] * hargaAglonema) + (n[1][1] * hargaKeladi) + (n[1][2] * hargaAlocasia) + (n[1][3] * hargaMawar);
    }

    static void RoyalGarden3() {
        n[2][0] = 2;
        n[2][1] = 10;
        n[2][2] = 10;
        n[2][3] = 5;
        penjualanRG3 = (n[2][0] * hargaAglonema) + (n[2][1] * hargaKeladi) + (n[2][2] * hargaAlocasia) + (n[2][3] * hargaMawar);
    }

    static void RoyalGarden4() {
        n[3][0] = 5;
        n[3][1] = 7;
        n[3][2] = 12;
        n[3][3] = 9;
        penjualanRG4 = (n[3][0] * hargaAglonema) + (n[3][1] * hargaKeladi) + (n[3][2] * hargaAlocasia) + (n[3][3] * hargaMawar);
        s[0][0] = n[3][0] - 1;
        s[0][1] = n[3][1] - 2;
        s[0][2] = n[3][2] - 0;
        s[0][3] = n[3][3] - 5;
    }
    public static void main(String[] args) {
        RoyalGarden1();
        RoyalGarden2();
        RoyalGarden3();
        RoyalGarden4();

        System.out.println(" Nama Toko      Aglonema   Keladi   Alocasia   Mawar   Penjualan");
        System.out.println("RoyalGarden1       " +n[0][0]+"         "+n[0][1]+"        "+n[0][2]+"        "+n[0][3]+"      "+penjualanRG1);
        System.out.println("RoyalGarden2        " +n[1][0]+"        "+n[1][1]+"         "+n[1][2]+"       "+n[1][3]+"      "+penjualanRG2);
        System.out.println("RoyalGarden3        " +n[2][0]+"        "+n[2][1]+"        "+n[2][2]+"        "+n[2][3]+"      "+penjualanRG3);
        System.out.println("RoyalGarden4        " +n[3][0]+"         "+n[3][1]+"        "+n[3][2]+"        "+n[3][3]+"      "+penjualanRG4);
        System.out.println("================================================================");
        System.out.println("Stock RoyalGarden4  " +s[0][0]+"         "+s[0][1]+"        "+s[0][2]+"        "+s[0][3]);
    }
}
