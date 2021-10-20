package cse.oop2.java_maven.ch04.getnset;

public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;
    String[] beforeOwnername;

    public String[] getBeforeOwnername() {
        return beforeOwnername;
    }

    public void setBeforeOwnername(String[] beforeOwnername) {
        this.beforeOwnername = beforeOwnername;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int numOfPickups) {
        this.numOfPickups = numOfPickups;
    }

    public boolean isRockStarUsesIt() {
        return rockStarUsesIt;
    }

    public void setRockStarUsesIt(boolean rockStarUsesIt) {
        this.rockStarUsesIt = rockStarUsesIt;
    }
}
