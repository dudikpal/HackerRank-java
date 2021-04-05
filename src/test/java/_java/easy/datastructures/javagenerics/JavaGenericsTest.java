package _java.easy.datastructures.javagenerics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaGenericsTest {
    
    @Test
    void printArray() {
        
        Integer[] intArr = {1, 2, 3};
        String[] stringArr = {"Hello", "World"};
        
        
        String expected = "1\n" +
                              "2\n" +
                              "3\n" +
                              "Hello\n" +
                              "World";
        
        StringBuilder sb = new StringBuilder();
        sb.append(new JavaGenerics().printArray(intArr) + "\n");
        sb.append(new JavaGenerics().printArray(stringArr));
        
        assertEquals(expected, sb.toString());
    }
}