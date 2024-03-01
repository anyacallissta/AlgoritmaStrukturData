public class LimasPersegi05 {
    
    public double alasLimas;
    public double tinggiLimas;
    public double sisiMiring;
    
    public LimasPersegi05() {
    
    }
    
    public LimasPersegi05(double aL, double tL, double t) {
        alasLimas = aL;
        tinggiLimas = tL;
        sisiMiring = t;
    }

    void panjangSisiMiring() {
        sisiMiring = Math.sqrt((alasLimas/2 * alasLimas/2) + (tinggiLimas * tinggiLimas));
    }

    double luasPermukaanLimas() {
        panjangSisiMiring();
        return (alasLimas * alasLimas) + (4 * (alasLimas * sisiMiring)/2);
    }

    double volumeLimas() {
        return ((alasLimas * alasLimas) * tinggiLimas)/3;
    }
    
}