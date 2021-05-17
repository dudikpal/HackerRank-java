package _30daysofcode.day15;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    @Test
    void test() {
        int[] input = {2, 3, 4, 1};
        Node head = null;
        for (int number : input) {
            head = Solution.insert(head, number);
        }
        String expected = "2 3 4 1";

        assertEquals(expected, Solution.display(head).trim());
    }

}