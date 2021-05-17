package _30daysofcode.day8;

import java.util.HashMap;
import java.util.Map;

public class DictionariesAndMaps {

    public String solution(int row, String input) {

        Map<String, String> phoneBook = new HashMap<>();
        String[] rows = input.split("\n");
        for (int i = 0; i < row; i++) {
            String name = rows[i].split(" ")[0];
            String phoneNumber = rows[i].split(" ")[1];
            phoneBook.put(name, phoneNumber);
        }
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = row; i < rows.length; i++) {
            sb.append(separator);
            if (phoneBook.containsKey(rows[i])) {
                sb.append(rows[i])
                        .append("=")
                        .append(phoneBook.get(rows[i]));
            } else {
                sb.append("Not found");
            }
            separator = "\n";
        }
        return sb.toString();
    }

}
