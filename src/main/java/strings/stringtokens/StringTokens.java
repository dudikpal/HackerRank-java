package strings.stringtokens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTokens {
    
    public String solution(String s) {
        if (s.length() == 0 || s.length() > 400_000 || s.isBlank()) {
            System.out.println(0);
        } else {
            s = s.trim();
            List<Character> excludedChars =List.of('!', ',', '?', '.', '_', '\'', '@');
            String delims = "[!,?._'@\\s]+";
            String[] result = s.split(delims);
            String testCase = "";
            //List<String> result = Arrays.asList(s.split("! | , | ? | . | _ | ' | @"));
            System.out.println(result.length);
            for (String chunk : result) {
                System.out.println(chunk);
                testCase += chunk + "\n";
            }
            
            return testCase.trim();
        }
        return "0";
    }
}


/*
HackerRanken:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if (s.length() == 0 || s.length() > 400_000 || s.trim().length() == 0) {
            System.out.println(0);
        } else {
            s = s.trim();
            String delims = "[!,?._'@\\s]+";
            String[] result = s.split(delims);
            System.out.println(result.length);
            for (String chunk : result) {
                System.out.println(chunk);
            }
        }
        scan.close();
    }
}
 */