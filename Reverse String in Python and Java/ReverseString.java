import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution
{
  /**
   * Reverse the given string using indexing
   *
   * @param s The string to reverse
   * @return A reversed string
   */
  private static String reverseStr(String s)
  {
    // Declare vars:
    String reversed = "";

    // Split the string into a list of letters:
    List<String> letters = Arrays.asList(s.split(""));

    // Loop
    for (int i=1; i <= s.length(); i++)
    {
      // Get the last letter from the list and add it to string
      reversed += letters.get(letters.size() - i);
    }
    return reversed;
  }

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the string to reverse: ");
    String s = in.next();
    String result = reverseStr(s);
    System.out.println(result);
  }

}
