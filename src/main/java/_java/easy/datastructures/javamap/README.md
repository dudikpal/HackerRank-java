https://www.hackerrank.com/challenges/phone-book/problem

### HackerRank version

```java
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            phoneBook.put(name, phone);
		}
        
        StringBuilder sb = new StringBuilder();
        String separator = "";
        
		while(in.hasNext())
		{
			String s=in.nextLine();
            sb.append(separator);            
            if (phoneBook.containsKey(s)) {
                sb.append(s + "=" + phoneBook.get(s));
            } else {
                sb.append("Not found");
            }
            separator = "\n";
		}
        System.out.println(sb.toString());
	}
}
```