package org.example;

import java.util.ArrayList;
import java.util.List;

public class CenozoicAnimalFactory implements AnimalAbstractFactory {

    /**
     * @return era factory represents
     */
    public String getEra() {
        return "Cenozoic";
    }

    /**
     * creates land animals from the Cenozoic era
     * @return list containing Cenozoic land animals
     */
    public List<LandAnimal> createLandAnimals() {
        List<LandAnimal> animals = new ArrayList<>();
        animals.add(new Mammoth());
        animals.add(new Armadillo());
        return animals;
    }

    /**
     * creates sea animals from the Cenozoic era
     * @return list containing Cenozoic sea animals
     */
    public List<SeaAnimal> createSeaAnimals() {
        List<SeaAnimal> animals = new ArrayList<>();
        animals.add(new Manatee());
        animals.add(new Megalodon());
        return animals;
    }

    /**
     * creates sky animals from the Cenozoic era
     * @return list containing Cenozoic sky animals
     */
    public List<SkyAnimal> createSkyAnimals() {
        List<SkyAnimal> animals = new ArrayList<>();
        animals.add(new Bat());
        animals.add(new Songbird());
        return animals;
    }
}
