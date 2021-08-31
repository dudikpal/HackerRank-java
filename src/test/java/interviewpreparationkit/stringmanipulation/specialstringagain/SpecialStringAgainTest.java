package interviewpreparationkit.stringmanipulation.specialstringagain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialStringAgainTest {

    @Test
    void substrCount10() {
        String inputString = "aaaa";
        int inputLength = 4;

        int expected = 10;
        assertEquals(expected, SpecialStringAgain.substrCount(inputLength, inputString));
    }

    @Test
    void substrCount7() {
        String inputString = "aasassdd";
        int inputLength = 4;

        int expected = 10;
        assertEquals(expected, SpecialStringAgain.substrCount(inputLength, inputString));
    }

    @Test
    void substrCount12() {
        String inputString = "mnonopoo";
        int inputLength = 4;

        int expected = 10;
        assertEquals(expected, SpecialStringAgain.substrCount(inputLength, inputString));
    }
}