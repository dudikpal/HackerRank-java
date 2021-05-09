package thirtydaysofcode.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionariesAndMapsTest {

    @Test
    void test() {
        String input = """
                sam 99912222
                tom 11122222
                harry 12299933
                sam
                edward
                harry""";

        int row = 3;

        String expected = """
                sam=99912222
                Not found
                harry=12299933""";

        assertEquals(expected, new DictionariesAndMaps().solution(row, input));
    }

}