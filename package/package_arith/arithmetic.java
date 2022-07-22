
// arithmetic package
package package_arith;

import package_use.accept;

public class arithmetic 
	extends accept{
		public void arith()
		{
			System.out.println("This is Airthmetic Package ");
			accept.acc();
			System.out.println("addition : "+(a+b));
			System.out.println("Subtraction : "+(a-b));
			System.out.println("Multiplication : "+(a*b));
			System.out.println("Division : "+(a/b));
			System.out.println("Modulus : "+(a%b));
		}
}
