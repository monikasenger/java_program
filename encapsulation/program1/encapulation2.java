package encapsulation;

import java.util.Scanner;

public class encapulation2  extends encalp1{
	int roll_no,n;
	String name;
	int percentage , total=0;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		encapulation2 obj=new encapulation2();
		obj.accept();
		obj.disp();
		
	}
	public void accept()
	{
		System.out.println("Enter your Name:");
		name=sc.next();
		System.out.println("Enter Your roll number");
		roll_no=sc.nextInt();
		  System.out.println("Enter the total subjects ");
		  n=sc.nextInt();
			set_sub(n);
	        int arr[] = new int[n]; 
	        System.out.println("Enter the marks secured in each subject ");
	        for(int i=0;i<n;i++)  
	        {
	            arr[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	            total=total+arr[i];
	        }
	        percentage = (total / n);     
	    }  
	public void disp()
	{
		System.out.println("Name:"+name);
		System.out.println("subject:"+get_sub());
		System.out.println("Roll Number :"+roll_no);
		System.out.println("The total marks obtained :"+total);
		System.out.println( "Total Percentage : " + percentage + "%");
		switch ( percentage / 10) {
        case 9:
            System.out.print("grade of student:A+");
            break;
        case 8:
        	System.out.print("grade of student:A");
        	break;
        case 7:
            System.out.print("grade of student:B+");
            break;
        case 6:
            System.out.print("grade of student:B");
            break;
        case 5:
            System.out.print("grade of student:C");
            break;
        default:
            System.out.print("grade of student:D");
            break;
        }
}
}
