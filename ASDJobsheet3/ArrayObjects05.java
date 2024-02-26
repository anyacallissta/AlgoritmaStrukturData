public class ArrayObjects05 {
    
    public static void main(String[] args) {
        PersegiPanjang05[] ppArray = new PersegiPanjang05[3];

        ppArray[0] = new PersegiPanjang05();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;

        ppArray[1] = new PersegiPanjang05();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;

        ppArray[2] = new PersegiPanjang05();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;

        System.out.println("Persegi panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        System.out.println("Persegi panjang ke-0, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        System.out.println("Persegi panjang ke-0, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
    }
    
}