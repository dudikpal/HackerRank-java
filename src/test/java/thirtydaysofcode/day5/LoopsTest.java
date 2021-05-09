package thirtydaysofcode.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTest {

    @Test
    void test2() {
        int input = 2;
        String expected = """
                2 x 1 = 2
                2 x 2 = 4
                2 x 3 = 6
                2 x 4 = 8
                2 x 5 = 10
                2 x 6 = 12
                2 x 7 = 14
                2 x 8 = 16
                2 x 9 = 18
                2 x 10 = 20""";
        assertEquals(expected, new Loops().solution(input));
    }

}