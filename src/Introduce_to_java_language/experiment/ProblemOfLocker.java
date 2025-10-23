package Introduce_to_java_language.experiment;

import utls.CourseTask;

import java.util.Scanner;

class ProblemOfLocker implements CourseTask {
    int n;
    boolean[] lockers;

    public ProblemOfLocker(Scanner scanner) {
        this.n = scanner.nextInt();
        this.lockers = new boolean[n + 1];
    }

    public void solve() {
        for (int i = 0; i < this.n; i++) {
            for (int j = i; j < this.n; j += i + 1) {
                changeLockerState(this.lockers, j);
            }
        }
        for (int i = 0; i < this.n; i++) {
            if (this.lockers[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }

    private static void changeLockerState(boolean[] lockers, int index) {
        lockers[index] = !lockers[index];
    }

}
