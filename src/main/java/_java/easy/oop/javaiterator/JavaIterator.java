package _java.easy.oop.javaiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

    public String solution(ArrayList list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = func(list);
        String separator = "";
        while (it.hasNext()) {
            sb.append(separator);
            sb.append(it.next());
            separator = "\n";
        }
        return sb.toString();
    }
    
    
    public Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String)//Hints: use instanceof operator
            
            break;
        }
        return it;
        
    }
}
