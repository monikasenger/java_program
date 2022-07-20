package polymorphism;

import java.util.Scanner;

public class CI_overriding  extends SI_overriding {
	public void interest()
	{
		System.out.println("\t\t\t COMPOUND INTEREST:");
		 double P,R,T,A,SI,CI; 
		 Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter the principal: ");
     P=sc.nextDouble();
    System.out.println("Enter the rate: ");
     R=sc.nextDouble();
    System.out.println("Enter the time: ");
    T=sc.nextDouble();
    SI= (P*R*T)/ 100;
    A=SI+P;
    System.out.println("amount: " +A);
    CI=P*(Math.pow((1 +R/ 100),T));
    System.out.println("Compound Interest: " +CI);
}}
