package org.example.hw1.ModelElements;

import java.util.Collection;

public class Poligon {

    // region Constructors
    public Poligon(Collection<Point3D> points) {
        this.points = points;
    }
    public Poligon() {

    }
    //endregion

    // region Properties
    public Collection<Point3D> getPoints() {
        return points;
    }
    // endregion

    // region Fields
    private Collection<Point3D> points;
    // endregion

}
