/*
Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.

teenSum(3, 4) -> 7

teenSum(10, 13) -> 19

teenSum(13, 2) -> 19
*/

import java.util.Scanner;
public class teenprgm
{
    static int teen(int a,int b)
    {
        if((a>=13 && a<=19)||(b>=13 && b<=19))
        {
            return 19;
        }
        else
        return a+b;
    }
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         System.out.println(teen(a,b));
	}
}

/*
output
3
4
7

10
13
19

13
2
19

*/
