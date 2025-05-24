package org.example;

// Hafsa Feroz
// Assignment 3 - Section 601

import java.util.List;
public class NaturalHistoryMuseum {
    public static void main(String[] args) {
        AnimalAbstractFactory f = new CenozoicAnimalFactory();
        System.out.println("You are in the " + f.getEra() + " exhibition");
        System.out.println("===== " + f.getEra() + " land animals section =====");
        List<LandAnimal> cenozoicLand = f.createLandAnimals();
        for (LandAnimal a : cenozoicLand) {
            System.out.println("A " + a.getName() + " " + a.getWalking());
        }
        System.out.println("===== " + f.getEra() + " sea animals section =====");
        List<SeaAnimal> cenozoicSea = f.createSeaAnimals();
        for (SeaAnimal a : cenozoicSea) {
            System.out.println("A " + a.getName() + " " + a.getSwimming());
        }
        System.out.println("===== " + f.getEra() + " sky animals section =====");
        List<SkyAnimal> cenozoicSky = f.createSkyAnimals();
        for (SkyAnimal a : cenozoicSky) {
            System.out.println("A " + a.getName() + " " + a.getFlying());
        }
        System.out.println("Thank you for visiting the " + f.getEra() + " exhibition. Now on to the next exhibition");
        System.out.println();

        // I added this part
        AnimalAbstractFactory j = new JurassicAnimalFactory();
        System.out.println("You are now in the " + j.getEra() + " exhibition");

        System.out.println("===== " + j.getEra() + " land animals section =====");
        List<LandAnimal> jurassicLand = j.createLandAnimals();
        for (LandAnimal a : jurassicLand) {
            System.out.println("A " + a.getName() + " " + a.getWalking());
        }

        System.out.println("===== " + j.getEra() + " sea animals section =====");
        List<SeaAnimal> jurassicSea = j.createSeaAnimals();
        for (SeaAnimal a : jurassicSea) {
            System.out.println("A " + a.getName() + " " + a.getSwimming());
        }

        System.out.println("===== " + j.getEra() + " sky animals section =====");
        List<SkyAnimal> jurrasicSky = j.createSkyAnimals();
        for (SkyAnimal a : jurrasicSky) {
            System.out.println("A " + a.getName() + " " + a.getFlying());
        }

        System.out.println("Thank you for visiting the " + j.getEra() + " exhibition");
    }
}