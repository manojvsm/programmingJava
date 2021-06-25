/*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"

firstHalf("HelloThere") "Hello"

firstHalf("abcdef") → "abc"
  */


import java.util.Scanner;
public class assignment1 {
	
	static void firsthalf(String str)
	{
		int value;
		int strlen=str.length();
		if(strlen%2==0)
		{
			value=strlen/2;
			System.out.println(str.substring(0,value));
		}
		else
			System.out.println("enter the even length of string");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		firsthalf(str);
	}
}

/*
output

enter the string
helloworld
hello

enter the string
woohoo
woo

enter the string
helloworld
hello

*/
