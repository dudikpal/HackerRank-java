https://www.hackerrank.com/challenges/java-bitset/problem

### HackerRank version

```java
import java.io.*;
import java.util.*;
import java.util.BitSet;

public class Solution {
    
    private static BitSet bitSet1;
    private static BitSet bitSet2;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        String[] inputs = sc.nextLine().split("\\s");
        int setLength = Integer.parseInt(inputs[0]);
        int rows = Integer.parseInt(inputs[1]);
        
        bitSet1 = new BitSet(setLength);
        bitSet2 = new BitSet(setLength);
        StringBuilder sb = new StringBuilder();
        String separator = "";
        
        for (int i = 0; i < rows; i++) {
            String[] line = sc.nextLine().split("\\s");
            String command = line[0];
            int toBitSet = Integer.parseInt(line[1]);
            int bitOrBitSet = Integer.parseInt(line[2]);
            processCommand(command, toBitSet, bitOrBitSet);
            sb.append(separator).append(bitSet1.cardinality() + " " + bitSet2.cardinality());
            separator = "\n";
        }
        System.out.println(sb.toString());
    }
    
    private static void processCommand(String command, int toBitSet, int bitOrBitSet) {
        if (command.equals("AND")) {
            and(toBitSet);
        }
        if (command.equals("OR")) {
            or(toBitSet);
        }
        if (command.equals("XOR")) {
            xor(toBitSet);
        }
        if (command.equals("SET")) {
            set(toBitSet, bitOrBitSet);
        }
        if (command.equals("FLIP")) {
            flip(toBitSet, bitOrBitSet);
        }
    }
    
    
    private static void flip(int toBitset, int index) {
        if (toBitset == 1) {
            bitSet1.flip(index);
        } else {
            bitSet2.flip(index);
        }
    }
    
    
    private static void set(int toBitSet, int index) {
        if (toBitSet == 1) {
            bitSet1.set(index);
        } else {
            bitSet2.set(index);
        }
    }
    
    
    private static void xor(int toBitSet) {
        if (toBitSet == 1) {
            bitSet1.xor(bitSet2);
        } else {
            bitSet2.xor(bitSet1);
        }
    }
    
    
    private static void or(int toBitSet) {
        if (toBitSet == 1) {
            bitSet1.or(bitSet2);
        } else {
            bitSet2.or(bitSet1);
        }
    }
    
    
    private static void and(int toBitSet) {
        if (toBitSet == 1) {
            bitSet1.and(bitSet2);
        } else {
            bitSet2.and(bitSet1);
        }
    }
}
```