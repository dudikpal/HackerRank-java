package _30daysofcode.day16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionsStringToIntegerTest {

    @Test
    void test() {
        String input = "3";
        int expected = 3;
        assertEquals(expected, new ExceptionsStringToInteger().solution(input));
    }

    @Test
    void test2() {
        String input = "as";
        String expected = "Bad String";
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new ExceptionsStringToInteger().solution(input));
        assertEquals(expected, ex.getMessage());
    }

}