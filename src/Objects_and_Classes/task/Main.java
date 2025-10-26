package Objects_and_Classes.task;

import Objects_and_Classes.task.equation.QuadraticEquation;
import Objects_and_Classes.task.shape.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //run_task_rectangle_class_use_def();
        //run_task_rectangle_class_constructor();
        //run_task_def_class_solve_root_of_equation();
        run_task_position_of_two_circle();
    }

    private static void run_task_rectangle_class_use_def() {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.printf("%.2f, %.2f\n", rectangle.getPerimeter(), rectangle.getArea());
    }
    private static void run_task_rectangle_class_constructor() {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Rectangle rectangle_default = new Rectangle();
        System.out.printf("%.2f, %.2f\n", rectangle_default.getPerimeter(), rectangle_default.getArea());
        Rectangle rectangle = new Rectangle(width, height);
        System.out.printf("%.2f, %.2f\n", rectangle.getPerimeter(), rectangle.getArea());
    }

    private static void run_task_def_class_solve_root_of_equation() {
        double a , b , c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getA() == 0) {
            System.out.println("不是一元二次方程");
            return;
        }

        if (equation.getDiscriminant() < 0) {
            System.out.println("方程没有实根");
            return;
        }
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();

        if (root1 == root2) {
            System.out.printf("方程有2个相等的实根:%.2f" , root1);
        } else {
            System.out.printf("方程有2个不等的实根: %.2f和%.2f", root1, root2);
        }
    }

    private static void run_task_position_of_two_circle () {
        Scanner scanner = new Scanner(System.in);
        Circle c1 = new Circle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        Circle c2 = new Circle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        if (c1.contains(c2) || c2.contains(c1)) {
            System.out.println(c1+" 包含 " +c2);
        } else if (c1.intersects(c2)) {
            System.out.println(c1 +" 与 " +c2+" 相交");
        } else {
            System.out.println(c1 +" 与 " +c2+" 无关");
        }

    }
}
