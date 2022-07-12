package abstraction;

import java.util.Scanner;

public class fiboSeries  extends abs{
	@Override
	public void fibo_series() {
	int n,c,a=0,b=1;
	 Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the number ");
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