package _30daysofcode.day11;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _2DArraysTest {

    @Test
    void test() {
        List<List<Integer>> input = List.of(
                List.of(1, 1, 1, 0, 0, 0),
                List.of(0, 1, 0, 0, 0, 0),
                List.of(1, 1, 1, 0, 0, 0),
                List.of(0, 0, 2, 4, 4, 0),
                List.of(0, 0, 0, 2, 0, 0),
                List.of(0, 0, 1, 2, 4, 0)
        );

        int expected = 19;

        assertEquals(expected, new _2DArrays().solution(input));
    }

    @Test
    void test2() {
        List<List<Integer>> input = List.of(
                List.of(-1, -1, 0, -9, -2, -2),
                List.of(-2, -1, -6, -8, -2, -5),
                List.of(-1, -1, -1, -2, -3, -4),
                List.of(-1, -9, -2, -4, -4, -5),
                List.of(-7, -3, -3, -2, -9, -9),
                List.of(-1, -3, -1, -2, -4, -5)
        );

        int expected = -6;

        assertEquals(expected, new _2DArrays().solution(input));
    }

}