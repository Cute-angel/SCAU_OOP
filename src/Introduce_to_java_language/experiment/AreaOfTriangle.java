package Introduce_to_java_language.experiment;

import utls.CourseTask;

import java.util.Scanner;

public class AreaOfTriangle implements CourseTask {
    double area;

    public AreaOfTriangle(Scanner scanner) {
        double x1, x2, x3, y1, y2, y3;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);

        edge e1 = new edge(p1, p2);
        edge e2 = new edge(p2, p3);
        edge e3 = new edge(p3, p1);

        double s = (e1.getLength() + e2.getLength() + e3.getLength()) / 2;

        this.area = Math.sqrt(s * (s - e1.getLength()) * (s - e2.getLength()) * (s - e3.getLength()));
    }

    @Override
    public void solve() {
        System.out.printf("area=%.2f", this.area);
    }

}

class edge {
    Point p1;
    Point p2;
    double length;

    public edge(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.length = length();
    }

    private double length() {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    public double getLength() {
        return this.length;
    }
}

class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}