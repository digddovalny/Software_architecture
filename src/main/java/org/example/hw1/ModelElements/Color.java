package org.example.hw1.ModelElements;

public class Color {
    //region Constructor
    public Color(int id, String colorName) {
        this.id = id;
        this.colorName = colorName;
    }
    // endregion

    //region Properties
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
    //endregion

    // region Fields
    private int id;
    private String colorName;
    // endregion

}
