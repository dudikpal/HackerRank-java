package _java.easy.oop.javaiterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JavaIteratorTest {
    
    @Test
    void solution() {
    
        ArrayList list = new ArrayList();
        list.add(11);
        list.add(23);
        list.add("###");
        list.add("Hello");
        list.add("Java");
        
        String expected = "Hello\n" +
                              "Java";
        
        assertEquals(expected, new JavaIterator().solution(list));
    }
}