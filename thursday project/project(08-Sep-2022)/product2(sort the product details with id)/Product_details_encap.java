/*Write a program to accept product name, ID, Price .
 * Arrange the data in Descending order and display the output. (Using Linked List)
 * 
 */

package Sep_08;

import java.util.Comparator;

public class Product_details_encap {
//globally declared
	 private String name;
     private int id;
     private int price;
    
     //method of product with parameters
     public Product_details_encap(String n, int id,int price)
     {
             this.name = n;
             this.id = id;
             this.setPrice(price);
     }
     
     //get method of name
     public String getName()
     {
             return name;
     }
     
     //set method of name
     public void setName(String name)
     {
             this.name = name;
     }
     
     //get method of id
     public int getid()
     {
             return id;
     }
     //set method of id
     public void setid(int id)
     {
             this.id = id;
     }
     //get method of price
	public int getPrice() {
		return price;
	}
	//set method of price
	public void setPrice(int price) {
		this.price = price;
	}
	//string to display the details
	public String toString()
     {
             return "\nProduct Name: "+this.name+"\n Product id: "+this.id+"\n Product price"+this.price;  
     }
}