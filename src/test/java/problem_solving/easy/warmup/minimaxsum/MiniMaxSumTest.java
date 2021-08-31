package problem_solving.easy.warmup.minimaxsum;



import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MiniMaxSumTest {

    @ParameterizedTest
    @MethodSource("params")
    void test(List<Integer> input ,String expected) {

        assertEquals(expected, new MiniMaxSum().solution(input));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(new ArrayList<>(List.of(1, 2, 3, 4, 5)), "10 14"),
                Arguments.arguments(new ArrayList<>(List.of(769082435, 210437958, 673982045, 375809214, 380564127)), "1640793344 2199437821")
        );
    }

}