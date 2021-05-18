package _30daysofcode.day21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void testInteger() {
        Integer[] input = {1, 2, 3};
        String expected = """
                1
                2
                3""";
        assertEquals(expected, new Printer().printArray(input));
    }

    @Test
    void testString() {
        String[] input = {"egy", "kettő", "három"};
        String expected = """
                egy
                kettő
                három""";
        assertEquals(expected, new Printer().printArray(input));
    }

}