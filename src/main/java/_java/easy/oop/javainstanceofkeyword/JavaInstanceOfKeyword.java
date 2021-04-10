package _java.easy.oop.javainstanceofkeyword;

import java.util.ArrayList;

public class JavaInstanceOfKeyword {
    
    public String solution(String input) {
        
        String[] inputs = input.split("\n");
        ArrayList mylist = new ArrayList();
        
        int t = Integer.parseInt(inputs[0]);
        for(int i=1; i <= t; i++){
            String s = inputs[i];
            if(s.equals("Student"))mylist.add(new Student());
            if(s.equals("Rockstar"))mylist.add(new Rockstar());
            if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
        return count(mylist);
    }
    
    public String count(ArrayList mylist){
        int a = 0,b = 0,c = 0;
        for(int i = 0; i < mylist.size(); i++){
            Object element=mylist.get(i);
            if(element instanceof Student)
            a++;
            if(element instanceof Rockstar)
            b++;
            if(element instanceof Hacker)
            c++;
        }
        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
    }
    
}
