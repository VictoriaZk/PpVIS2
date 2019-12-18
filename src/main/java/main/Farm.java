package main;

import injector.Creator;

public class Farm {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.createSimulation();
        creator.createUIUser();
    }
}
