package ASDJobsheet5;

public class Showroom {
    
    String [] merk = {"BMW", "Ford", "Nissan", "Subaru", "Subaru", "Toyota", "Toyota", "Volkswagen"};
    String [] tipe = {"M2 Coupe", "Fiesta ST", "370z", "BRZ", "Impreza WRX STI", " AE86 Trueno", "86/GT86", "Golf GTI"};
    int [] tahun = {2016, 2014, 2009, 2014, 2013, 1986, 2014, 2014};
    int [] top_acceleration = {6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180};
    int [] top_power = {728, 575, 657, 609, 703, 553, 609, 631};  
    
    int maxAccel(int low, int high) {
        if (low == high) {
            return top_acceleration[low];
        } else {
            int mid = (low + high) / 2;
            int lMax = maxAccel(low, mid);
            int rMax = maxAccel(mid + 1, high);
            return Math.max(lMax, rMax);
        }
    }

    int minAccel(int low, int high) {
        if (low == high) {
            return top_acceleration[low];
        } else {
            int mid = (low + high) / 2;
            int lMin = minAccel(low, mid);
            int rMin = minAccel(mid + 1, high);
            return Math.min(lMin, rMin);
        }
    }

    double meanPower(double sum) {
        for (int i = 0; i < top_power.length; i++) {
            sum += top_power[i];
        }
        return sum / top_power.length;
    }

    public static class mainShowroom {
        public static void main(String[] args) {
            Showroom sr = new Showroom();
            System.out.println("Top Acceleration Tertinggi  : " + sr.maxAccel(0, sr.top_acceleration.length - 1));
            System.out.println("Top Acceleration Terendah   : " + sr.minAccel(0, sr.top_acceleration.length - 1));
            System.out.println("Rata-rata Top Power         : " + sr.meanPower(0));
        }
    }
}
