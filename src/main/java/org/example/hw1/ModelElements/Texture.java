package org.example.hw1.ModelElements;

public class Texture {
    // region Constructor
    public Texture(String name) {
        this.name = name;
    }
    // endregion

    // region Properties
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    // endregion

    // region Fields
    private int id;
    private String name;
    // endregion

}
