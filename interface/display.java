package Interface;

import java.util.Scanner;

public class display implements reverse, smallest{
int[] arr;
int i,j,size;
	Scanner sc=new Scanner(System.in);
	public void accept() {
System.out.print("\nenter the size of array");
size=sc.nextInt();
arr=new int[size];
System.out.print("\nenter the element of array");
for(i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
}
}
	
	@Override
	public void smallest() {
		// TODO Auto-generated method stub
accept();
		
		int min=arr[0];
		for(j=1;j<size;j++)
		{
			if(min>arr[j])
				min=arr[j];
		}
		System.out.print("smallest number:"+min);
		}
	
	@Override
	public void rev() {
		// TODO Auto-generated method stub
		accept(); 
     System.out.println();  
     System.out.println("\narray in reverse order: ");  
    for (int i = size-1; i >= 0; i--) {  
         System.out.print(arr[i] + " ");  
     }  
 }  

public static void main(String[] args) {
	// TODO Auto-generated method stub
display obj=new display();

obj.smallest();
obj.rev();
}

	}
	

