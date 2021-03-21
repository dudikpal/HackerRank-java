package regex.backreferences.forwardreferences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForwardReferencesTest {
    
    @Test
    void check() {
        
        assertTrue(new ForwardReferences().check("(\\2tic|(tac))+"));
        
    }
}