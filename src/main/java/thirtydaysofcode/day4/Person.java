package thirtydaysofcode.day4;

public class Person {

    private int age;
    private StringBuilder sb = new StringBuilder();

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge > 1) {
            age = initialAge;
        } else {
            age = 0;
            sb.append("Age is not valid, setting age to 0.\n");
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public StringBuilder getSb() {
        return sb;
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (age < 13) {
            sb.append("You are young.\n");
            System.out.println("You are young.");
        } else if (age < 18) {
            System.out.println("You are a teenager.");
            sb.append("You are a teenager.\n");
        } else {
            sb.append("You are old.\n");
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }
}
