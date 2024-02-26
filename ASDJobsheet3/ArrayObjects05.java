import java.util.Scanner;

public class ArrayObjects05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya persegi panjang: ");
        int j = sc.nextInt();
        PersegiPanjang05[] ppArray = new PersegiPanjang05[j];


        for (int i = 0; i < j; i++) {
            ppArray[i] = new PersegiPanjang05();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        System.out.println();
        for (int i = 0; i < j; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
    
}