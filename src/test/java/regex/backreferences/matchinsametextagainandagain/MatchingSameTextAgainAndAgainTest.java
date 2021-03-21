package regex.backreferences.matchinsametextagainandagain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingSameTextAgainAndAgainTest {
    
    @Test
    void check() {
        
        assertTrue(new MatchingSameTextAgainAndAgain().check("^([a-z])(\\w)(\\s)(\\W)(\\d)(\\D)([A-Z])([a-zA-Z])([aeiouAEIOU])(\\S)\\1\\2\\3\\4\\5\\6\\7\\8\\9\\10$"));
        
    }
}