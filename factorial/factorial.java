import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;
		Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number = ");
 int a=sc.nextInt();
 for(i=1;i<=a;i++)
 {
	 fact*=i;
 }

 System.out.println("factorial of "+a+"="+ fact);
}
}