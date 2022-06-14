package pattern;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;       
		//Outer loop work for rows  
		for (i=0; i<6; i++)   
		{  
		//inner loop work for space      
		for (j=6-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		}   
}
