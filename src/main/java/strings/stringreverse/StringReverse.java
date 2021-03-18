package strings.stringreverse;

public class StringReverse {

    public String solution(String str) {
    
        String A = str;
        /* Enter your code here. Print output to STDOUT. */
        String reverse = stringToReverse(A);
        System.out.println(reverse);
        return str.equals(reverse) ? "Yes" : "No";
    }
    
    private String stringToReverse(String str) {
        if (str.length() == 0) {
            return str;
        }
        return str.charAt(str.length() - 1) + stringToReverse(str.substring(0, str.length() - 1));
    }
}


/*
Ugyanez HackerRanken:

public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        //Enter your code here. Print output to STDOUT.
String reverse = stringToReverse(A);
        if (A.equals(reverse)) {
            System.out.println("Yes");
            } else {
            System.out.println("No");
            }
        
            }

private static String stringToReverse(String str) {
                   if (str.length() == 0) {
                   return str;
                   }
                   return str.charAt(str.length() - 1) + stringToReverse(str.substring(0, str.length() - 1));
                   }
 */