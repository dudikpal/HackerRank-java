package _java.easy.datastructures.javasort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    
    @Test
    void solution() {
        String input = "5\n" +
                           "33 Rumpa 3.68\n" +
                           "85 Ashis 3.85\n" +
                           "56 Samiha 3.75\n" +
                           "19 Samara 3.75\n" +
                           "22 Fahim 3.76";
        
        String expected = "Ashis\n" +
                              "Fahim\n" +
                              "Samara\n" +
                              "Samiha\n" +
                              "Rumpa";
        
        assertEquals(expected, new JavaSort().solution(input));
    }
}