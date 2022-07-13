package hybrid_inheritence;

public class greater extends accept{
	public void great()
	{
		display();
		 g=arr[0];
		for(i=0;i<size;i++)
		{
			if(g<arr[i])
			{
				g=arr[i];
			}
		}
		System.out.println("The greater vnumber is ="+g);
	}
}
