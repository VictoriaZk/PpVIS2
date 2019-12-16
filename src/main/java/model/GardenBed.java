package model;


//грядка
public class GardenBed {
    private int squareOfArea;

    public GardenBed(int squareOfArea) {
        this.squareOfArea = squareOfArea;
    }

    public int getSquareOfArea() {
        return squareOfArea;
    }

    public void setSquareOfArea(int squareOfArea) {
        this.squareOfArea = squareOfArea;
    }

    //внести удобрение
    public void addFertilizer(Fertilizer fertilizer){

    }

    public Plant plantSeeds(Seed seed){
        return new Plant();
    }

    public void createSeed(){
        Seed seed = new Seed();
    }


}
