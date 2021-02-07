import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HomeworkTest {
    @ParameterizedTest
    @NullAndEmptySource
//    @MethodSource("arrayWithoutFourProvider")
    void shouldThrowRuntimeExceptionWhenEmptyArrayPassed(int[] values) {
        assertThrows(RuntimeException.class,
                () -> Homework.findAfterFour(values)
        );
    }

    @Test
    void shouldThrowRuntimeExceptionWhenNoFourFound() {
        assertThrows(RuntimeException.class,
                () -> Homework.findAfterFour(new int[]{1, 3})
        );
    }

    @Test
    void shouldreturnValuesAfterLastFour() {
        assertArrayEquals(
                new int[] {1, 7},
                Homework.findAfterFour(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7})
        );
    }

//    private static Arguments<Object> arrayWithoutFourProvider() {
//        return new int[]{1, 3};
//    }
}
