/*Given two temperatures, return true if one is less than 0 and the other is greater than 100.

icyHot (120, -1) truet

icyHot (-1, 120) → true

icyHot (2, 120) → false*/


import java.util.Scanner;
public class assignment1 {
	
	static boolean icyhot(int a, int b)
	{
		if(((a<0)&&(b>100)) || ((a>100)&&(b<0)))
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(icyhot(a,b));
	}
}

/*
output

120
-1
true

-1
120
true

2
120
false
*/
