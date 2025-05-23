package org.example;

public class EagerSingleton { // other way to store this? easier to create them sep?
    private static final EagerSingleton[] instances = {
            new EagerSingleton(0),
            new EagerSingleton(1),
            new EagerSingleton(2)
    };

    private final int id;

    private EagerSingleton(int id) {
        this.id = id;
        System.out.println("EagerSingleton " + id + " instantiated");
    }

    public static EagerSingleton getInstance(int id) {
        return instances[id];
    }

    public int getId() {
        return id;
    }
}
