/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") "abcat"

conCat ("dog", "cat") "dogcat"

concat("abc", "") "abc"
*/import java.util.Scanner;
public class assignment1 {
	static void concat(String a, String b)
	{
		if(a.length()==0||b.length()==0)
		{
			System.out.println(a+b);
		}
		else if(a.charAt(a.length()-1)==b.charAt(0))
			System.out.println(a+b.substring(1));
		else
			System.out.println(a+b);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the A string");
		String a=sc.nextLine();
		System.out.println("enter the B string");
		String b=sc.nextLine();
		concat(a,b);
		sc.close();
	}
}
/*
output

enter the A string
char
enter the B string
rahc
charahc


enter the A string
abc
enter the B string
cat
abcat

enter the A string
abc
enter the B string

abc

*/
