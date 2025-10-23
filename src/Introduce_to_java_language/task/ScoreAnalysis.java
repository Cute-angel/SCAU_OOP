package Introduce_to_java_language.task;

import utls.CourseTask;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreAnalysis implements CourseTask {

    int num_class;
    ArrayList<Class> classes = new ArrayList<>();

    public ScoreAnalysis(Scanner sc) {
        this.num_class = sc.nextInt();
        for (int i = 0; i < num_class; i++) {
            int num_student = sc.nextInt();
            Class cls = new Class(sc, num_student);
            classes.add(cls);
        }
    }

    public void solve () {
        for (Class i : classes) {
            System.out.printf("%.2f %.2f %.2f\n", i.average, i.max_score, i.min_score);
        }
    }
}

class Class {
    int num_student;

    double average;
    double min_score;
    double max_score;


    ArrayList<Double> scores = new ArrayList<>();

    public Class(Scanner scanner, int num_student) {
        this.num_student = num_student;
        for (int i = 0; i < num_student; i++) {
            scores.add(scanner.nextDouble());
        }
        this.average = averageScore();
        this.max_score = maxScore();
        this.min_score = minScore();
    }

    private double averageScore() {
        double sum = 0.0;
        for (Double score : scores) {
            sum += score;
        }
        return sum / num_student;
    }

    private double maxScore() {
        double max = scores.get(0);
        for (Double score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    private double minScore() {
        double min = scores.get(0);
        for (Double score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }
}

