package interviewpreparationkit.stringmanipulation.alternatingcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingCharactersTest {


    @Test
    void test0() {
        String input = "ABABABAB";

        int expected = 0;

        assertEquals(expected, AlternatingCharacters.alternatingCharacters(input));
    }


    @Test
    void test3() {
        String input = "AAAA";

        int expected = 3;

        assertEquals(expected, AlternatingCharacters.alternatingCharacters(input));
    }


    @Test
    void test4() {

        String input = "AAABBB";

        int expected = 4;

        assertEquals(expected, AlternatingCharacters.alternatingCharacters(input));
    }
}