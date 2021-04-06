https://www.hackerrank.com/challenges/java-inheritance-1/problem


### HackerRank version

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk()
	{
		System.out.println("I am walking");
	}
}
class Bird extends Animal
{
    void sing() {
        System.out.println("I am singing");
    }
	void fly()
	{
		System.out.println("I am flying");
	}
}

public class Solution{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
	
   }
}
```