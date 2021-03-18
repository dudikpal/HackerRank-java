package strings.stringsintroduction;

import java.util.Scanner;

public class StringsIntroduction {
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        String resultLine1 = "" + A.length() + B.length();
        String resultLine2 = A.charAt(0) > B.charAt(0) ? "Yes" : "No";
        String resultLine3 = A.substring(0, 1).toUpperCase() + A.substring(1) + " " +
                                 B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(resultLine1);
        System.out.println(resultLine2);
        System.out.println(resultLine3);
    }
    
}
