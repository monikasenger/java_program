package hybrid_inheritence;

import java.util.Scanner;

public class accept {
	int[] arr;
	int i,num,fac=1,j,g,size,temp;
		Scanner sc=new Scanner(System.in);
		public void display() {
	System.out.print("\nenter the size of array");
	size=sc.nextInt();
	arr=new int[size];
	System.out.print("\nenter the element of array");
	for(i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
		}
}
