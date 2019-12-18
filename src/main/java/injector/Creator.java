package injector;

import model.*;
import ui.StartGame;
import java.util.ArrayList;
import java.util.List;

public class Creator {
    public void createSimulation() {
        Season season = new Season("весна");
        ClimateZone climateZone = new ClimateZone("тропики");
        climateZone.setNameOfAvailableCrops("помидоры, огурцы");
        Soil soil = new Soil("чернозем");
        List<String> availableCrops = new ArrayList<>();
        availableCrops.add("помидоры");
        availableCrops.add("огурцы");
        soil.setAvailableCrops(availableCrops);
        Money money = new Money();
        money.addMoney(1000);
        GardenPlot gardenPlot = new GardenPlot(soil, money);
        List<Seed> seeds = new ArrayList<>();
        seeds.add( new Seed("помидоры", 10));
        List<Plant> plants = new ArrayList<>();
        plants.add(new Plant("помидоры", 10));
        Fertilizer fertilizer = new Fertilizer("гумус");
        World world = new World(climateZone, season, gardenPlot);
    }

    public void createUIUser() {
        StartGame startGame = new StartGame();
        startGame.createUI();
    }
}
