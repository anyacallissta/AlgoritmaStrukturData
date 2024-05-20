package Kuis2;
import java.util.Scanner;

public class MainF1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KlasemenF1[] resultK = new KlasemenF1[23];
        DLL F1 = new DLL();
        int choose;

        DriverF1[] drivers = {
            new DriverF1("Max Verstappen"),
            new DriverF1("Sergio Perez"),
            new DriverF1("Lewis Hamilton"),
            new DriverF1("Fernando Alonso"),
            new DriverF1("Charles Leclerc"),
            new DriverF1("Lando Norris"),
            new DriverF1("Carlos Sainz"),
            new DriverF1("George Russell"),
            new DriverF1("Oscar Piastri"),
            new DriverF1("Lance Stroll"),
            new DriverF1("Pierre Gasly"),
            new DriverF1("Esteban Ocon"),
            new DriverF1("Alexander Albon"),
            new DriverF1("Yuki Tsunoda"),
            new DriverF1("Valtteri Bottas"),
            new DriverF1("Nico Hulkenberg"),
            new DriverF1("Zhou Guanyu"),
            new DriverF1("Kevin Magnussen"),
            new DriverF1("Logan Sargeant"),
            new DriverF1("Nyck De Vries"),
        };

        for (DriverF1 driver : drivers) {
            F1.addDriver(driver);
        }

        for (KlasemenF1 klasemen : resultK) {
            if (klasemen != null) {
                DLL.pointF1(F1, drivers, klasemen);
            }
        }
        
        int[][] position = {
            //bahrain
            { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
            //saudi arabia
            { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0 },
            //australia
            { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1 },
            //azerbaijan
            { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2 },
            //miami
            { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3 },
            //emilia romagna
            {},
            //monaco
            { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3, 4 },
            //spain
            { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
            //canada
            { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0 },
            //austria
            { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1 },
            //britania
            { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2 },
            //hungary
            { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3 },
            //belgium
            { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3, 4 },
            //netherland
            { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0 },
            //italy
            { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1 },
            //singapore
            { 0, 2, 3, 1, 4, 6, 7, 10, 19, 15, 5, 8, 9, 14, 12, 11, 13, 16, 17, 18 },
            //japan
            { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2 },
            //qatar
            { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3, 4 },
            //us
            { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
            //mexico
            { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0 },
            //brazil
            { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0 },
            //lv
            { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1 },
            //abu dhabi
            { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3 },
        };

        do {
            System.out.println("==================================");
            System.out.println("          FORMULA ONE 2023        ");
            System.out.println("==================================");
            System.out.println("1. Hasil Pertandingan GP Tertentu");
            System.out.println("2. Driver Standings");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("==================================");
                    System.out.println("              GRAND PRIX          ");
                    System.out.println("==================================");
                    System.out.println("1. Bahrain Grand Prix");
                    System.out.println("2. Saudi Arabian Grand Prix");
                    System.out.println("3. Australi Grand Prix");
                    System.out.println("4. Azerbaijan Grand Prix");
                    System.out.println("5. Miami Grand Prix");
                    System.out.println("6. Emilia Romagna Grand Prix");
                    System.out.println("7. Monaco Grand Prix");
                    System.out.println("8. Spain Grand Prix");
                    System.out.println("9. Canada Grand Prix");
                    System.out.println("10. Austria Grand Prix");
                    System.out.println("11. Great Britain Grand Prix");
                    System.out.println("12. Hungary Grand Prix");
                    System.out.println("13. Belgium Grand Prix");
                    System.out.println("14. Netherland Grand Prix");
                    System.out.println("15. Italy Romagna Grand Prix");
                    System.out.println("16. Singapore Grand Prix");
                    System.out.println("17. Japan Grand Prix");
                    System.out.println("18. Qatar Grand Prix");
                    System.out.println("19. United States Grand Prix");
                    System.out.println("20. Mexico Grand Prix");
                    System.out.println( "21. Brazil Grand Prix");
                    System.out.println( "22. Las Vegas Grand Prix");
                    System.out.println("23. Abu Dhabi Grand Prix");
                    System.out.println("Pilih Grand Prix");
                    int chooseGP = sc.nextInt();
                    String grandPrixName = DLL.GrandPrix(chooseGP);
                    if (!grandPrixName.equals("Tidak Valid")) {
                        F1.print(sc, resultK, grandPrixName, drivers);
                    } else {
                        System.out.println("Grand Prix tidak valid.");
                    }
                    break;

                case 2:
                    F1.printStanding();
                    break;

                default:
                    break;
            }
        } while (choose != 3);
    }
}
