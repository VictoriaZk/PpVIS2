package model;

import java.util.ArrayList;
import java.util.List;

public class Soil {
    private List<String> availableCrops;
    private String name;

    public Soil(String name) {
        this.name = name;
        this.availableCrops = new ArrayList<String>();
    }

    public List<String> getAvailableCrops() {
        return availableCrops;
    }

    public void setAvailableCrops(List<String> availableCrops) {
        this.availableCrops = availableCrops;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> checkPossibilityOfPlanting(String nameOfSoil, List<String> nameOfAvailableCrops) {
        return getAvailableCrops();
    }
}
