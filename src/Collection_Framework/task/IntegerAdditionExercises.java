package Collection_Framework.task;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class IntegerAdditionExercises {
    private int count;
    private int maxValue;
    private int minValue;
    private ArrayList<Problem> lt = new ArrayList<>();


    public IntegerAdditionExercises(int count, int max, int min) {
        this.count = count;
        this.maxValue = max;
        this.minValue = min;

        for (int i = 0; i < count; i++) {
            lt.add(
                    new Problem(
                            (int) (Math.random() * (maxValue - minValue + 1)) + minValue,
                            (int) (Math.random() * (maxValue - minValue + 1)) + minValue
                    )
            );

        }

    }

    public void start() {
        int correctCount = 0;
        System.out.printf("本次练习共有%d个题目.", count);
        for (int i = 0; i < count; i++) {
            {
                Problem p = lt.get(i);
                System.out.printf("题目%d:", i + 1);
                if (p.test()) {
                    correctCount++;
                }
            }
        }
        System.out.printf("一共做对了 %d 个题目！", correctCount);
    }
}

class Problem {
    private int x;
    private int y;

    public Problem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean test() {
        System.out.printf("%d + %d = ?, 输入你的答案:", x, y);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer == x + y) {
            System.out.println("正确");
            return true;
        } else {
            System.out.println("错误");
            return false;
        }

    }
}
