/*
Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. 
However, with the exception that if "equalok" is true, equality is allowed, such as 5 5 7 or 5 5 5. 

inOrderEqual(5, 7, 6, false) → false

inorderEqual(2, 5, 11, false) → true

inorderEqual(5, 5, 7, true) true
*/

import java.util.Scanner;
public class assignment1 {
	
	static boolean inorderequal(int a,int b,int c, boolean equalok)
	{
		if((a<b && b<c)||(a<=b && b<=c && equalok==true))
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		boolean equalok=sc.nextBoolean();
		System.out.println(inorderequal(a,b,c,equalok));
		sc.close();
	}
}

/*
output

5
5
7
true
true

5
5
7
false
false

2
3
4
true
true

5
9
1
true
false
*/
