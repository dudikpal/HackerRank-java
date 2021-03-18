package strings.anagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {
    
    @Test
    void isAnagram() {
        
        assertFalse(Anagrams.isAnagram("anagramm", "marganaa"));
        
    }
}