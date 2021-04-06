package _java.easy.oop.inheritance1;

public class Inheritance1 {

    public String solution() {
        Bird bird = new Bird();
        StringBuilder sb = new StringBuilder();
        sb.append(bird.walk()).append("\n");
        sb.append(bird.fly()).append("\n");
        sb.append(bird.sing());
        return sb.toString();
    }
}


class Animal{
    String walk()
    {
        return ("I am walking");
    }
}
class Bird extends Animal
{
    String sing() {
        return ("I am singing");
    }
    String fly()
    {
        return ("I am flying");
    }
}
