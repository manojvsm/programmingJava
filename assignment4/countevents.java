/*
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

count Evens ([2, 1, 2, 3, 4]) -> 3

count Evens ([2, 2, 0]) -> 3

count Evens ([1, 3, 5]) -> 0

*/

import java.util.Scanner;
public class assignment1 {
	
	static void countevents(int[] arr)
	{
		int result=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				result++;
		}
		System.out.println(result);
	}
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		int arrlen=sc.nextInt();
		int arr[] = new int[arrlen];
		System.out.println("enter the values");
		for(int i=0;i<arrlen;i++)
		{
			arr[i]=sc.nextInt();
		}
		countevents(arr);
	}
}

/*

output

enter the array length
6
enter the values
6
8
4
1
2
9

4



enter the array length
4
enter the values
9
8
7
6

2
*/
