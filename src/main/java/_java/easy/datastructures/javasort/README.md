https://www.hackerrank.com/challenges/java-sort/problem

### HackerRank version

```java
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        
        Collections.sort(studentList, Comparator.comparing(Student::getCgpa)
                                       .thenComparing(Student::getFname,                                                                 Comparator.reverseOrder())
                                        .thenComparing(Student::getId));
                                        
        Collections.reverse(studentList);
        StringBuilder sb = new StringBuilder();
        String separator = "";
        
        for (Student student : studentList) {
            sb.append(separator)
                .append(student.getFname());
            separator = "\n";
        }
        System.out.println(sb.toString());
      	/* for(Student st: studentList){
			System.out.println(st.getFname());
		} */
	}
}

```