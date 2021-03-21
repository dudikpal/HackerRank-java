package regex.backreferences.tofailedgroups;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToFailedGroupsTest {
    
    @Test
    void check() {
        
        assertTrue(new ToFailedGroups().check("^\\d{2}(-?)\\d{2}\\1\\d{2}\\1\\d{2}$"));
        
    }
}