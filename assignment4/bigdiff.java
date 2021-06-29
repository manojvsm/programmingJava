/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. 
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) -> 7

bigDiff([7, 2, 10, 9]) -> 8

bigDiff([2, 10, 7, 2]) -> 8
*/

import java.util.Scanner;
public class assignment1 {
	static void bigdiff(int[] arr)
	{
		int large,small;
		large=arr[0];
		small=arr[1];
		for(int i=1;i<arr.length;i++)
		{
			if(large<arr[i])
			{
				large=arr[i];
			}
			
				if(small>arr[i])
				{
					small=arr[i];
				}
			
		}
		int result=large-small;
		System.out.println(result);
		/*
		 *** Bubble sort concept***
		int swap;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
				}
			}
		}
		int result=arr[arr.length-1]-arr[0];
		System.out.println(result);*/
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		bigdiff(arr);
	}
}
/*
output

enter the array length
5

9
8
7
6
5

4



enter the array length
4

2
9
4
1

8
*/
