package _java.medium.strings.regex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Regex2Test {

    @Test
    void test() {
        String input = """
                Goodbye bye Bye world World wOrld
                Sam went went to To tO his business
                Reya is Is the The best player in eye Eye game
                in inthe
                Hello hEllo Ab aB""";
        String expected = """
                Goodbye bye world
                Sam went to his business
                Reya is the best player in eye game
                in inthe
                Hello Ab""";
        assertEquals(expected, new Regex2().solution(input));
    }

}