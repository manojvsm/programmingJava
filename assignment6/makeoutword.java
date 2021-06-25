/*
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".
Note: use str.substring(i, j) to extract the string starting at index i and going up to but not including index j. 

makeOutword("<<>>", "Yay") "<<Yay>>" 
makeOutword("<<>>", "WooHoo") "<<WooHoo>>" 
makeOutword("[[]]", "word") + "[[word]]"
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
