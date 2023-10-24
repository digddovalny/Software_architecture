package org.example.hw1.ModelElements;

public class Angle3D {
    //region Constructors
    public Angle3D(double angleA, double angleB, double angleG) {
        this.angleA = angleA;
        this.angleB = angleB;
        AngleG = angleG;
    }
    public Angle3D() {
    }
    //endregion

    // region Properties
    public double getAngleA() {
        return angleA;
    }

    public void setAngleA(double angleA) {
        this.angleA = angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public void setAngleB(double angleB) {
        this.angleB = angleB;
    }

    public double getAngleG() {
        return AngleG;
    }

    public void setAngleG(double angleG) {
        AngleG = angleG;
    }
    //endregion

    //region Firlds
    private double angleA, angleB, AngleG;
    // endregion

}
