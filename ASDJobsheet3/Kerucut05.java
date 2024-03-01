public class Kerucut05 {
    
    public double jariJari;
    public double sisiMiring;
    public double tinggi;
    
    void tinggiKerucut() {
        tinggi = Math.sqrt((sisiMiring * sisiMiring) -(jariJari * jariJari));
    }
    
    double luasPermukaanKerucut() {
        return 3.14 * jariJari * (jariJari + sisiMiring);
    }

    double volumeKerucut() {
        tinggiKerucut();
        return (3.14 * jariJari * jariJari * tinggi)/3;
    }

}

    