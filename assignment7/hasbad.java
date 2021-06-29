/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings. hasBad ("xbadxx") → true

hasBad("badxx") + true

hasBad ("xxbadxx") → false

*/

import java.util.Scanner;
public class assignment1 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String str1="bad";
		if(str1.equals(str.substring(0,3))||str1.equals(str.substring(1,4)))
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}

/*
output

enter the string
badxx
true

enter the string
xbadxx
true

enter the string
xxbadxx
false
*/
