package object1;

public class Chair {
    private String brand;
    private String color;
    private int legs;

    public Chair(String brand, String color, int legs) {
        this.brand = brand;
        this.color = color;
        this.legs = legs;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}