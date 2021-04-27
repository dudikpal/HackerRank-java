package interviewpreparationkit.stringmanipulation.makinganagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakingAnagramsTest {

    @Test
    void solution() {
        String input1 = "fcrxzwscanmligyxyvym";
        String input2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        int expected = 30;

        assertEquals(expected, new MakingAnagrams().Solution(input1, input2));
    }

    @Test
    void solution2() {
        String input1 = "showman";
        String input2 = "woman";

        int expected = 2;

        assertEquals(expected, new MakingAnagrams().Solution(input1, input2));
    }
}