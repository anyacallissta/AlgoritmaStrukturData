import java.util.Scanner;

public class Mahasiswa05 {

    public static class DataMahasiswa05 {
        public String namaMhs;
        public int nim;
        public char gender;
        public double ipk;
        public double rataIPK;
        public double topIPK;
    
        void tampilkanData() {
            System.out.println("Nama            : " + namaMhs);
            System.out.println("NIM             : " + nim);
            System.out.println("Jenis Kelamin   : " + gender);
            System.out.println("IPK             : " + ipk);
        }
    
        double meanIPK(DataMahasiswa05[] dataMhs, int j) {
            for (int i = 0; i < j; i++) {
                rataIPK += dataMhs[i].ipk / j;
            }
            return rataIPK;
        }

        double ipkTertinggi(DataMahasiswa05[] dataMhs, int j) {
            topIPK = dataMhs[0].ipk;
            for (int i = 0; i < j; i++) {
                if (dataMhs[i].ipk > topIPK) {
                    topIPK = dataMhs[i].ipk;
                }
            }
            return topIPK;
        }
    }

    public static class MahasiswaMain05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah Mahasiswa: ");
        int j = sc.nextInt();
        DataMahasiswa05[] dataMhs = new DataMahasiswa05[j];
        
        for (int i = 0; i < j; i++) {
            sc.nextLine();
            dataMhs[i] = new DataMahasiswa05();
            System.out.println("Masukkan data Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan Nama                   : ");
            dataMhs[i].namaMhs = sc.nextLine();
            System.out.print("Masukkan NIM                    : ");
            dataMhs[i].nim = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin (P/L)    : ");
            dataMhs[i].gender = sc.nextLine().charAt(0);
            System.out.print("Masukkan IPK                    : ");
            dataMhs[i].ipk = sc.nextDouble();
        }

        System.out.println();
        double rataIPK = dataMhs[0].meanIPK(dataMhs, j);
        double topIPK = dataMhs[0].ipkTertinggi(dataMhs, j);
        for (int i = 0; i < j; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            dataMhs[i].tampilkanData();
        }
        System.out.println("Rata-rata IPK: " + rataIPK);
        System.out.println("IPK tertinggi adalah " + topIPK);
    }
}

    
}
