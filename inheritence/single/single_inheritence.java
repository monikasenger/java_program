package inheritence;

import java.util.Scanner;

public class single_inheritence {
			
			public static void disp()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number");
				int i,num;
				num=sc.nextInt();
				num=num%2;
				if(num==0) {
				System.out.print("even");
				}
				else {
					System.out.print("odd");
				}
			}
		}

