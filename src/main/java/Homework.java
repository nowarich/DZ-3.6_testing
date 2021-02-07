import java.util.Arrays;

public class Homework {
    public static int[] findAfterFour(int[] values) {
        if (values == null || values.length == 0) {
            throw new RuntimeException("Array cannot be empty!");
        }

        int index = -1;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == 4) {
                index = i + 1;
            }
        }

        if (index == -1) {
            throw new RuntimeException("No four was found!");
        }
        int[] copied = new int[values.length - index];
        System.arraycopy(values, index, copied,0, copied.length);
        return copied;
    }
}
