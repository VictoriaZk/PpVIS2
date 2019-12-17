package injector;

import model.*;

public class Creator {
    public void createSimulation(){
        Season season = new Season("весна");
        ClimateZone climateZone = new ClimateZone("тропики");
        climateZone.setNameOfAvailableCrops("tomato, cucumber");
        Soil soil = new Soil("чернозем");
        Time time = new Time();
        Money money = new Money();
        money.addMoney(1000);
        GardenPlot gardenPlot = new GardenPlot(soil, money);
        World world  = new World(climateZone, season, gardenPlot);
    }

    public void createUIUser(){}
}
