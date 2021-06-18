/*The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is Math.abs(num) computes the absolute value of a number.

love6 (6, 4) -> true

love6(4, 5) -> false

love6(1, 5) -> true
*/

import java.util.Scanner;
public class lover
{
    static boolean love6(int value1,int value2)
    {
        if(value1==6||value2==6||value1+value2==6||value1-value2==6)
        {
            return true;
        }
        else
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         int value1=sc.nextInt();
         int value2=sc.nextInt();
         System.out.println(love6(value1,value2));
	}
}
/*
6
4
true

4
5
false

1
5
true
*/
