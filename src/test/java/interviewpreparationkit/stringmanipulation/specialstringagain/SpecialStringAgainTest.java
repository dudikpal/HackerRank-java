package interviewpreparationkit.stringmanipulation.specialstringagain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialStringAgainTest {

    @Test
    void substrCount() {
        String inputString = "aaaa";
        int inputLength = 4;

        int expected = 10;
        assertEquals(expected, SpecialStringAgain.substrCount(inputLength, inputString));
    }
}