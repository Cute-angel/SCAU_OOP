package Interfaces_with_Lambda_expressions.task;

public class AreaOfParts {


    public double CalculateArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }

        return totalArea;
    }

}

interface Shape {
    public double area();

    Shape build(String input);
}

class Rectangle implements Shape {
    private double width;
    private double height;
    public String name;

    public Rectangle() {
    }

    public Rectangle(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public Shape build(String input) {
        String[] parts = input.trim().split("\\s+");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid input for Rectangle");
        }
        return new Rectangle(
                this.name = parts[0],
                Double.parseDouble(parts[1]),
                Double.parseDouble(parts[2])
        );
    }
}

class Circular implements Shape {
    public String name;
    private double radius;

    public Circular() {
    }


    public Circular(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Shape build(String input) {
        String[] parts = input.trim().split("\\s+");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid input for Circular");
        }
        return new Circular(
                this.name = parts[0],
                Double.parseDouble(parts[1])
        );
    }
}

class Trapezium implements Shape {
    private double upperBase;
    private double lowerBase;
    private double height;

    public String name;

    public Trapezium() {
    }

    public Trapezium(String name, double upperBase, double lowerBase, double height) {
        this.name = name;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double area() {
        return (upperBase + lowerBase) * height / 2;
    }

    @Override
    public Shape build(String input) {
        String[] parts = input.trim().split("\\s+");
        if (parts.length != 4) {
            throw new IllegalArgumentException("Invalid input for Trapezium");
        }
        return new Trapezium(
                this.name = parts[0],
                Double.parseDouble(parts[1]),
                Double.parseDouble(parts[2]),
                Double.parseDouble(parts[3])
        );
    }
}
