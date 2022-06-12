package assignment;

import java.util.Scanner;

public class assignment_opt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a");
		a=sc.nextInt();
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
}
