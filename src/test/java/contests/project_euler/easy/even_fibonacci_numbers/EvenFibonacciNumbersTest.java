package contests.project_euler.easy.even_fibonacci_numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EvenFibonacciNumbersTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(long input, long expected) {
        assertEquals(expected, new EvenFibonacciNumbers().solution(input));
    }

    static Stream<Arguments> params() {

        return Stream.of(
                Arguments.arguments(10, 10),
                Arguments.arguments(100, 44)
        );
    }

}