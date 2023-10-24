package org.example.hw1.ModelElements;

import java.util.Collection;

public class Camera {
    // region Constructors
    public Camera(Collection<Point3D> points, Collection<Angle3D> angles) {
        this.points = points;
        this.angles = angles;
    }

    public Camera(Collection<Angle3D> angles) {
        this.angles = angles;
    }
    // endregion

    // region Properties

    public Collection<Point3D> getPoints() {
        return points;
    }

    public Collection<Angle3D> getAngles() {
        return angles;
    }

    void Rotate(Angle3D grad){

    }
    void Move (Point3D mm){

    }
    // endregion

    // region Fields
    private Collection<Point3D> points;
    private Collection<Angle3D> angles;
    //endregion

}
