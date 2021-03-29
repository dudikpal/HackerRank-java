package applications.detectingvalidlatitudeandlongitude;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectingValidLatitudeAndLongitudeTest {
    
    @Test
    void check() {
        
        String expected = "Valid\n" +
                              "Valid\n" +
                              "Valid\n" +
                              "Valid\n" +
                              "Invalid\n" +
                              "Invalid\n" +
                              "Invalid\n" +
                              "Invalid\n" +
                              "Valid\n" +
                              "Valid\n" +
                              "Valid\n" +
                              "Valid\n" +
                              "Invalid\n" +
                              "Invalid\n" +
                              "Valid\n" +
                              "Valid\n" +
                              "Invalid\n" +
                              "Invalid\n" +
                              "Invalid\n" +
                              "Invalid\n" +
                              "Invalid\n" +
                              "Invalid\n" +
                              "Valid\n" +
                              "Valid\n" +
                              "Invalid\n" +
                              "Invalid\n" +
                              "Valid\n" +
                              "Valid\n" +
                              "Invalid\n" +
                              "Invalid";
        
        assertEquals(expected, new DetectingValidLatitudeAndLongitude().check("^\\([+-]?([0-9]0(\\.0+)?|([1-8]\\d|\\d)(\\.\\d+)?)\\s*,\\s*[+-]?(180(\\.0+)?|(1[0-7]\\d|\\d?\\d)(\\.\\d+)?)\\s*\\)$"));
    }
}