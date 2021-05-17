package thirtydaysofcode.day12;

class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        testScores = scores;
    }
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public String calculate() {
        int sum = 0;
        for (int number : testScores) {
            sum += number;
        }
        int average = sum / testScores.length;
        if (average >= 90) {
            return "O";
        } else if (average>= 80) {
            return "E";
        } else if (average >= 70) {
            return "A";
        } else if (average >= 55) {
            return "P";
        } else if (average >= 40) {
            return "D";
        } else {
            return "T";
        }
    }
}
