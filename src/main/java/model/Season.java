package model;

import java.util.ArrayList;
import java.util.List;

public class Season {
    private List<String> availablePlants;
    private String name;

    public Season(String name) {
        this.name = name;
        this.availablePlants = new ArrayList<String>();
    }

    public List<String> checkPossibilityOfPlant(List<String> plants) {
        return getAvailablePlants();
    }

    public void setAvailablePlants(List<String> availablePlants) {
        this.availablePlants = availablePlants;
    }

    public List<String> getAvailablePlants() {
        return availablePlants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
