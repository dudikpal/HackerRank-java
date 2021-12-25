package problem_solving.easy.implementation.grading_students;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GradingStudentsTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(List<Integer> input, List<Integer> expected) {
        assertEquals(expected, GradingStudents.gradingStudents(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
            Arguments.arguments(List.of(73, 67, 38, 33), List.of(75, 67, 40, 33))
        );
    }

}