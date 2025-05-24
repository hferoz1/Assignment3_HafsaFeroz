package org.example;
import java.util.List;

public interface AnimalAbstractFactory {
    String getEra(); // name of era
    List<LandAnimal> createLandAnimals(); // list of LandAnimals instances from the era
    List<SeaAnimal> createSeaAnimals(); // list of SeaAnimals instances from the era
    List<SkyAnimal> createSkyAnimals(); // list of SkyAnimals instances from the era
}
