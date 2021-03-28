package regex.applications.ipaddressvalidation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPAddressValidationTest {
    
    @Test
    void check() {
        
        IPAddressValidation ip = new IPAddressValidation();
        
        String expected = "IPv4\n" +
                              "IPv4\n" +
                              "Neither\n" +
                              "Neither\n" +
                              "IPv6\n" +
                            "Neither\n" +
                            "Neither\n" +
                            "IPv6";
        
        assertEquals(expected, ip.check());
        
    }
}