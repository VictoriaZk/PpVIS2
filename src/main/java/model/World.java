package model;

import java.util.List;

public class World {
    private ClimateZone climateZone;
    private Season season;
    private GardenPlot gardenPlot;
    private Time time;

    public World(ClimateZone climateZone, Season season, GardenPlot gardenPlot){
        this.climateZone = climateZone;
        this.season = season;
        this.gardenPlot = gardenPlot;
        this.time = new Time();
        time.setCounter(12);
    }

    public int getTime(){
        return time.getCounter();
    }

    public boolean isNight(){
        return time.getCounter() <= 6 || time.getCounter() >= 24;
    }

    public String[] checkPossibilityOfPlanting(String nameOfSoil, List<String> nameOfAvailableCrops){
        return null;
    }


    public Season changeSeason(){
        return new Season("лето");
    }
}
