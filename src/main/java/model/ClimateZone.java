package model;

public class ClimateZone {
    public String nameOfZone;
    public String nameOfAvailableCrops;


    public ClimateZone(String nameOfZone) {
        this.nameOfZone = nameOfZone;
    }


    public String getNameOfZone() {
        return nameOfZone;
    }

    public void setNameOfZone(String nameOfZone) {
        this.nameOfZone = nameOfZone;
    }

    public String getNameOfAvailableCrops() {
        return nameOfAvailableCrops;
    }

    public void setNameOfAvailableCrops(String nameOfAvailableCrops) {
        this.nameOfAvailableCrops = nameOfAvailableCrops;
    }

    public String[] checkPossibilityOfPlanting(String nameOfZone, String nameOfAvailableCrops){
        return null;
    }
}
