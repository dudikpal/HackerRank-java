package _java.easy.datastructures.javagenerics;


public class JavaGenerics {
    
    public <T> String printArray(T[] arr) {
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (T item : arr) {
            sb.append(separator).append(item);
            separator = "\n";
        }
        return sb.toString();
    }
}
