package thursday_project;

import java.util.Scanner;

public class operator_using_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
accept();
	}
	public static void accept()
	{
		int a,b,c,d,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		assignment(a,b);
		arithmetic(a,b);
		bitwise(a,b);
		logical(a,b,c,d);
		relational(a,b);
	}
public static void assignment(int a, int b)
{
	System.out.println("\n assignment operator");
	//addition
	System.out.println("add="+(a+b));
	//subtraction
			System.out.println("sub="+(a-b));
			//multiplication
			System.out.println("mul="+(a*b));
			//division
			System.out.println("div="+(a/b));
			//modulus
			System.out.println("mod="+(a%b));
}
	
public static void arithmetic(int a, int b)
{
	System.out.println("\n arithmetic operator");	
	// =
			b=a;
			System.out.println("a=:"+b);
			// +=
			b+=a;
			System.out.println("a+=:"+b);
			//=*
			b*=a;
			System.out.println("a*=:"+b);
	}
public static void bitwise(int a, int b)
{
	System.out.println(" \n bitwise operator");
	//& bitwise operator
			System.out.println("The bitwise End is ="+ (a&b));
			//| bitwise operator
			System.out.println("The bitwise OR is ="+(a|b));
	//^ bitwise operator
			System.out.println("The bitwise XOR is ="+(a^b));
	}
public static void logical(int a, int b,int c, int d)
{
	System.out.println("\n logical operator");
	// && operator
			System.out.println((a>b)&&(c>b));
			System.out.println((a>b)&&(d>b));
			// || operator
					System.out.println((a>b)||(c>b));
					System.out.println((a>b)||(d>b));
				
					// ! operator
					System.out.println((5==3));
	}
public static void relational(int a, int b)
{
	System.out.println("\n relational operator");
	//== operator
			System.out.println(a==b);
			//!= operator
					System.out.println(a!=b);
					//> operator
					System.out.println(a>b);
					//< operator
					System.out.println(a<b);
					//>= operator
					System.out.println(a>=b);
					//<= operator
					System.out.println(a<=b);
		
	}
}
