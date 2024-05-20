package Kuis2;

public class KlasemenF1 {
    String GPName;
    int[] position;

    public KlasemenF1(String GPName, int[] position) {
        this.GPName = GPName;
        this.position = position;
    }

    public KlasemenF1() {

    }

    public String grandPrixName() {
        return GPName;
    }

    public int[] driverPosition() {
        return position;
    }

    public void printGP(DriverF1[] driver) {
        System.out.println("==================================");
        System.out.println("HASIL PERTANDINGAN TIAP GRAN PRIX");
        System.out.println("=====================================");
        System.out.printf("| %-42s %s|%n", "    Hasil [" + GPName + "]  ", "");
        System.out.println("----------------------------------------------");
        System.out.printf("| %-7s | %-32s |\n", "Posisi", "Nama Pembalap");
        System.out.println("==============================================");
        for (int i = 0; i < position.length; i++) {
            if (position[i] != -1 && position[i] < driver.length) {
              String driverName = driver[position[i]].nameDriver();
              System.out.printf("| %-7s | %-32s |\n", (i + 1), driverName);
            }
        } 
    }
}
