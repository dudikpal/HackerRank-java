package _30daysofcode.day7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day7ArraysTest {

    @Test
    void test() {
        List<Integer> input = new ArrayList<>(List.of(1, 4, 3, 2));
        String expected = "2 3 4 1";
        assertEquals(expected, new Day7Arrays().solution(input));
    }

    @Test
    void test3() {
        List<Integer> input = new ArrayList<>(List.of(5833, 9919, 6731));
        String expected = "6731 9919 5833";
        assertEquals(expected, new Day7Arrays().solution(input));
    }

}