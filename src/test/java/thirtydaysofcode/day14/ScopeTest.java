package thirtydaysofcode.day14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScopeTest {

    @Test
    void test() {
        int[] input = {1, 2, 5};
        int expected = 4;
        Scope scope = new Scope(input);
        scope.computeDifference();
        assertEquals(expected, scope.maximumDifference);
    }

}