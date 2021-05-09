package thirtydaysofcode.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTypesTest {

    @Test
    void test() {
        int a = 4;
        double b = 4.0;
        String str = "HackerRank ";
        String expected = """
                16                                
                8.0                                
                HackerRank is the best place to learn and practice coding!""";
        assertEquals(expected, new DataTypes().solution(a, b, str));
    }

}