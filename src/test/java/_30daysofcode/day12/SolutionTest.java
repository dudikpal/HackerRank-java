package _30daysofcode.day12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        String firstName = "Heraldo";
        String lastName = "Memelli";
        int id = 8135627;
        int[] scores = {100, 80};
        String expected = """
                Name: Memelli, Heraldo
                ID: 8135627
                Grade: O""";
        Student s = new Student(firstName, lastName, id, scores);
        String result = s.printPerson();
        result += "\nGrade: " + s.calculate();
        assertEquals(expected, result);

    }

}