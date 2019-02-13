import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution
{
  // Keep track of the length of the strings to form
  static int elemToConsider = 1;
  // All possible strings
  static List<String> strs = new ArrayList<>();

  static int sherlockAndAnagrams(String s)
  {
    // Base case: If the string has been fully travered, go to helper function
    if (elemToConsider == s.length())
    {
      return findAnagrams();
    }

    // Otherwise, recursively form more strings
    else
      {
        for (int i = 0; i <= s.length() - elemToConsider; i++)
        {
          // Creates and adds parts of the string to list
          strs.add(s.substring(i, elemToConsider+i));
        }
        // Increase length of string to form
        elemToConsider++;

        // Recurse:
        return sherlockAndAnagrams(s);
      }
  }

  static int findAnagrams()
  {
    int numbAnagrams = 0;
    /*
     * Iterate over every string and check if an anagram of it can be
     * found inside the list, if so count it and increase counter
     */

    char[] string1;
    char[] string2;

    for (int i = 0; i < strs.size() -1; i++)
    {
      for (int j = 1+i; j < strs.size(); j++)
      {
        // If length of both strings are equal, compare them
        if (strs.get(i).length() == strs.get(j).length())
        {
          // Compare by sorting
          string1 = strs.get(i).toCharArray();
          string2 = strs.get(j).toCharArray();
          Arrays.sort(string1);
          Arrays.sort(string2);

          // If strings match, then increase counter
          if (new String(string1).equals(new String(string2)))
          {
            numbAnagrams++;
          }
        }
      }
    }
    return numbAnagrams;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.next();
    int result = sherlockAndAnagrams(str);
    System.out.print(result);
  }
}
