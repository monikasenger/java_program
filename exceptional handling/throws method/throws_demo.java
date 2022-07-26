package exceptional_handling;

//this is a program in which we use throws method with try catch block in exceptional handling
import java.util.Scanner;

public class throws_demo {
	int size,i;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		try
		{
			throws_demo obj=new throws_demo();
			obj.demo();
		}
		catch(Exception e)
		{
			System.out.println("size of zero is not accees: "+e);
		}	
		 System.out.println("Outside the main class ");	
	
	}
// class to accept a number and use throw block using loops
	public void demo() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("Enter a size ");//accept a number from user
		size=sc.nextInt();
		if(size==0)//check the condition
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		int arr[]=new int[size];
		System.out.println("Enter "+size+" numbers");// accepting the size of array
		//displaying the array 
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
			System.out.println("The array number is = ");
			for(i=0;i<size;i++)
			{
				System.out.println(arr[i]);
			}
			 System.out.println("Outside the throws method in exception");	
	}
}
