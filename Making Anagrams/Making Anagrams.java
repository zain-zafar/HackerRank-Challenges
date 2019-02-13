import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        
    List<String> listA = Arrays.asList(a.split(""));
    List<String> listB = Arrays.asList(b.split(""));
    HashSet<String> letters = new HashSet<>();
    int counter = 0;

    // Call the function to execute:
    counter += populateCounter(listA, listB, letters);
    counter += populateCounter(listB, listA, letters);

    return counter;
  }

  private static int populateCounter(List<String> listA, List<String >listB,
      HashSet<String> letters) {

    int difference = 0;
    int counter = 0;

    // Iterate through List A and check how many times the letter occurs
    for (String i : listA)
    {
      // Count how many times the letter occurs in both lists and substract:
      difference = Math.abs(numbOfOccur(i, listA) - numbOfOccur(i, listB));

      // If letter is NOT in the set, add the difference to counter
      if (!letters.contains(i))
      {
        // Add difference to counter and add letter to Set
        counter += difference;
        //System.out.println(counter);
        letters.add(i);
      }
    }
    return counter;
  }

  private static int numbOfOccur(String i, List<String> list) {
    int count = 0;
    for (String letter : list)
    {
      if (i.equals(letter))
      {
        count += 1;
      }
    }
    return count;
  }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}