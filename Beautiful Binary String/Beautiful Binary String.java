import java.util.Scanner;

public class BeautifulBinaryString {

  static int solution(String s) {
    

    // Declare vars
    int exit = 0;
    int count = 0;

    // Exit loop if 1 is issued
    while (exit != 1) 
    {
      // if 010 exists in the string, replace it  by 011 and increase count	
      if (s.contains("010"))
      {
        s = s.replaceFirst("010", "011");
        count++;
      }
      // Otherwise, exit loop
      else
        {
          exit = 1;
        }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = sc.next();
    int output = solution(str);
    System.out.println(output);
  }
}