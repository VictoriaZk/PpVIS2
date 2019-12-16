package model;

import java.util.ArrayList;
import java.util.List;

//почва
public class Soil {
    private List<String> availableCrops = new ArrayList<String>();
    private String name;


    public Soil(String name) {
        this.name = name;
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

    public String[] checkPossibilityOfPlanting(String nameOfSoil, List<String> nameOfAvailableCrops){
        return null;
    }
}
