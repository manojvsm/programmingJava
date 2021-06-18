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
