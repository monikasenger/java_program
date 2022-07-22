// conditional package
package package_cond;
import package_assig.assignment;
public class conditional  extends assignment{
	public void con()
	{
		System.out.println("\nThis is Conditonal Package ");
		acc();
		
		if(a>b)
		{
			System.out.println("A is greater : "+a);
		}
		else
		{
			System.out.println("B is greater : "+b);
		}
	}	
}
