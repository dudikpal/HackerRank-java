package _java.easy.datastructures.java2darray;

import java.util.Arrays;

public class Java2DArray {
    
    public int solution(String input) {
    
        String[] lines = input.split("\n");
        int[][] matrix = new int[6][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = stringLineToIntArray(lines[i]);
        }
        int[][] subMatrix = new int[3][];
        int itrateCounter = matrix.length - subMatrix.length + 1;
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < itrateCounter; row++) {
            for (int column = 0; column < itrateCounter; column++) {
                subMatrix[0] = Arrays.copyOfRange(matrix[row], column, column + 3);
                subMatrix[1] = Arrays.copyOfRange(matrix[row + 1], column, column + 3);
                subMatrix[2] = Arrays.copyOfRange(matrix[row + 2], column, column + 3);
                int subMatrixSum = subMatrixSum(subMatrix);
                if (maxSum < subMatrixSum) {
                    maxSum = subMatrixSum;
                }
            }
        }
        //System.out.println(maxSum);
        return maxSum;
    }
    
    
    private int subMatrixSum(int[][] subMatrix) {
        subMatrix[1][0] = 0;
        subMatrix[1][2] = 0;
        int sumMatrix = Arrays.stream(subMatrix)
                            .flatMapToInt(Arrays::stream)
                            .sum();
        return sumMatrix;
    }
    
    private int[] stringLineToIntArray(String line) {
        String[] numberStrings = line.split(" ");
        int[] result = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            result[i] = Integer.parseInt(numberStrings[i]);
        }
        return result;
    }
}
