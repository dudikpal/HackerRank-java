package _java.easy.oop.javaabstractclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyBookTest {
    
    @Test
    void test() {
        String input = "A tale of two cities";
        
        String expected = "The title is: A tale of two cities";
        MyBook myBook = new MyBook();
        myBook.setTitle("A tale of two cities");
        
        assertEquals(expected, myBook.getTitle());
    }
    
}