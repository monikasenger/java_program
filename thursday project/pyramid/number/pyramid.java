package thursday_project;

import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the no of Row : ");
	        int row = sc.nextInt();
	        int count = 1;
	        for (int i = row; i > 0; i--)
	        {
	  for (int j = 1; j <= i*2; j++)
	            {
	                System.out.print(" ");
	            }
	  
	            for (int j = 1; j <= count; j++)          
	            {
	                System.out.print(j+" ");
	            } 
	            for (int j = count-1; j >= 1; j--)
	            {               
	                System.out.print(j+" ");            
	            }
	            System.out.println();
	            count++;
	        }
	    }}