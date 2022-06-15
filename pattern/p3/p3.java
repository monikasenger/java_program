package pattern;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for (i=6; i>=0; i--)   
		{  
		//inner loop work for space      
		for (j=6-i; j>=1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (k=1; k<=2*i-1; k++ )   
		{   
		//prints star      
		System.out.print("*");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		}   
}



