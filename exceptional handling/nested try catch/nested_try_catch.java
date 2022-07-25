//this is a program of nested try catch method in exceptional handling
package exceptional_handling;
public class nested_try_catch {
	 int a[] = { 1, 2, 3, 4, 5 };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nested_try_catch obj=new nested_try_catch ();
		obj.arry();
	}
public void arry()
{
	// Main try block
    try {
// trying to print element at index 5
        System.out.println(a[5]);

        // try-block2 inside another try block
        try {

            // performing division by zero
            int x = a[2] / 0;
        }
        catch (ArithmeticException e2) {
            System.out.println("division by zero is not possible");
        }
    }
    catch (ArrayIndexOutOfBoundsException e1) {
        System.out.println("ArrayIndexOutOfBoundsException");
        System.out.println("Element at such index does not exists");
    }
  //finally block
  		finally
  		{
  			System.out.println("avoid division by zero");
  		}
    // rest program will be executed
    System.out.println("Outside nested try_catch ");
}

}

