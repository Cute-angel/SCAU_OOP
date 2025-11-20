package Interfaces_with_Lambda_expressions.experiment;

import Interfaces_with_Lambda_expressions.experiment.data.Student;
import Interfaces_with_Lambda_expressions.experiment.shape.Circle;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 5, "红色");
        circle.howToColor();

        //run_lambda_expression_example();
    }


    public static void run_lambda_expression_example() {
        // Lambda expression example
        Student[] students = {
                new Student("20190201", "David", "Software Engineering"),
                new Student("20190202", "Edward", "Software Engineering"),
                new Student("20190101", "Zed", "Computer Science"),
                new Student("20190102", "Bob", "Computer Science"),
                new Student("20190103", "Charlie", "Computer Science"),
                new Student("20190301", "Fred", "Data Science"),
        };

        System.out.println("原始输出");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("按学号排序后输出:");

        Arrays.sort(students, Comparator.comparing(Student::getId));
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("按姓名排序后输出:");
        Arrays.sort(students, Comparator.comparing(Student::getName));
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("按专业排序后输出:");
        Arrays.sort(students, Comparator.comparing(Student::getMajor).reversed());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
