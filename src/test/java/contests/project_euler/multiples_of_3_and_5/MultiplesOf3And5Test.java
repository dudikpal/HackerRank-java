package contests.project_euler.multiples_of_3_and_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesOf3And5Test {

    @Test
    void test1() {
        String input = """
                2
                10
                100""";

        String expected = """
                23
                2318""";

        assertEquals(expected, new MultiplesOf3And5().solution(input));
    }

}