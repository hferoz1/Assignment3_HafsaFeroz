package org.example;

/**
 * singleton created only when asked for (Lazy singleton)
 */
public class LazySingleton {
    private static LazySingleton[] instances = new LazySingleton[3];
    private int id;

    /**
     * called once for each ID when the instance is created
     * @param id ID for the singleton instance
     */
    private LazySingleton(int id) {
        this.id = id;
        System.out.println("LazySingleton " + id + " instantiated");
    }

    /**
     * returns ID for that singleton instance
     * @param id ID of the singleton trying to find
     * @return instance with that ID
     * @throws ArrayIndexOutOfBoundsException if ID does not exist
     */
    public static LazySingleton getInstance(int id) {
        if (instances[id] == null) {
            instances[id] = new LazySingleton(id);
        }
        return instances[id];
    }

    /**
     * @return id of singleton instance
     */
    public int getId() {
        return this.id;
    }
}
