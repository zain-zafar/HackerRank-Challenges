public class Solution 
{
	
	public static String orderString(String s) 
	{
		// Break string into char array and sort it
		char[] toChar = s.toCharArray();
		Arrays.sort(toChar);

		// Join the array as a new string and return 
		String sortedStr = new String(toChar);
		return sortedStr;
	}
}