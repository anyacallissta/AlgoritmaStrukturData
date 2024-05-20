package Kuis2;
import java.sql.Driver;
import java.util.LinkedList;
import java.util.Scanner;

public class DLL {
    NodeF1 head, tail;

    public DLL() {
        this.head = null;
        this.tail = null;
    }

    public void addDriver(DriverF1 driver) {
        NodeF1 newNode = new NodeF1(null, driver, null);
        if (head == null || head.dataDriver.pointDriver() < driver.pointDriver()) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        } else {
            NodeF1 current = head;
            while (current.next != null && current.next.dataDriver.pointDriver() >= driver.pointDriver()) {
                current = current.next;
            }
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }   
            newNode.prev = current;
            current.next = newNode;
        }
    }

    public void sortDescending() {
        NodeF1 current = head;
        NodeF1 index = null;
        DriverF1 temp;
    
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.dataDriver.pointDriver() < index.dataDriver.pointDriver()) {
                        temp = current.dataDriver;
                        current.dataDriver = index.dataDriver;
                        index.dataDriver = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    
    public void updatePoints(String name, int points) {
        NodeF1 current = head;
        while (current != null) {
            if (current.dataDriver.nameDriver().equals(name)) {
                current.dataDriver.addPoint(points);
                return;
            }
            current = current.next;
        }
    }

    public static void insertResult(Scanner scanner, DLL standing, DriverF1[] drivers, KlasemenF1[] resultF1, int noGP) {
        String nameGP = GrandPrix(noGP);
        int[] racePositions = new int[drivers.length];

        for (int i = 0; i < drivers.length; i++) {
            System.out.print("| Masukkan Posisi " + drivers[i].nameDriver() + ": ");
            int position = scanner.nextInt();
            if (position >= 1 && position <= drivers.length) {
                racePositions[position - 1] = i; 
                } else {
                System.out.println("Posisi tidak valid. Harus antara 1 dan " + drivers.length);
                i--; 
            }

            resultF1[noGP - 1] = new KlasemenF1 (nameGP, racePositions);
            pointF1(standing, drivers, resultF1[noGP - 1]);
        }
    }

    public void printStanding() {
        NodeF1 current = head;
        int i = 1;
        System.out.println("============================================");
        System.out.println("            HASIL STANDING F1 2023          ");
        System.out.println("============================================");
        System.out.printf(" %-7s | %-25s | %-5s \n", "Pos", "Nama", "Poin");
        while (current != null) {
            System.out.printf(" %-7d | %-25s | %-5d \n", i, current.dataDriver.nameDriver(), current.dataDriver.pointDriver());
            current = current.next;
            i++;
        }
    }

    public static void pointF1(DLL standing, DriverF1[] drivers, KlasemenF1 result) {
        int[] points = { 25, 18, 15, 12, 10, 8, 6, 4, 2, 1 }; 

        for (int i = 0; i < result.position.length; i++) {
        int driverIndex = result.position[i];
            if (driverIndex >= 0 && driverIndex < drivers.length) {
                int point = (i < points.length) ? points[i] : 0;
                standing.updatePoints(drivers[driverIndex].nameDriver(), point);
            }
        }
    }
  

    public static String GrandPrix(int chooseGP) {
        switch (chooseGP) {
            case 1:
                return "Bahrain Grand Prix";
            case 2:
                return "Saudi Arabia Grand Prix";
            case 3:
                return "Australia Grand Prix";
            case 4:
                return "Azerbaijan Grand Prix";
            case 5:
                return "Miami Grand Prix";
            case 6:
                return "Pertandingan di Emilia Romagna dibatalkan";
            case 7:
                return "Monaco Grand Prix";
            case 8:
                return "Spain Grand Prix";
            case 9:
                return "Canada Grand Prix";
            case 10:
                return "Austria nGrand Prix";
            case 11:
                return "Great Britain Grand Prix";
            case 12:
                return "Hungary Grand Prix";
            case 13:
                return "Belgium Grand Prix";
            case 14:
                return "Netherland Grand Prix";
            case 15:
                return "Italy Romagna Grand Prix";
            case 16:
                return "Singapore Grand Prix";
            case 17:
                return "Japan Grand Prix";
            case 18:
                return "Qatar Grand Prix";
            case 19:
                return "United States Grand Prix";
            case 20:
                return "Mexico Grand Prix";
            case 21:
                return "Brazil Grand Prix";
            case 22:
                return "Las Vegas Grand Prix";
            case 23:
                return "Abu Dhabi Grand Prix";
            default:
                return "Tidak Valid";
        }
    }

    public void print(Scanner scanner, KlasemenF1[] result, String grandPrix, DriverF1[] drivers) {
        for (KlasemenF1 res : result) {
            if (res != null && res.grandPrixName().equalsIgnoreCase(grandPrix)) {
                res.printGP(drivers);
                return;
            }
        }
    }
}
