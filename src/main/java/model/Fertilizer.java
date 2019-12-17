package model;

//удобрение
public class Fertilizer implements SoilSupplement{
    public String name;

    public Fertilizer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(String name){

    }
}
