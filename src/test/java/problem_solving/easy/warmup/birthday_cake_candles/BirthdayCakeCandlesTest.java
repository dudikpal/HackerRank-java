package problem_solving.easy.warmup.birthday_cake_candles;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayCakeCandlesTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(List<Integer> input, int expected) {
        assertEquals(expected, BirthdayCakeCandles.birthdayCakeCandles(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
            Arguments.arguments(List.of(3, 2, 1, 3), 2),
            Arguments.arguments(List.of(4, 4, 1, 3), 2)

        );
    }

}