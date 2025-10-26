package Objects_and_Classes.task.shape;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
        this.x = 0.0;
        this.y = 0.0;
        this.radius = 1.0;
    }

    private double getDist(Circle other){
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public boolean contains(Circle other){
        double dist = getDist(other);
        return dist + other.radius <= this.radius;
    }

    public boolean intersects(Circle other){
        double dist = getDist(other);
        return dist < this.radius + other.radius && dist > Math.abs(this.radius - other.radius);
    }

    public boolean separates(Circle other) {
        double dist = getDist(other);
        return dist >= this.radius + other.radius;
    }

    @Override
    public String toString() {
        return String.format("(%.2f,%.2f)-%.2f", x, y, radius);
    }
}
