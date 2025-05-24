package org.example;
import java.util.*;

public class JurassicAnimalFactory implements AnimalAbstractFactory {
    public String getEra() {
        return "Jurassic";
    }

    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Stegosaurus(), new Sauropoda());
    }

    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Ichthyosaur(), new Basilosaurus());
    }

    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Pterosaurs(), new Archaeopteryx());
    }
}
