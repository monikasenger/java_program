import java.util.Scanner;

public class multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("enter a number");
int a=sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(a+"*"+i+"="+a*i);
}
	}

}
