package thirtydaysofcode.day9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Recursion3Test {

    @Test
    void test() {
        int input = 3;
        int expected = 6;
        assertEquals(expected, new Recursion3().solution(input));
    }

}