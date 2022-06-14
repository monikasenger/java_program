import java.util.Scanner;

public class SI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Write a program to accept principal amount,  rat of interest,  no of years from user and calculat rat of interest
		System.out.print("Enter the Pricipal Amount = ");
		float p = sc.nextFloat();
		
		System.out.print("Enter the Time = ");
		float t = sc.nextFloat();
		
		System.out.print("Enter the Rate of Interest = ");
		float r = sc.nextFloat();
  
        /* Calculate simple interest */
        float SI = (p * t * r) / 100;
        System.out.println("Simple interest = " + SI);
        float CI = p+SI;
        System.out.println("Simple interest = " + CI);
	}

	}


