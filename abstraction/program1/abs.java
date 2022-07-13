package abstraction;

import java.util.Scanner;

public abstract class abs {
	abstract void fibo_series();
public void sumOfDigit()
{int b,sum=0;
Scanner sc=new Scanner(System.in);

System.out.print("enter the number=");
int a=sc.nextInt();
while(a>0)
{
   b=a%10;
   sum=sum+b;
   a=a/10;
   
}
System.out.print("sum of digits =\t "+ sum);
}
}
