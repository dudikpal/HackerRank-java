package problem_solving.easy.warmup.time_conversion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(String input, String expected) {
        assertEquals(expected, TimeConversion.timeConversion(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments("07:05:45PM", "19:05:45"),
                Arguments.arguments("12:01:00PM", "12:01:00"),
                Arguments.arguments("12:01:00AM", "00:01:00")
        );
    }

}