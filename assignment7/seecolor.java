/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

seeColor("redxx") "red"

seeColor ("xxred") + ""

seeColor ("blueTimes") "blue"
*/

import java.util.Scanner;
public class assignment1 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String strb="blue";
		String strr="red";
		if(strr.equals(str.substring(0,3)))
		{
			System.out.println("red");
		}
		else if((strb.equals(str.substring(0,4))))
		{
			System.out.println("blue");
		}
		else
			System.out.println("");
	}
}
/*
output

enter the string
redxx
red

enter the string
bluetimes
blue

enter the string
xxred


*/
