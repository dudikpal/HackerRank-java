package thirtydaysofcode.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorsTest {

    @Test
    void test() {
        double input1 = 12.0;
        int input2 = 20;
        int input3 = 8;
        int expected = 15;
        assertEquals(expected, Operators.solve(input1, input2, input3));
    }

}