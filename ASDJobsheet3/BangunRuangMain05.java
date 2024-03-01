import java.util.Scanner;

public class BangunRuangMain05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n======================================================================");
        System.out.println("                              KERUCUT                                 ");
        System.out.println("======================================================================");
        System.out.print("Masukkan banyak kerucut: ");
        int j = sc.nextInt();
        Kerucut05 [] krctArray = new Kerucut05[j];

        for (int i = 0; i < j; i++) {
            krctArray[i] = new Kerucut05();
            System.out.println("Kerucut ke-" + (i+1));
            System.out.print("Masukkan jari-jari: ");
            krctArray[i].jariJari = sc.nextDouble();
            System.out.print("Masukkan sisi miring: ");
            krctArray[i].sisiMiring = sc.nextDouble();
        }

        for (int i = 0; i < j; i++) {
            System.out.println("Kerucut ke-" + (i+1));
            System.out.println("Luas Permukaan: " + krctArray[i].luasPermukaanKerucut() + " Volume: " + krctArray[i].volumeKerucut());
        }

        System.out.println("\n======================================================================");
        System.out.println("                            LIMAS PERSEGI                             ");
        System.out.println("======================================================================");
        System.out.print("Masukkan banyak limas persegi: ");
        int l = sc.nextInt();
        LimasPersegi05 [] lmsArray = new LimasPersegi05[l];

        for (int k = 0; k < l; k++) {
            lmsArray[k] = new LimasPersegi05();
            System.out.println("Limas Persegi ke-" + (k+1));
            System.out.print("Masukkan alas limas: ");
            lmsArray[k].alasLimas = sc.nextDouble();
            System.out.print("Masukkan tinggi limas: ");
            lmsArray[k].tinggiLimas = sc.nextDouble();
        }

        for (int k = 0; k < l; k++) {
            System.out.println("Limas Persegi ke-" + (k+1));
            System.out.println("Luas Permukaan: " + lmsArray[k].luasPermukaanLimas() + " Volume: " + lmsArray[k].volumeLimas());
        }

        System.out.println("\n======================================================================");
        System.out.println("                                BOLA                                  ");
        System.out.println("======================================================================");
        System.out.print("Masukkan banyak bola: ");
        int n = sc.nextInt();        
        Bola05 [] ballArray = new Bola05[n];

        for (int m = 0; m < n; m++) {
            ballArray[m] = new Bola05();
            System.out.println("Bola ke-" + (m+1));
            System.out.print("Masukkan jari-jari: ");
            ballArray[m].r = sc.nextDouble();
        }

        for (int m = 0; m < n; m++) {
            System.out.println("Bola ke-" + (m+1));
            System.out.println("Luas Permukaan: " + ballArray[m].luasPermukaanBola() + " Volume: " + ballArray[m].volumeBola());
        }
    }
}
