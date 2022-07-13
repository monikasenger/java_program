package inheritence;

public class greater_no extends swapping{
	  public static  void greater()
	    {
	    	swap();     

	        System.out.print("Enter the Size : ");
	        size = sc.nextInt();
	        int no[] = new int[size];
	        
	        System.out.print("Enter the "+ size +" no : ");
	        for(int i=0; i<size; i++)
	        {
	        	no[i] = sc.nextInt();
	        }
	        
	               
	        max = no[0];
	        for(i=0; i<size; i++)
	        {
	        	if(max < no[i])
	            {
	            	max = no[i];
	            }        	
	        }
	        
	        System.out.println("Greater value is : "+max);
	        

	    }

	}

