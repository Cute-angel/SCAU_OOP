package Introduce_to_java_language.task;

import utls.CourseTask;

import java.util.Scanner;

public class TemperatureConvert  implements CourseTask {
    Scanner s;
    public TemperatureConvert(Scanner scanner) {
        this.s = scanner;
    }

    @Override
    public void solve() {
        double degreeF = this.s.nextDouble() * 9 / 5 + 32;
        System.out.printf("%.2f", degreeF);
    }
}
