/*
 WAP of creating different function of unboxing, boxing, finalized, garbage collection print the output.
 */
import java.util.Scanner;

public class Garbage_collection {
	public static void main(String args[]){
	Unboxing();
	Boxing();
	// print the method of garbage collection
			System.out.println("\t\tThis is garbage collection");
		Garbage_collection g1= new Garbage_collection();// create first object of garbage collection
		Garbage_collection g2=new Garbage_collection();//create second object of garbage collection
		g1=null;// assign the value of first garbage collection
		g2=null;// assign the value of second garbage collection
		System.gc(); // print garbage collection
		//System.out.println(g1);
		//System.out.println(g2);
	}	
	//create class of unboxing
	public static void Unboxing() {
		int a,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\tThis is unboxing method");
		System.out.println("enter a number:");
		a=sc.nextInt();// accept a number from user
		Integer i=new Integer(a);// apply method of unboxing
		num=i;
		System.out.println("After unboxing method:\t"+num);	// print the number after unboxing
}
	//create class of boxing
	public static void Boxing() {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\tThis is boxing method");
		System.out.println("enter a number:");
		a=sc.nextInt();// accept a number from user
			Integer b2=a;// apply method of boxing
			Integer b3=4;
			System.out.println("after boxing method:\t"+b2+" , "+b3);// print the number after boxing
			}
	// create a class of finalized method
	public void finalize()
	{
		System.out.println("This is finalize method");	// print the statement of finalized
	}
}


