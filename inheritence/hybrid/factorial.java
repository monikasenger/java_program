package hybrid_inheritence;

public class factorial extends greater{
	public void fact()
	{
		display();
		 num=arr[0];
		while(num>0)
		{
		fac=fac*num;
		num--;
		}
		System.out.println("The factorial is ="+fac);
	}
}
