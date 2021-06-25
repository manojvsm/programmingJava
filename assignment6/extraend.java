/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be atleast 2.

extraEnd("Hello") "lololo"

extraEnd("ab") → "ababab"

extraEnd("Hi") "HiHiHi"


*/


import java.util.Scanner;
public class assignment1 {
	
	static void extraend(String str)
	{
		String strl;
		int strlen=str.length();
		if(strlen<=1)
			System.out.println("enter the atleast two length of string");
		else
		{	strl=str.substring(strlen-2);
			for(int i=0;i<3;i++)	
				System.out.print(strl);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		extraend(str);
	}
}
/*
output

enter the string
hghgc
gcgcgc

enter the string
hello
lololo


*/
