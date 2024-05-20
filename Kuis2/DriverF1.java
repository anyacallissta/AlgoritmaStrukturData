package Kuis2;

public class DriverF1 {
    private String name;
    private int point;

    public DriverF1(String name) {
        this.name = name;
        this.point = 0;
    }

    public String nameDriver() {
        return name;
    }

    public int pointDriver() {
        return point;
    }

    public void addPoint(int point) {
        this.point += point;
    }

    public void resetPoints(int point) {
        this.point = point;
    }
}
