public class ArrayBalok05 {
    public static void main(String[] args) {
        Balok05[] blArray = new Balok05[3];

        blArray[0] = new Balok05(100, 30, 12);
        blArray[1] = new Balok05(120, 40, 15);
        blArray[2] = new Balok05(210, 50, 25);

        for ( int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke-" + i + ": " + blArray[i].hitungVolume());
        }
    }
}
