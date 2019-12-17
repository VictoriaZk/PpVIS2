package model;

import java.util.ArrayList;
import java.util.List;

//грядка
public class GardenBed implements PlaceForPlanting{
    private int squareOfArea;
    private Seed tomato;
    private Seed cucumber;
    private List<Seed>seeds;

    public GardenBed(int squareOfArea) {
        this.squareOfArea = squareOfArea;
        this.tomato = new Seed("помидор", 10);
        this.cucumber = new Seed("огурец", 5);
        this.seeds = new ArrayList<Seed>();
        seeds.add(tomato);
        seeds.add(cucumber);
    }

    public int getSquareOfArea() {
        return squareOfArea;
    }

    public void setSquareOfArea(int squareOfArea) {
        this.squareOfArea = squareOfArea;
    }


    public void fertilize(Fertilizer fertilizer) {

    }

    public Plant plantSeeds(Seed seed){
        return null;
    }

    public List<Plant> harvest() {
        return null;
    }

    public List<Seed> collectSeeds() {
        return null;
    }

    public Plant borrowPlant() {
        return new Plant("лук", 12);
    }

    public Seed borrowSeed() {
        return new Seed("лук", 12);
    }

}
