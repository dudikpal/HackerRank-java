package _java.easy.datastructures.javaarraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaArraylistTest {
    
    @Test
    void solution() {
        
        String input = "5\n" +
                           "5 41 77 74 22 44\n" +
                           "1 12\n" +
                           "4 37 34 36 52\n" +
                           "0\n" +
                           "3 20 22 33\n" +
                           "5\n" +
                           "1 3\n" +
                           "3 4\n" +
                           "3 1\n" +
                           "4 3\n" +
                           "5 5";
        
        String expected = "74\n" +
                              "52\n" +
                              "37\n" +
                              "ERROR!\n" +
                              "ERROR!";
        
        assertEquals(expected, new JavaArraylist().solution(input));
    }
    
    
    @Test
    void testCase2() {
        
        String input = "8\n" +
                           "7 43 35 26 34 78 99 70\n" +
                           "3 71 11 16\n" +
                           "8 70 19 42 30 84 20 57 45\n" +
                           "0\n" +
                           "1 20\n" +
                           "0\n" +
                           "0\n" +
                           "0\n" +
                           "10\n" +
                           "5 1\n" +
                           "5 7\n" +
                           "1 7\n" +
                           "5 3\n" +
                           "5 2\n" +
                           "4 7\n" +
                           "5 2\n" +
                           "1 2\n" +
                           "4 1\n" +
                           "2 3";
        
        String expected = "20\n" +
                              "ERROR!\n" +
                              "70\n" +
                              "ERROR!\n" +
                              "ERROR!\n" +
                              "ERROR!\n" +
                              "ERROR!\n" +
                              "35\n" +
                              "ERROR!\n" +
                              "16";
        
        assertEquals(expected, new JavaArraylist().solution(input));
    }
}