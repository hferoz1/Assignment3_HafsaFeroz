package org.example;

/**
 * all instances are created eagerly at class loading time
 * fixed array of singleton instances
 * each instance has an ID
 */
public class EagerSingleton { // other way to store this? easier to create them sep?
    private static final EagerSingleton[] instances = {
            new EagerSingleton(0),
            new EagerSingleton(1),
            new EagerSingleton(2)
    };

    /**
     * ID for each singleton instance
     */
    private final int id;

    /**
     * static initialization of the class
     * @param id the identifies for this instance
     */
    private EagerSingleton(int id) {
        this.id = id;
        System.out.println("EagerSingleton " + id + " instantiated");
    }

    /**
     * returns singleton instance with the given id
     * @param id ID of singleton to find
     * @return EagerSingleton instance
     * @throws ArrayIndexOutOfBoundsException if the given id is not one of the instances
     */
    public static EagerSingleton getInstance(int id) {
        return instances[id];
    }

    public int getId() {
        return id;
    }
}
