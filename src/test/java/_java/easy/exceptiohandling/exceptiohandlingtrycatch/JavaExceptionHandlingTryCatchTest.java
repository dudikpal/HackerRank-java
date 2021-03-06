package _java.easy.exceptiohandling.exceptiohandlingtrycatch;

import org.junit.jupiter.api.Test;

class JavaExceptionHandlingTryCatchTest {
    
    @Test
    void solution() {
        
        String input = "10 3\n" +
                           "10 Hello\n" +
                           "10 0\n" +
                           "23.33 0";
        
        String expected = "3\n" +
                              "java.util.InputMismatchException\n" +
                              "java.lang.ArithmeticException: / by zero\n" +
                              "java.util.InputMismatchException";
        
        //assertEquals(expected, new JavaExceptionHandlingTryCatch().solution(input));
        
    }
}