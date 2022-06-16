package thursday_project;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
