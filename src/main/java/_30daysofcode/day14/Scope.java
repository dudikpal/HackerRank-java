package _30daysofcode.day14;

public class Scope {

    private int[] elements;
    public int maximumDifference;

    public Scope(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {

        maximumDifference = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length; j++) {
                int actualDifference = Math.abs(elements[i] - elements[j]);
                if (maximumDifference < actualDifference) {
                    maximumDifference = actualDifference;
                }
            }
        }
    }

}
