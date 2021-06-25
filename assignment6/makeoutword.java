/*
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".
Note: use str.substring(i, j) to extract the string starting at index i and going up to but not including index j. 

makeOutword("<<>>", "Yay") "<<Yay>>" 
makeOutword("<<>>", "WooHoo") "<<WooHoo>>" 
makeOutword("[[]]", "word") + "[[word]]"
*/

public class assignment1 {
	
	static String makeoutword(String a, String b)
	{
		String result=a.substring(0,2) + b + a.substring(2);
		return result;
	}
	public static void main(String args[])
	{
		System.out.println(makeoutword("<<>>","yah"));
		System.out.println(makeoutword("<<>>","woohoo"));
		System.out.println(makeoutword("[[]]","word"));
	}
}


/*
output

<<yah>>
<<woohoo>>
[[word]]
*/
