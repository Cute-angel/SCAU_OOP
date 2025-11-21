package GenericProgram.experiment;

import GenericProgram.experiment.util.ArrayQueue;
import GenericProgram.experiment.util.ArrayUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //run_class();
        run_method();
    }

    public static void run_method() {
        Integer[] iArray = {1, 1, 2, 2, 3, null, 3, 4, 4, 5, 6, 7, null, null};
        String[] sArray = {"Java", "C++", "C", "Python", "JavaScript", "C++"};

        Integer[] iArrayResult = ArrayUtil.removeDuplicates(iArray);
        Arrays.stream(iArray).toList().forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(iArrayResult).toList().forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.println(ArrayUtil.<Integer>max(iArrayResult));
        System.out.println(ArrayUtil.<Integer>min(iArrayResult));

        String[] sArrayResult = ArrayUtil.removeDuplicates(sArray);
        Arrays.stream(sArray).toList().forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(sArrayResult).toList().forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.println(ArrayUtil.<String>max(sArrayResult));
        System.out.println(ArrayUtil.<String>min(sArrayResult));
    }

    public static void run_class() {
        ArrayQueue<Integer> queue = new ArrayQueue<>(10);

        System.out.println("测试进队: ");
        for (int i = 1; i < 20; i++) {
            if (!queue.isFull()) {
                queue.add(i);
                System.out.printf("[%d] added. \n", i);
            } else {
                System.out.printf("队列已满, [%d] not added.\n", i);
            }
        }

        System.out.println("测试出队: ");
        while (!queue.isEmpty()) {
            System.out.printf("[%d] removed.\n", queue.remove());
        }
    }
}