package _java.easy.datastructures.javabitset;

import java.util.BitSet;

public class JavaBitSet {
    
        private BitSet bitSet1;
        private BitSet bitSet2;
        
    public String solution(String input) {
    
    
        String[] inputs = input.split("\n");
        int setLength = Integer.parseInt(inputs[0].split("\\s")[0]);
        bitSet1 = new BitSet(setLength);
        bitSet2 = new BitSet(setLength);
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = 1; i < inputs.length; i++) {
            String[] line = inputs[i].split("\\s");
            String command = line[0];
            int toBitSet = Integer.parseInt(line[1]);
            int bitOrBitSet = Integer.parseInt(line[2]);
            processCommand(command, toBitSet, bitOrBitSet);
            sb.append(separator).append(bitSet1.cardinality() + " " + bitSet2.cardinality());
            separator = "\n";
        }
        return sb.toString();
    }
    
    private void processCommand(String command, int toBitSet, int bitOrBitSet) {
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
    
    
    private void flip(int toBitset, int index) {
        if (toBitset == 1) {
            bitSet1.flip(index);
        } else {
            bitSet2.flip(index);
        }
    }
    
    
    private void set(int toBitSet, int index) {
        if (toBitSet == 1) {
            bitSet1.set(index);
        } else {
            bitSet2.set(index);
        }
    }
    
    
    private void xor(int toBitSet) {
        if (toBitSet == 1) {
            bitSet1.xor(bitSet2);
        } else {
            bitSet2.xor(bitSet1);
        }
    }
    
    
    private void or(int toBitSet) {
        if (toBitSet == 1) {
            bitSet1.or(bitSet2);
        } else {
            bitSet2.or(bitSet1);
        }
    }
    
    
    private void and(int toBitSet) {
        if (toBitSet == 1) {
            bitSet1.and(bitSet2);
        } else {
            bitSet2.and(bitSet1);
        }
    }
    
}
