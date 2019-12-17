package model;

import java.util.ArrayList;
import java.util.List;

public class GardenPlot {
    private GardenBed gardenBed;
    private Fertilizer fertilizer;
    private List<Plant> plants;

    public GardenPlot(Soil soil, Money money){
        this.fertilizer = new Fertilizer("гумус");
        this.gardenBed = new GardenBed(120);
        this.plants = new ArrayList<Plant>();
        plants.add(new Plant("cucumber", 10));
        plants.add(new Plant("tomato", 5));
    }

    public PlaceForPlanting createPlaceOfPlanting(){
       return null;
    }

    public void addFertilizer( PlaceForPlanting placeForPlanting, Fertilizer fertilizer){
    }

    public void buySomething(List<String>something){}

    public List<CultivatedSomething> growCultivatedSomething( List<String>plants){
        return null;
    }

    public List<Something>getSomething(PlaceForPlanting placeForPlanting){
        return null;
    }

    public List<CultivatedSomething> getCultivatedSomething(PlaceForPlanting place){
        return null;
    }

    public List<Something> borrowSomething(GardenPlot gardenPlot){
        return null;
    }

    public List<CultivatedSomething> borrowCultivatedSomething(GardenPlot gardenPlot){
        return null;
    }

}
