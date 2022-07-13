package hybrid_inheritence;

public class ascending extends accept{
	public void asc()
	{
		display();
		System.out.println("The numbers  is =");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nThe numbers in ascending order is =");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}
