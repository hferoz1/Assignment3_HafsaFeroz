package org.example;

import java.util.ArrayList;
import java.util.List;

public class CenozoicAnimalFactory implements AnimalAbstractFactory {
    public String getEra() {
        return "Cenozoic";
    }

    public List<LandAnimal> createLandAnimals() {
        List<LandAnimal> animals = new ArrayList<>();
        animals.add(new Mammoth());
        animals.add(new Armadillo());
        return animals;
    }

    public List<SeaAnimal> createSeaAnimals() {
        List<SeaAnimal> animals = new ArrayList<>();
        animals.add(new Manatee());
        animals.add(new Megalodon());
        return animals;
    }

    public List<SkyAnimal> createSkyAnimals() {
        List<SkyAnimal> animals = new ArrayList<>();
        animals.add(new Bat());
        animals.add(new Songbird());
        return animals;
    }
}
