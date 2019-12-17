package model;

import java.util.ArrayList;
import java.util.List;

public class Season {
    private List<String> availablePlants;
    private String name;

    public Season(){}

    public Season(String name) {
        this.name = name;
        this.availablePlants = new ArrayList<String>();
        availablePlants.add("огурец");
        availablePlants.add("помидор");
    }

    public List<String>checkPossibilityOfPlant(List<String>plants){
        return getAvailablePlants();
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
