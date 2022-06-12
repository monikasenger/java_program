package registration;

import java.util.Scanner;

public class registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Name :- ");
		String Name = sc.nextLine();
		
		System.out.println("Enter your Roll No. :- ");
		int rollno = sc.nextInt();
		
		System.out.println("Enter your Subject Marks  :- ");
		
		System.out.println("c = ");
		int c = sc.nextInt();
		
		System.out.println("java = ");
		int java = sc.nextInt();
		
		System.out.println("dotnet = ");
		int dotnet = sc.nextInt();
		
		System.out.println("oops =  ");
		int oops = sc.nextInt();
		
		System.out.println("dsa =  ");
		int dsa = sc.nextInt();
		
		
		int res = c+java+dotnet+oops+dsa;
		System.out.println("Percentage Marks = "+res*100/500+"%");
		
		
	}


	}

