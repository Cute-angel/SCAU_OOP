package Interfaces_with_Lambda_expressions.experiment.shape;

public class Circle implements Colorable {
    private double radius;
    private double x;
    private double y;
    private String color;

    public Circle(double x, double y, double radius, String color) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.color = color;
    }


    @Override
    public void howToColor() {
        System.out.printf("Circle (%.2f,%.2f) - %.2f - %s, 填充圆的内部", getX(), getY(), getRadius(), getColor());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
