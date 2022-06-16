package thursday_project;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int i, n, max;
				Scanner s = new Scanner(System.in);
				
				int a[] = new int[10];
				System.out.println("Enter the number:");
				for( i = 0; i < 10; i++)
				{
				a[i] = s.nextInt();
				}
				max = a[0];
				for( i = 0; i < 10; i++)
				{
				if(max < a[i])
				{
				max = a[i];
				}
				}
				System.out.println("greatest number :"+max);
				}
	}


