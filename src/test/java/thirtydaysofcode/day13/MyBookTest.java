package thirtydaysofcode.day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyBookTest {

    @Test
    void test() {
        String title = "The Alchemist";
        String author = "Paulo Coelho";
        int price = 248;
        String expected = """
                Title: The Alchemist
                Author: Paulo Coelho
                Price: 248""";
        assertEquals(expected, new MyBook(title, author, price).display());
    }

}