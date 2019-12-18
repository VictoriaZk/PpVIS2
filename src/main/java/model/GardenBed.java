package model;

import java.util.ArrayList;
import java.util.List;

public class GardenBed implements PlaceForPlanting {
    private int squareOfArea;
    private Fertilizer fertilizer;
    private Seed tomato;
    private Seed cucumber;
    private List<Seed> seeds;
    private List<Plant> plants;

    public GardenBed(int squareOfArea) {
        this.squareOfArea = squareOfArea;
        this.fertilizer = new Fertilizer();
        this.seeds = new ArrayList<Seed>();
        this.plants = new ArrayList<Plant>();
    }

    public int getSquareOfArea() {
        return squareOfArea;
    }

    public void setSquareOfArea(int squareOfArea) {
        this.squareOfArea = squareOfArea;
    }

    public void fertilize(Fertilizer fertilizer) {
        this.fertilizer = fertilizer;
    }

    public Plant plantSeeds(Seed seed) {
        Plant plant = new Plant(seed.getName(), seed.getCount());
        plants.add(plant);
        return plant;
    }

    public List<Plant> harvest() {
        return plants;
    }

    public List<Seed> collectSeeds() {
        return seeds;
    }

    public Plant borrowPlant() {
        return new Plant("лук", 12);
    }

    public Seed borrowSeed() {
        return new Seed("лук", 12);
    }

}
