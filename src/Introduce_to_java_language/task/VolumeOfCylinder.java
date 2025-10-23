package Introduce_to_java_language.task;

import utls.CourseTask;

import java.util.Scanner;

public class VolumeOfCylinder implements CourseTask {
    double radius;
    double height;

    public VolumeOfCylinder(Scanner scanner) {
        this.radius = scanner.nextDouble();
        this.height = scanner.nextDouble();
    }

    @Override
    public void solve() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.printf("%.2f\n", volume);
    }
}
