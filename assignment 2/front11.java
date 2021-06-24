import java.util.Arrays;
import java.util.Scanner;
public class assignment1 {
	static int[] front11(int a[], int b[])
	{
		int temp[]=new int[2];
		if(a.length>=1)
			temp[0]=a[0];
		if(b.length>=1)
			temp[1]=b[0];
		return temp;
	}
	public static void main(String args[])
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the A array length");
		int al=sc.nextInt();
		int a[]=new int[al];
		System.out.println("enter the B array length");
		int bl=sc.nextInt();
		int b[]=new int[bl];
		System.out.println("enter the A elements");
		for(int i=0;i<al;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the B elements");
		for(int j=0;j<bl;j++)
		{
			b[j]=sc.nextInt();
		}*/
		int a[]= {6,2,7};
		int b[]= {8,5};
		System.out.println(Arrays.toString(front11(a,b)));
	}
}
/*
output

[6,8]

//another
enter the A array length
2
enter the B array length
3
enter the A elements
4
8
enter the B elements
9
4
5
[4, 9]

// another
enter the A array length
1
enter the B array length
0
enter the A elements
8
enter the B elements
[8, 0]

*/
