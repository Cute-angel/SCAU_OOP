package Introduce_to_java_language.experiment;

import utls.CourseTask;

import java.util.Scanner;

public class SumOfIntegerDigits implements CourseTask {
    int n;

    public SumOfIntegerDigits(Scanner scanner) {
        this.n = scanner.nextInt();
    }

    public void solve() {
        int sum = 0;
        while (this.n > 0) {
            sum += this.n % 10;
            this.n /= 10;
        }
        System.out.println(sum);
    }
}
