package org.example.hw1.ModelElements;

public class Flash {
    //region Constructor
    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }
    //endregion

    //region Properties
    void Rotate(Angle3D grad){

    }
    void Move(Point3D mm){

    }
    //endregion

    // region Fields
    private Point3D location;
    private Angle3D angle;
    private Color color;
    private Float power;
    //endregion

}
