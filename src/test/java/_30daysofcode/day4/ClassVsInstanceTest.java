package _30daysofcode.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassVsInstanceTest {

    @Test
    void test1() {
        int input = -1;
        String expected = """
                Age is not valid, setting age to 0.                                
                You are young.                                
                You are young.\n""";
        assertEquals(expected, new ClassVsInstance().solution(input));
    }

    @Test
    void test2() {
        int input = 10;
        String expected = """
                You are young.
                You are a teenager.\n""";
        assertEquals(expected, new ClassVsInstance().solution(input));
    }

    @Test
    void test3() {
        int input = 16;
        String expected = """
                You are a teenager.
                You are old.\n""";
        assertEquals(expected, new ClassVsInstance().solution(input));
    }

    @Test
    void test4() {
        int input = 18;
        String expected = """
                You are old.                                
                You are old.\n""";
        assertEquals(expected, new ClassVsInstance().solution(input));
    }

}