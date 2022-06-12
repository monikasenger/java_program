package bitwise;

import java.util.Scanner;

public class bitwise_opt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		//& bitwise operator
		res=a&b;
		System.out.println("The bitwise End is ="+res);
		//| bitwise operator
		res=a|b;
		System.out.println("The bitwise OR is ="+res);
//^ bitwise operator
		res=a^b;
		System.out.println("The bitwise XOR is ="+res);
	}

}
