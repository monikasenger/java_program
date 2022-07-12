package inheritence;

public class sum_of_digit_hiera extends hierarchical_Inheritance {
	
public void sum() {
	int a=display();
	int b, sum=0;
	while(a>0)
	{
	   b=a%10;
	   sum=sum+b;
	   a=a/10;
	   
	}
	System.out.print("sum of digits =\t "+ sum);
	}
	}