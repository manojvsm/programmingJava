/*Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the

number is less or equal to 1, or greater or equal to 10.

in1T010(5, false) -> true

in1To10(11, false) → false

in1To10(11, true) -> true*/

import java.util.Scanner;
public class in1to10prgm
{
    static boolean in1to10(int ivalue,boolean bvalue)
    {
        if((ivalue>=1 && ivalue<=10)||bvalue==true)
        {
            return true;
        }
        else
        return false;
    }
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
		 int ivalue=sc.nextInt();
		 System.out.println("enter true or false");
		 boolean bvalue=sc.nextBoolean();
		 System.out.println(in1to10(ivalue,bvalue));
	}
}
/*
enter the number
-99
enter true or false
true
true


enter the number
-1
enter true or false
false
false

enter the number
5
enter true or false
false
true

enter the number
11
enter true or false
true
true

enter the number
11
enter true or false
false
false
*/
