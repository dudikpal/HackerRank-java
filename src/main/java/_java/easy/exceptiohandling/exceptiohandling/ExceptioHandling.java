package _java.easy.exceptiohandling.exceptiohandling;

public class ExceptioHandling {

    private StringBuilder sb;
    
    public void solution(String input) throws Exception {
        String[] lines = input.split("\n");
        sb = new StringBuilder();
        for (String line : lines) {
            processLines(line);
        }
        System.out.println(sb.toString());
    }
    
    
    private void processLines(String line) throws Exception {
        String[] numbers = line.split("\\s");
        int n = Integer.parseInt(numbers[0]);
        int p = Integer.parseInt(numbers[1]);
        
        if (n == 0 && p == 0) {
           //throw new Exception("n and p should not be zero.");
            System.out.println("java.lang.Exception: n and p should not be zero.");
        } else if (n < 0 || p < 0) {
            //throw new Exception("n or p should not be negative.");
            System.out.println("java.lang.Exception: n or p should not be negative.");
        } else {
            System.out.println((long)Math.pow(n, p));
        }
        
    }
}
