package _java.easy.oop.exceptiohandling.exceptiohandlingtrycatch;

import java.util.InputMismatchException;

public class JavaExceptionHandlingTryCatch {

    public void solution(String input) throws Exception {
    
        String[] lines = input.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String[] operands = lines[i].split("\\s");
            int operand1;
            int operand2;
            
            try {
                operand1 = Integer.parseInt(operands[0]);
                operand2 = Integer.parseInt(operands[1]);
                System.out.println(operand1 / operand2);
            } catch (InputMismatchException ime) {
                System.out.println(ime.getClass().getName());
            } catch (ArithmeticException ae) {
                System.out.println(ae);
            }
        }
    }
}
