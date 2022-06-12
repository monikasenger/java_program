package cube;

import java.util.Scanner;

public class cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number =");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println(a+""+"is even number");
			int cube=a*a*a;
			System.out.println("cube="+cube);
		}
	}

}
