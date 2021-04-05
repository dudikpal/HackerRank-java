package _java.easy.datastructures.javamap;

import java.util.HashMap;
import java.util.Map;

public class JavaMap {
    
    public String solution(String input) {
    
        String[] inputs = input.split("\n");
        int entries = Integer.parseInt(inputs[0]);
        Map<String, String> phoneBook = new HashMap<>();
        
        for (int i = 1; i < entries * 2 + 1; i += 2) {
            String name = inputs[i];
            String phoneNumber = inputs[i + 1];
            phoneBook.put(name, phoneNumber);
        }
        
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = entries * 2 + 1; i < inputs.length; i++) {
            sb.append(separator);
            String name = inputs[i];
            if (phoneBook.containsKey(name)) {
                sb.append(name + "=" + phoneBook.get(name));
            } else {
                sb.append("Not found");
            }
            separator = "\n";
        }
        return sb.toString();
    }
}
