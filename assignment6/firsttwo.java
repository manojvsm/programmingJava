/*
Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "x" yields "x", and the empty string "" yields the empty string "". Note that str.length()

returns the length of a string. firstTwo ("Hello") "He"

firstTwo ("abcdefg") → "ab"

firstTwo("ab") + "ab"
*/

import java.util.Scanner;
public class assignment1 {
	
	static void firsttwo(String str)
	{
		int strlen=str.length();
		if(strlen<=1)
			System.out.println(str.substring(0));
		else
			System.out.println(str.substring(0,2));
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		firsttwo(str);
	}
}


/*
output

enter the string
ab
ab

enter the string
hello
he

enter the string
abcdef
ab

enter the string
a
a
*/

