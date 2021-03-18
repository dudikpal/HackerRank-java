package introduction.dateandtime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  
  @Test
  void testMain() {
    
    int month = 2;
    int day = 13;
    int year = 2010;
    
    assertEquals("SATURDAY", Result.findDay(month, day, year));
  }
}