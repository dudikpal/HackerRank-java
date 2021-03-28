package applications.buildastackexchangescraper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildAStackExchangeScraperTest {
    
    @Test
    void check() {
        
        String expected = "80407;about power supply of operational amplifier;11 hours ago\n" +
                              "80405;5V Regulator Power Dissipation;11 hours ago";
        
        assertEquals(expected, new BuildAStackExchangeScraper().check(""));
    }
}