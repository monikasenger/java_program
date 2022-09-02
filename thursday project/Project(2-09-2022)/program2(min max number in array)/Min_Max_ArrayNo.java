/*:Write a program to find second minimum and second maximum number from the array .
*/
package Sep_02;

import java.util.Scanner;

public class Min_Max_ArrayNo {
int i,j,size,temp;// globally declared the variable
	 float average;
	 Scanner sc=new Scanner(System.in);
	 
	 // main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Min_Max_ArrayNo obj=new Min_Max_ArrayNo();// creating the object for class
		obj.Maximum_no();// calling maximum number method
		obj.Minimum_no();//calling minimum number method
	}
	
	/***************************************/
	//create a method to accept an array
public int[] Accept_array()
{
	System.out.println("Enter the size of array:");
	size=sc.nextInt();// enter the size of array
	int[] a=new int[size]; 
	System.out.println("\nEnter "+size+" array number: ");
	// loop for enter the array according the size of array
	for(i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	// display all the array in line by llop
	System.out.println("\n The number of arrays:");
	for(i=0;i<size;i++)
	{
		System.out.print(a[i]+", ");
	}
	return a;		
}

/*********************************************/

// create a method to find the maximum number in array
public void Maximum_no()
{
	System.out.println("\n\t\t\t\t..... THE MAXIMUM NUMBER IN ARRAY...........");
	int a[]=Accept_array();// display the the details of accept method
	// loop for finding the largest number
	 for (int i = 0; i < size; i++) 
     {
         for (int j = i + 1; j < size; j++) 
         {
             if (a[i] < a[j]) 
             {
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         }
     }
    // print the largest number
     System.out.println("\n\nLargest number in array:"+a[0]);
 }

/*******************************************/

//create a method to find the minimum number in array
public void Minimum_no()
{
	System.out.println("\t\t\t\t..... THE MINIMUM NUMBER IN ARRAY...........");
	int a[]=Accept_array();// display the the details of accept method
	// loop for finding the smallest number
	 for (int i = 0; i < size; i++) 
     {
         for (int j = i + 1; j < size; j++) 
         {
             if (a[i] > a[j]) 
             {
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         }
     }
	// print the smallest number
     System.out.println("\n\nSmallest number in array:"+a[0]);
 }
}
