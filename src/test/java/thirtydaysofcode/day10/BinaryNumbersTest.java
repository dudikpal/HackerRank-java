package thirtydaysofcode.day10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumbersTest {

    @Test
    void test13() {
        int input = 13;
        int expected = 2;
        assertEquals(expected, new BinaryNumbers().solution(input));
    }

    @Test
    void test15() {
        int input = 15;
        int expected = 4;
        assertEquals(expected, new BinaryNumbers().solution(input));
    }

    @Test
    void test3() {
        int input = 3;
        int expected = 2;
        assertEquals(expected, new BinaryNumbers().solution(input));
    }

    @Test
    void test7() {
        int input = 7;
        int expected = 3;
        assertEquals(expected, new BinaryNumbers().solution(input));
    }

    @Test
    void test9() {
        int input = 9;
        int expected = 1;
        assertEquals(expected, new BinaryNumbers().solution(input));
    }

}