package _30daysofcode.day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private static Node mainHead;

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node node = new Node(data);
        node.next = null;
        if (head == null) {
            mainHead = node;
        } else {
            while (head.next != null) {
                head = head.next;
            }
            head.next = node;
        }
        return mainHead;
    }

    public static String display(Node head) {
        Node start = head;
        String result = "";
        while(start != null) {
            result += (start.data + " ");
            start = start.next;
        }
        return result;
    }
}
