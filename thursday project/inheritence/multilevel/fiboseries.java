package thursday_project;

import java.util.Scanner;

public class fiboseries {
	public static void disp()
	{
	
	int n,c,a=0,b=1;
	 Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	n = sc.nextInt();
	while(a <= n)
	{
		System.out.print(a+" ");
		c = a + b;
		a = b;
		b = c;   
	} 
	}}
