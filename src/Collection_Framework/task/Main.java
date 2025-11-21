package Collection_Framework.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("输入加法练习的题目数量: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.print("输入加法练习的加数范围的最小值:");
        int min = scanner.nextInt();
        System.out.print("输入加法练习的加数范围的最大值: ");
        int max = scanner.nextInt();

        IntegerAdditionExercises exercises = new IntegerAdditionExercises(count, max, min);
        exercises.start();
    }
}
