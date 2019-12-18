package model;

import java.util.ArrayList;
import java.util.List;

public class GardenPlot {
    private GardenBed gardenBed;
    private Fertilizer fertilizer;
    private List<Plant> plants;

    public GardenPlot(Soil soil, Money money) {
        this.fertilizer = new Fertilizer();
        this.gardenBed = new GardenBed(120);
        this.plants = new ArrayList<Plant>();
    }


    public void addFertilizer(PlaceForPlanting placeForPlanting, Fertilizer fertilizer) {
        placeForPlanting.fertilize(fertilizer);
    }

    public void buySomething(List<String> something) { plants.add(new Plant(something.get(0),1));
    }

    public List<CultivatedSomething> growCultivatedSomething(List<String> plants) {
        return new ArrayList<>();
    }

    public List<Something> getSomething(PlaceForPlanting placeForPlanting) {
        return new ArrayList<>();
    }

    public List<CultivatedSomething> getCultivatedSomething(PlaceForPlanting place) {
        return new ArrayList<>();
    }

    public List<Something> borrowSomething(GardenPlot gardenPlot) {
        return new ArrayList<>();
    }

    public List<CultivatedSomething> borrowCultivatedSomething(GardenPlot gardenPlot) {
        return new ArrayList<>();
    }

}
