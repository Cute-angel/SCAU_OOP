package GenericProgram.task.find2DArrayValue;

import GenericProgram.task.find2DArrayValue.array.Location;

public class Main {
    public static void main(String[] args) {
        Integer[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[][] names = {{"Nguyen", "Tran", "Le"}, {"Thanh", "Tam", "Zung"}};

        Location<Integer> max = Location.findMax(numbers);
        System.out.println(max);

        Location<String> min = Location.findMin(names);
        System.out.println(min);
    }
}