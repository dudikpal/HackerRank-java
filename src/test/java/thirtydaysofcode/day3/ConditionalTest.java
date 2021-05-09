package thirtydaysofcode.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionalTest {

    @Test
    void test() {
        int input = 3;
        String expected = "Weird";
        assertEquals(expected, new Conditional().solution(input));
    }

}