package _30daysofcode.day18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuesAndStacks {

    private String input;


    public boolean isPalindrome(String input) {
        for (char letter : input.toCharArray()) {
            pushCharacter(letter);
            enqueueCharacter(letter);
        }
        for (int i = 0; i < input.length(); i++) {
            if (popCharacter() != dequeueCharacter()) {
                return false;
            }
        }
        return true;
    }

    private Stack stack = new Stack();
    private Queue queue = new LinkedList();

    private void pushCharacter(char c) {
        stack.push(c);
    }

    private void enqueueCharacter(char c) {
        queue.add(c);
    }

    private Character popCharacter() {
        return (Character)stack.pop();
    }

    private Character dequeueCharacter() {
        return (Character)queue.poll();
    }
}
