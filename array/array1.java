package array;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, max;
		Scanner s = new Scanner(System.in);
		
		int a[] = new int[10];
		System.out.println("Enter the number:");
		for(int i = 0; i < 10; i++)
		{
		a[i] = s.nextInt();
		}
		max = a[0];
		for(int i = 0; i < 10; i++)
		{
		if(max < a[i])
		{
		max = a[i];
		}
		}
		System.out.println("greatest number :"+max);
		}
		}
