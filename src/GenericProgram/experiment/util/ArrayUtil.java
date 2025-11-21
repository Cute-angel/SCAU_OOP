package GenericProgram.experiment.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayUtil {
    public static <T> T[] removeDuplicates(T[] array) {
        HashSet<T> set = new HashSet<>();
        ArrayList<T> list = new ArrayList<>();

        for (T element : array) {
            if (element == null) continue;
            if (set.add(element)) {
                list.add(element);
            }
        }
        return list.toArray(Arrays.copyOf(array, list.size()));
    }

    public static <T extends Comparable<T>> T max(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == null) continue;
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T min(T[] array) {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == null) continue;
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }
}
