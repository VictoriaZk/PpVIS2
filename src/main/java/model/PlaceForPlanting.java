package model;

import java.util.List;

public interface PlaceForPlanting {
    void fertilize(Fertilizer fertilizer);

    Plant plantSeeds(Seed seed);

    List<Plant> harvest();

    List<Seed> collectSeeds();

    Plant borrowPlant();

    Seed borrowSeed();
}
