package polymorphism;

import java.util.Scanner;

public class SI_overriding {
	public void interest()
	{
		System.out.print("\t\t\t SIMPLE INTEREST:");
		 double P,R,T,SI; 
		 Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter the principal: ");
     P=sc.nextDouble();
    System.out.println("Enter the rate: ");
     R=sc.nextDouble();
    System.out.println("Enter the time: ");
    T=sc.nextDouble();
    SI= (P*R*T)/ 100;
    System.out.println("Simple Interest: " +SI);
}
}