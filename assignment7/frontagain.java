/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

frontAgain("edited") → true

frontAgain("edit") + false

frontAgain("ed") → true

*/

import java.util.Scanner;
public class assignment1 {
	static void frontagain(String str)
	{
		if(str.substring(str.length()-2).equals(str.substring(0,2)))
			System.out.println("true");
		else
			System.out.println("false");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		frontagain(str);
	}
}

/*
output
enter the string
edited
true


enter the string
edit
false

enter the string
ed
true

*/
