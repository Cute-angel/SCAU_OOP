package Introduce_to_java_language.experiment;

import utls.CourseTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertToDex implements CourseTask {
    int n;

    public ConvertToDex(Scanner scanner) {
        try {
            this.n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            throw e;
        }
        if (this.n < 0) {
            System.out.println("不正确的输入");
        }
    }

    public void solve() {
        if (this.n < 0) return;
        System.out.println(Integer.toHexString(this.n).toUpperCase());
    }
}
