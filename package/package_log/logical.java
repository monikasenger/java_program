//logical package
package package_log;
import package_cond.conditional;
public class logical extends conditional{
	public void logi()
	{
		
		System.out.println("\nThis is Logical Package : ");
        acc();
        // printing the value of that two no in and,or,not operator
        System.out.println("AND : "+(a>b && b<a));

        System.out.println("OR : "+(a<b || b<a));

        System.out.println("NOT : "+(a>b | b>a));
	}
}
