package com.CP2406_ElliotStrickland_Prac6.Horse;

public class DemoHorses {

    public static void main(String[] args) {

        Horse horse1 = new Horse("Pharlap", "Brown", 1992);
        System.out.println(horse1.getName());
        System.out.println(horse1.getColour());
        System.out.println(horse1.getBirthYear());
        System.out.println("-----------------------------");
        Horse horse2 = new RaceHorse("Black Caviar", "Black", 2004, 19);
        System.out.println(horse2.getName());
        System.out.println(horse2.getColour());
        System.out.println(horse2.getBirthYear());

    }

}
