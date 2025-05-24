package org.example;
import java.util.*;

public class JurassicAnimalFactory implements AnimalAbstractFactory {

    /**
     * @return era factory represents
     */
    public String getEra() {
        return "Jurassic";
    }

    /**
     * creates land animals from the Jurassic era
     * @return list containing Jurassic land animals
     */
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Stegosaurus(), new Sauropoda());
    }

    /**
     * creates sea animals from the Jurassic era
     * @return list containing Jurassic sea animals
     */
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Ichthyosaur(), new Basilosaurus());
    }

    /**
     * creates sky animals from the Jurassic era
     * @return list containing Jurassic sky animals
     */
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Pterosaurs(), new Archaeopteryx());
    }
}
