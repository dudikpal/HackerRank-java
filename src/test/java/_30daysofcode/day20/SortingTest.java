package _30daysofcode.day20;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    @Test
    void test() {
        List<Integer> input = new ArrayList<>(List.of(4, 3, 1, 2));
        String expected = """
                Array is sorted in 5 swaps.
                First Element: 1
                Last Element: 4""";
        assertEquals(expected, new Sorting().solution(input));
    }

}