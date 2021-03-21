package regex.backreferences.branchresetgroups;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BranchResetGroupsTest {
    
    @Test
    void check() {
        
        assertFalse(new BranchResetGroups().check("^\\d{2}(:|-|.|---)(\\d{2}\\1){2}\\d{2}$"));
        
    }
}