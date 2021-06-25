
import java.util.Scanner;
public class assignment1 {
	
	static boolean twoasone(int a,int b,int c)
	{
		if( a+b==c || a+c==b || b+c==a)
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
		System.out.println(twoasone(a,b,c));
	}
}
/*
output
1
2
3
true

3
1
2
true

3
2
2
false

3
2
1
true
*/
