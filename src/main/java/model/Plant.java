package model;

public class Plant implements CultivatedSomething {
    private String name;
    private int count;
    private int timeOfPlant;

    public Plant(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTimeOfPlant() {
        return timeOfPlant;
    }

    public void setTimeOfPlant(int timeOfPlant) {
        this.timeOfPlant = timeOfPlant;
    }

    public Plant getPlant() {
        return new Plant(getName(), getCount());
    }
}
