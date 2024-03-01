public class ArraySegitiga05 {
    public static void main(String[] args) {
        Segitiga05 [] sgArray = new Segitiga05[4];

        for (int i = 0; i < 4; i++) {
            sgArray[i] = new Segitiga05();
        }

        sgArray[0] = new Segitiga05(10, 4);
        sgArray[1] = new Segitiga05(20, 10);
        sgArray[2] = new Segitiga05(15, 6);
        sgArray[3] = new Segitiga05(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Segitiga ke-" + i + "\nLuas: " + sgArray[i].hitungLuas() + " Keliling: " + sgArray[i].hitungKeliling());
        }
    }
}
