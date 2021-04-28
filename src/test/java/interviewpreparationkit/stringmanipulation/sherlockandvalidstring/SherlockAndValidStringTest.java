package interviewpreparationkit.stringmanipulation.sherlockandvalidstring;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndValidStringTest {

    @Test
    void isValid() {
        String input = "abcdefghhgfedecba";

        String expected = "YES";

        assertEquals(expected, SherlockAndValidString.isValid(input));
    }

    @Test
    void isNotValid() {
        String input = "aabbccddeefghi";

        String expected = "NO";

        assertEquals(expected, SherlockAndValidString.isValid(input));
    }

    @Test
    void isValidLongInput() {
        InputStream is = getClass().getResourceAsStream("sherlock.txt");
        String line = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        String expected = "YES";

        assertEquals(expected, SherlockAndValidString.isValid(line));
    }

    @Test
    void isNotValid2() {
        String input = "abbccc";

        String expected = "NO";

        assertEquals(expected, SherlockAndValidString.isValid(input));
    }

}