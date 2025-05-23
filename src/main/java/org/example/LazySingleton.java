package org.example;

public class LazySingleton {
    private static LazySingleton[] instances = new LazySingleton[3];
    private int id;

    private LazySingleton(int id) {
        this.id = id;
        System.out.println("LazySingleton " + id + " instantiated");
    }

    public static LazySingleton getInstance(int id) {
        if (instances[id] == null) {
            instances[id] = new LazySingleton(id);
        }
        return instances[id];
    }

    public int getId() {
        return this.id;
    }
}
