package contests.project_euler.largest_prime_factor;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeFactorTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(long input, long expected) {
        assertEquals(expected, new LargestPrimeFactor().solution(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(10, 5),
                Arguments.arguments(17, 17),
                Arguments.arguments(13195, 29),
                Arguments.arguments(3_203_431_780_337L, 29)
        );
    }

}