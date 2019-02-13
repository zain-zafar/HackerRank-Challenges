import java.util.Scanner;

public class AlternatingCharacters {

  static void solution(String s) {
    // Declare variables
    String previous = "";
    int i = 0;

    // Split string into array for traversing of each letter
    String[] stringArray = s.split("");

    // Traverse array
    for (String current : stringArray)
    {
      // If previous letter matches the current letter, increase counter
      if (previous.equals(current)) {
        i++;
      }
      // Set previous letter to the current letter
      previous = current;
    }
    System.out.print(i);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Provide a valid string: ");
    String s = input.next();
    solution(s);
  }
}
