public class Segitiga05 {
    
    public int alas;
    public int tinggi;
    public double sisiMiring;

    public Segitiga05() {

    }

    public Segitiga05(int a, int t) {
        alas = a;
        tinggi = t;
    }

    double hitungLuas() {
        return alas * tinggi * 0.5;
    }

    void hitungSisiMiring() {
        sisiMiring = Math.sqrt(alas * tinggi);
    }

    double hitungKeliling() {
        return sisiMiring + alas + tinggi;
    }
}
