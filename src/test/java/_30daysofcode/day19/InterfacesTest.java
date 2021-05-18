package _30daysofcode.day19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterfacesTest {

    @Test
    void test() {
        int input = 6;
        int expected = 12;

        assertEquals(expected, new Interfaces().divisorSum(input));
    }

}