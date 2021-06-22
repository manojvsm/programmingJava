/*
Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

frontPiece ([1, 2, 3]) [1, 2]

frontPiece([1, 2]) [1, 2]

frontPiece([1])+ [1]

*/



import java.util.Arrays;
import java.util.Scanner;
public class assignment1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of array element");
		int arrlen=sc.nextInt();
		int arr[]=new int[arrlen];
		int arrresult[]=new int[2];
		
		for(int i=0;i<arrlen;i++)
			arr[i]=sc.nextInt();
		if(arrlen<=1)
			System.out.println(arr[0]);
		else
			arrresult[0]=arr[0];
			arrresult[1]=arr[1];
			System.out.println(Arrays.toString(arrresult));
	}

}


/*
output


enter the number of array element
6
5
3
1
5
7
9
[5, 3]




enter the number of array element
1
2
2
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
	at com.java.advancedJava.assignment1.main(assignment1.java:20)

*/
