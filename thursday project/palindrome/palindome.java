package thursday_project;

import java.util.Scanner;

public class palindome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int r,sum=0,temp;    
		 Scanner sc=new Scanner(System.in);
			System.out.println("enter  number");
			r=sc.nextInt(); 
		  temp=r;    
		  while(r>0){    
		   r=r%10;  
		   sum=(sum*10)+r;    
		   r=r/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
	}


