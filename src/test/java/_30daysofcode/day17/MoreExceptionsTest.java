package _30daysofcode.day17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoreExceptionsTest {

    @Test
    void test() {
        int number = -1;
        int power = 2;
        String expected = "n and p should be non-negative";
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new MoreExceptions().solution(number, power));
        assertEquals(expected, ex.getMessage());
    }

}