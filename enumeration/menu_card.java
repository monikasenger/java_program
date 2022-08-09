/* Wap to print the price of of the food item in menucard using enum keyword
		*/
package enumaration;

import java.util.Scanner;


public class menu_card {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	order();
	}
	enum food{//  create enumeration function
 samosa( 10), cupcake(40),icecream (150),brownies ( 100 );
		int price;
		food(int price) //constructor of enumeration
		{
			this.price=price;
		}
		public int show_price()// show the price of food item
		{
			return price;// return the price
		}							
	}
	public static void order() {
		Scanner sc= new Scanner(System.in); // scanner import
		String food_option; // declared the string variable
		System.out.println(" All food item with price");
		food[] f1=food.values();// initialize the food value
		for(food f:f1)
		{
			System.out.println(f+" "+f.price); // print all the price of all the food
		}
		System.out.print("Enter your Order :");
		food_option=sc.next(); // print the user choice
		food f; // declared the variable for food item
		f=food.valueOf(food_option);
		switch(f) // switch case for the option of food item
		{
		case samosa:System.out.println("price of samosa"+":\t"+food.samosa.price); // print price of samosa
			break;
		case cupcake:System.out.println("price of cupcake"+":\t"+food.cupcake.price); //print  price of cupcake
			break;
		case icecream:System.out.println("price of icecream"+":\t"+food.icecream.price);// print price of icecream
			break;
		case brownies:System.out.println("price of brownies"+":\t"+food.brownies.price);// print price of brownies
			break;
		default:{ //if user have invalid choice we have try  catch block in that case
			try
			{
				
				System.out.println("enter valid item");
			}
				//Catching  exception
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		}
	}

}
