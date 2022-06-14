import java.util.Scanner;

public class profit_loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);

	        System.out.print("Enter the SP of item =  ");
	        int sp = sc.nextInt();

	        System.out.print("Enter the CP of item =  ");
	        int cp = sc.nextInt();

	        if(sp == cp)
	        
	        {
	            System.out.println("neither profit or Loss");
	        }

	        else if(sp > cp)
	        {
	            System.out.println("  profit = "+(sp-cp));
	        }

	        else 
	        {
	            System.out.println(" loss = "+(cp-sp));
	        }

	}

	}


