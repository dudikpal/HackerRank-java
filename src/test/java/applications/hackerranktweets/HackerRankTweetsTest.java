package applications.hackerranktweets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HackerRankTweetsTest {
    
    @Test
    void check() {
        
        assertEquals(4, new HackerRankTweets().check("(?i)\\bhackerrank"));
    }
}