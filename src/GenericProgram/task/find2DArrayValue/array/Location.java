package GenericProgram.task.find2DArrayValue.array;

public class Location<T extends Comparable<T>> {
    public int row;
    public int column;
    public T value = null;

    private Location(int row, int column, T value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }


    public static <E extends Comparable<E>> Location<E> findMax(E[][] matrix) {
        Location<E> loc = new Location<>(0, 0, matrix[0][0]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].compareTo(loc.value) > 0) {
                    loc.value = matrix[i][j];
                    loc.row = i;
                    loc.column = j;
                }
            }
        }
        return loc;
    }

    public static <E extends Comparable<E>> Location<E> findMin(E[][] matrix) {
        Location<E> loc = new Location<>(0, 0, matrix[0][0]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].compareTo(loc.value) < 0) {
                    loc.value = matrix[i][j];
                    loc.row = i;
                    loc.column = j;
                }
            }
        }
        return loc;
    }

    @Override
    public String toString() {
        return "Location [row=" + row + ", column=" + column + ", value=" + value + "]";
    }

}
