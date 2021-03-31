https://www.hackerrank.com/challenges/java-2d-array/problem


### HAckerRank version

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        int[][] subMatrix = new int[3][];
        int itrateCounter = arr.length - subMatrix.length + 1;
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < itrateCounter; row++) {
            for (int column = 0; column < itrateCounter; column++) {
                subMatrix[0] = Arrays.copyOfRange(arr[row], column, column + 3);
                subMatrix[1] = Arrays.copyOfRange(arr[row + 1], column, column + 3);
                subMatrix[2] = Arrays.copyOfRange(arr[row + 2], column, column + 3);
                int subMatrixSum = subMatrixSum(subMatrix);
                if (maxSum < subMatrixSum) {
                    maxSum = subMatrixSum;
                }
            }
        }
        System.out.println(maxSum);

        scanner.close();
    }
    
    private static int subMatrixSum(int[][] subMatrix) {
        subMatrix[1][0] = 0;
        subMatrix[1][2] = 0;
        int sumMatrix = Arrays.stream(subMatrix)
                            .flatMapToInt(Arrays::stream)
                            .sum();
        return sumMatrix;
    }
    
    private static int[] stringLineToIntArray(String line) {
        String[] numberStrings = line.split(" ");
        int[] result = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            result[i] = Integer.parseInt(numberStrings[i]);
        }
        return result;
    }
}
```