package inheritence;

import java.util.Scanner;

public class armstrong_hiera extends hierarchical_Inheritance{
	
	public void armstrong() {
		int num=display();
		int  r, sum = 0;
		 while (num != 0)
		 {
		     r = num % 10;
		     sum = sum + (r*r*r);
		     num /= 10;
		 }

		 if(sum == a)
		     System.out.println(a+ " is an Armstrong number.");
		 else
		     System.out.println(a + " is not an Armstrong number.");
		}

			}
