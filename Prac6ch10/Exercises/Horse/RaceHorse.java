package com.CP2406_ElliotStrickland_Prac6.Horse;

public class RaceHorse extends Horse {

    private int numberOfRaces;
    public RaceHorse(String name, String colour, int birthYear, int numberOfRaces) {
        super(name, colour, birthYear);
        this.numberOfRaces = numberOfRaces;
    }

    public int getNumberOfRaces() {
        return numberOfRaces;
    }
    public void setNumberOfRaces(byte numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }
}
