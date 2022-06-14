import java.util.Scanner;

public class options {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the Options :- \n 1: Check Even and Odd No."
				+ "\n 2: Check Square"
				+ "\n 3: Check Vowel or Not"
				+ "\n 4:Greater Between three No");
		
		System.out.print("Enter your Choice = ");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		case 1: 
			System.out.println("Enter the Number = ");
			int n = sc.nextInt();
			  if(n%2==0) {
				  System.out.println(n+" "+"is Even No.");
			  }else {
				  System.out.println(n+" "+"is Odd No.");
			  }
		break;
		case 2: 
			System.out.print("Enter the Number = ");
			int s = sc.nextInt();
			System.out.println("Square = "+" "+s*s);
		break;
		case 3:
			System.out.println("Enter your Character = ");
			char alph = sc.next().charAt(0);	
			switch(alph) {
			case 'a': System.out.println(alph+" "+"is Vowel");
			break;
			case 'i': System.out.println(alph+" "+"is Vowel");
			break;
			case 'o': System.out.println(alph+"is Vowel");
			break;
			case 'u': System.out.println(alph+"is Vowel");
			break;
			case 'e':System.out.println(alph+"is Vowel");
			break;
			default:
				System.out.println(alph+"Consunent");
			}
		break;
		case 4: 
			System.out.println("Enter the Value A = ");
			int a = sc.nextInt();
			
			System.out.println("Enter the Value B = ");
			int b = sc.nextInt();
			
			System.out.println("Enter the Value C = ");
			int c = sc.nextInt();
			
			if(a>b && a>c) {
				System.out.println("A="+a+"is Greater No.");
			}
			else if(b>c && b>a) {
				System.out.println("B="+b+"is Greater No.");
			}else {
				System.out.println("C="+c+"is Greater No.");
			}
		break;		
		default:
			System.out.println("Wrong Input");
	}

	}
}
