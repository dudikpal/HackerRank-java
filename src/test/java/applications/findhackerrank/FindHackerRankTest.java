package applications.findhackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindHackerRankTest {
    
    @Test
    void check() {
        
        String expected = "2\n" +
                              "1\n" +
                              "0\n" +
                              "-1";
        
        assertEquals(expected, new FindHackerRank().check());
    }
}