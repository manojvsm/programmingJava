/*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) true
unlucky1([1, 1, 1]) false*/




import java.util.Arrays;
import java.util.Scanner;
public class assignment1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of array element");
		int arrlen=sc.nextInt();
		int arr[]=new int[arrlen];
		for(int i=0;i<arrlen;i++)
			arr[i]=sc.nextInt();
		if((arr[0]==1&&arr[1]==3)||(arr[1]==1 && arr[2]==3)||(arr[arr.length-3]==1 && arr[arr.length-2]==3)||(arr[arr.length-2]==1 && arr[arr.length-1]==3))
			System.out.println("true");
		else
			System.out.println("false");
	}

}

/*
output

enter the number of array element

6
1
2
1
3
4
5
false



enter the number of array element
6
5
1
3
5
4
9
true
*/
