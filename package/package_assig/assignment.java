// assignment package

package package_assig;
import package_arith.arithmetic;
public class assignment extends arithmetic{
	public void ass()
	{
	System.out.println("\nThis is Assignment Package ");
	acc();
	System.out.println("Old Values ");
	System.out.println("A : "+a+ "\n"+"B : "+b);
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("New Values ");
	System.out.println("A : "+a+"\n"+"B : "+b);
	}
}