/*Write a program to accept product name, ID, Price .
 * Arrange the data in Descending order and display the output. (Using Linked List)
 * 
 */
package Sep_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Product  implements Comparator<Product_details_encap>
{
	//main method
	   public static void main(String[] args)
	{
		   Product obj=new Product();
		   obj.order();
		   
		   }
	   
	   /*********************************************/
	    
	   //compare method with parameters
	    public int compare(Product_details_encap product1, Product_details_encap product2)
	{
	    if (product1.getid() > product2.getid())
	    {
	            return 1;
	    }
	    return -1;
	}

	    /*******************************************/
	    
	    //Ordering the product element
	public void order() {
//adding the product by linked list
	    LinkedList<Product_details_encap> list = new LinkedList<Product_details_encap>();
	    list.add(new Product_details_encap("product1", 10010,2000));
	    list.add(new Product_details_encap("product2", 1005,8688));
	    list.add(new Product_details_encap("product3", 1000,7987));
	    list.add(new Product_details_encap("product4", 1002,8666));
	    list.add(new Product_details_encap("product5", 1012,8660));
	    // display the product before sorting
	    System.out.println("list before sorted\n");
	    System.out.println("**=============**=================**");
	    for (Product_details_encap prt: list )
	    {
	            System.out.println(prt);
	    }
	    System.out.println("**=============**=================**\n");
	    Collections.sort(list, new Product());
	    // display the list after sorting
	    System.out.println("Sorted list based on product id\n");
	    System.out.println("**=============**=================**");
	    for (Product_details_encap prt: list )
	    {
	            System.out.println(prt);
	    }
	    System.out.println("**=============**=================**\n");
	}
		
	}
