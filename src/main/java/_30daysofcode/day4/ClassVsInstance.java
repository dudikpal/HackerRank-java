package _30daysofcode.day4;

public class ClassVsInstance {

    private static Person person;

    public String solution(int age) {

        person = new Person(age);
        person.amIOld();
        for (int i = 0; i < 3; i++) {
            person.yearPasses();
        }
        person.amIOld();
        return person.getSb().toString();
    }
}
