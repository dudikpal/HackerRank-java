package introduction.javaendoffile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaEndOfFile {
  
  private List<String> lines = new ArrayList<>();
  
  public static void main(String[] args) {
    JavaEndOfFile s = new JavaEndOfFile();
    s.reader();
    s.writer();
  }
  
  private void reader() {
    Scanner sc = new Scanner(System.in);
    String line;
    while ((line = sc.nextLine()) != "") {
      System.out.println("Please type input, and press Enter.\n(If you want to end input, just press Enter).");
      lines.add(line);
    }
  }
  
  private void writer() {
    for (int i = 0; i < lines.size(); i++) {
      System.out.print(i + 1 + " ");
      System.out.println(lines.get(i));
    }
  }
}
