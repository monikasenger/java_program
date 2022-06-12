package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	      System.out.println("Enter value of 1st number ::");
	      int a = sc.nextInt();

	      System.out.println("Enter value of 2nd number ::");
	      int b = sc.nextInt();

	    
	      System.out.println("Enter the function \n +: Addition\n -: Subtraction\n X: Multiplication\n /: Division\n %: Modules ");
	      
	      System.out.println("Select operation :-");
	      String f = sc.next();
	      switch(f) {
	         case "+" :
	         System.out.println("Sum of the given two numbers: "+(a+b));
	         break;
	         case "-" :
	         System.out.println("Difference between the two numbers: "+(a-b));
	         break;
	         case "*" :
	         System.out.println("Product of the two numbers: "+(a*b));
	         break;
	         case "/" :
	         System.out.println("Result of the division: "+(a/b));
	         break;
	         case "%":
	        	 System.out.println("Modules"+(a%b));
	         break;
	         default :
	        	 System.out.println("Invalid grade");
	}

}
}