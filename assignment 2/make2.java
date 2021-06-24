/*Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays

make2([4, 5], [1, 2, 3]) [4, 5]

make2([4], [1, 2, 3]) [4, 1]

make2([], [1, 2]) [1, 2]
*/
import java.util.Arrays;
import java.util.Scanner;
public class assignment1 {
	static int[] make2(int a[], int b[])
	{
		int temp[]=new int[2];
		int index=0;
		for(int j=0;j<a.length;j++)
		{
			if(index<2)
				temp[index]=a[j];
			index++;
		}
		for(int j=0;j<b.length;j++)
		{
			if(index<2)
				temp[index]=b[j];
			index++;
		}
		return temp;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of array in A element");
		int arr1=sc.nextInt();
		
		int a[]=new int[arr1];
		
		for(int i=0;i<arr1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the number of array in B element");
		int arr2=sc.nextInt();
		int b[]=new int[arr2];
		for(int i=0;i<arr2;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(make2(a,b)));
	}

}



/*
output

enter the number of array in A element
3
2
5
9
enter the number of array in B element
2
1
6
[2, 5]


enter the number of array in A element

1
5
enter the number of array in B element
3
4
8
9
[5, 4]
*/
