package Interfaces_with_Lambda_expressions.task;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String type = input.split(" ")[0];
            Shape shape = null;
            switch (type) {
                case "A" -> shape = new Rectangle().build(input);
                case "B" -> shape = new Circular().build(input);
                case "C" -> shape = new Trapezium().build(input);
                default -> System.out.println("Unknown shape type: " + type);
            }
            if (shape != null) shapes.add(shape);
        }

        AreaOfParts areaOfParts = new AreaOfParts();
        double totalArea = areaOfParts.CalculateArea(shapes.toArray(new Shape[0]));
        System.out.printf(" %.2f\n", totalArea);
    }
}
