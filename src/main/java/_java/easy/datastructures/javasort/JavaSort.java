package _java.easy.datastructures.javasort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaSort {

    public String solution(String input) {
    
        String[] inputs = input.split("\n");
        List<Student> students = new ArrayList<>();
        for (int i = 1; i < inputs.length; i++) {
            String[] student = inputs[i].split("\\s");
            int id = Integer.parseInt(student[0]);
            String name = student[1];
            double cgpa = Double.parseDouble(student[2]);
            students.add(new Student(id, name, cgpa));
        }
    
        Collections.sort(students, Comparator.comparing(Student::getCgpa)
                                       .thenComparing(Student::getName, Comparator.reverseOrder())
                                        .thenComparing(Student::getId));
        Collections.reverse(students);
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (Student student : students) {
            sb.append(separator)
                .append(student.getName());
            separator = "\n";
        }
        return sb.toString();
    }
}
