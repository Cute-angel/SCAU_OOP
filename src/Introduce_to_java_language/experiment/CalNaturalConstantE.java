package Introduce_to_java_language.experiment;

import utls.CourseTask;

import java.util.Scanner;

public class CalNaturalConstantE implements CourseTask {
    int step;
    double e = 1.0;

    public CalNaturalConstantE(Scanner scanner) {
        this.step = scanner.nextInt();
        if (this.step < 0) {
            System.out.println("不正确的输入");
        }
    }

    public void solve() {
        double fact = 1.0;
        for (int i = 1; i <= this.step; i++) {

            // as java impl the INF for double type, so no need to check overflow here
            fact *= i;
            this.e += 1.0 / fact;
        }
        System.out.printf("%.8f", this.e);
    }
}
