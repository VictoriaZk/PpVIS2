package model;

import java.util.List;

public class GardenPlot {
    private Soil soil;
    private Money money;

    public GardenPlot(Soil soil, Money money){
        this.soil = soil;
        this.money = money;
    }

    public PlaceForPlanting createPlaceOfPlanting(){
        return new PlaceForPlanting() {
            public void fertilize(Fertilizer fertilizer) {

            }

            public Plant plantSeeds(Seed seed) {
                return null;
            }

            public List<Plant> harvest() {
                return null;
            }

            public List<Seed> collectSeeds() {
                return null;
            }

            public Plant borrowPlant() {
                return null;
            }

            public Seed borrowSeed() {
                return null;
            }
        };
    }
}
