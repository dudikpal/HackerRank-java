package _30daysofcode.day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetsReviewTest {

    @Test
    void test1() {
        String input = "Hacker";
        String expected = "Hce akr";
        assertEquals(expected, new LetsReview().solution(input));
    }

    @Test
    void test2() {
        String input = "Rank";
        String expected = "Rn ak";
        assertEquals(expected, new LetsReview().solution(input));
    }

}