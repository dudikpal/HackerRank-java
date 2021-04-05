https://www.hackerrank.com/challenges/java-generics/problem

### HackerRank version

```java
import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
   public <T> void printArray(T[] arr) {
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (T item : arr) {
            sb.append(separator).append(item);
            separator = "\n";
        }
        System.out.println(sb.toString());
    }
   
 
}

public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
```