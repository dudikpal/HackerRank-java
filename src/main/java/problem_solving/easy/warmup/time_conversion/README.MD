https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=false

## HackerRank version

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        SimpleDateFormat displayTime = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat inputTime = new SimpleDateFormat("hh:mm:ssaa", Locale.ENGLISH);
        
        String result = "";
        try {
            Date date = inputTime.parse(s);
            System.out.println(date);
            result = displayTime.format(date);
            System.out.println(result);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }

        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```