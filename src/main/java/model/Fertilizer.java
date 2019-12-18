package model;

public class Fertilizer implements SoilSupplement {
    public String name;

    public Fertilizer(){}

    public Fertilizer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(String name) {
        this.name = name;
    }
}
