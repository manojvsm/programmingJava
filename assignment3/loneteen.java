/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

lone Teen (13, 99) → true

lone Teen (21, 19) → true

lone Teen (13, 13) → false
*/

import java.util.Scanner;
public class assignment1 {
	
	static boolean loneteen(int a, int b)
	{
		if (((a>=13) && (a<=19)) && ((b<13) || (b>19)))   
			return true;
		else if(((a<13) || (a>19)) && ((b>=13) && (b<=19))) 
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(loneteen(a,b));
	}
}
/*
output

15
15
false

88
15
true

15
88
true

99
77
false
*/


