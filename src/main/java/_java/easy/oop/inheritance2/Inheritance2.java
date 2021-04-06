package _java.easy.oop.inheritance2;

public class Inheritance2 {
    
    public String solution(){
        // Create a new Adder object
        Adder a = new Adder();
        StringBuilder sb = new StringBuilder();
        // Print the name of the superclass on a new line
        sb.append("My superclass is: " + a.getClass().getSuperclass().getName() + "\n");
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        sb.append(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10));
        return sb.toString();
    }
}


class Adder extends Arithmetic{

}


class Arithmetic {

    int add(int a, int b) {
        return a + b;
    }
}