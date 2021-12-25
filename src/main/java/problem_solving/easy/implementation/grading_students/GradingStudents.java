package problem_solving.easy.implementation.grading_students;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        for (Integer grade : grades) {
            if (grade < 38) {
                result.add(grade);
            } else if (grade % 5 >= 3) {
                result.add((grade / 5 + 1) * 5);
            } else {
                result.add(grade);
            }
        }
        return result;
    }
}
