package Inheritance_and_Polymorphism.task.shape;

import java.util.Objects;

public class RegularPolygon {
    private int numberOfSides = 3;
    private double lengthOfSide = 1.0;
    private double x = 0.0;
    private double y = 0.0;

    public RegularPolygon() {

    }

    public RegularPolygon(int numberOfSides, double lengthOfSide) {
        this.numberOfSides = numberOfSides;
        this.lengthOfSide = lengthOfSide;
    }

    public RegularPolygon(int numberOfSides, double lengthOfSide, double x, double y) {
        this.numberOfSides = numberOfSides;
        this.lengthOfSide = lengthOfSide;
        this.x = x;
        this.y = y;
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setLengthOfSide(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return (this.numberOfSides * Math.pow(this.lengthOfSide, 2)) / (4 * Math.tan(Math.PI / this.numberOfSides));
    }

    public double getOffset() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "["+this.numberOfSides+","+this.lengthOfSide+"]@("+
                this.x+","+this.y+")";
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other == this) return true;
        if (other.getClass() != this.getClass()) return false;
        RegularPolygon a = (RegularPolygon) other;
        return this.numberOfSides == a.numberOfSides &&
                Double.compare(this.lengthOfSide, a.lengthOfSide) == 0 &&
                Double.compare(this.x, a.x) == 0 &&
                Double.compare(this.y, a.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfSides, lengthOfSide, x, y);
    }
}
