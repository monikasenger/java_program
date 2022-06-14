import java.util.Scanner;

public class menucard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		
		int total = 0;
		char ans;
		System.out.println("\t\t\t swad restaurant ");
		
		do {
			System.out.println("Menu :- \n 1: Starter \n 2: Main Course \n 3: Dessert");
			System.out.print("Enter your Order :");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
				   System.out.println("Starter Are :- \n 1: pani puri = Rs 20"
				   		+ " \n 2: Samosa = Rs 10" +" \n 3: Veg Manchurian = Rs 120  "
				   		+ "\n 4: tomato soup = Rs 50" +  "\n 5: paneer tikka = Rs 70");
				   System.out.print("Enter the Item :-");
				     int ch1 = sc.nextInt();
				     switch(ch1) {
				     case 1: System.out.print("\t pani puri= \t\t");
				             total+=20;
				             System.out.println("Total Amount = "+"Rs"+" "+total);
				     break;
				     case 2:
				    	 System.out.println("\tSamosa\t\t");
			             total+=10;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
				    	 break;
				     case 3:
				    	 System.out.println("\tVeg Manchurian\t\t");
			             total+=120;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
				    	 break;
				     case 4:
				    	 System.out.println("\ttomato soup \t\t");
			             total+=50;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
				    	 break;
				     case 5:
				    	 System.out.println("\tpaneer tikka\t\t");
			             total+=70;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
				    	 break;
				    	 default:
				    		 System.out.println(" Please Enter Vaild Input");
				     }
				     break;
			case 2 :
				System.out.println("Main Course are :- \n1: paneer paratha = Rs 80"
						+ " \n2:dal palak = Rs 60 "
						+ "\n3: peas pulao= Rs 50 "
						+ "\n 4: besan cheela= Rs 40 "
						+ "\n 5: tawa pulao= Rs 70 ");
				System.out.print("Enter the Item :-");
				int main = sc.nextInt();
				switch(main) {
			     case 1: System.out.println("\tpaneer paratha\t\t");
			             total+=80;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
			     break;
			     case 2:
			    	 System.out.println("\tdal palak \t\t");
		             total+=60;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			     case 3:
			    	 System.out.println("\tpeas pulao\t\t");
		             total+=50;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			     case 4:
			    	 System.out.println("\t besan cheela\t\t");
		             total+=40;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			     case 5:
			    	 System.out.println("\ttawa pulao\t\t");
		             total+=70;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			    	 default:
			    		 System.out.println(" Please Enter Vaild Input");
			     }
				break;
			case 3 : 
				System.out.println("Dessert  :- \n1:cheese cake = Rs 50 "
						+ "\n2: cupecake = Rs 40 "
						+ "\n3: chocolate icecream  = Rs 150 "
						+ "\n4: brownies  = Rs 100 "
						+ "\n5: chocolate chip cookies  = Rs 120 ");
				System.out.print("Enter the Item :-");
				int dessert = sc.nextInt();
				switch(dessert){
			     case 1: System.out.println("\tcheese cake\t\t");
			             total+=50;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
			     break;
			     case 2:
			    	 System.out.println("\t cupecake\t\t");
		             total+=40;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			     case 3:
			    	 System.out.println("\tchocolate icecream \t\t");
		             total+=150;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			     case 4:
			    	 System.out.println("\tbrownies \t\t");
		             total+=100;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			     case 5:
			    	 System.out.println("\tchocolate chip cookies  \t\t");
		             total+=120;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			    	 default:
			    		 System.out.println(" Please Enter Vaild Input");
			     }
			}
			
			System.out.println("Do you want to Add more Items :  Y/N");
			 ans = sc.next().charAt(0); 
		}
		while(ans == 'y'|| ans =='Y');
		
		System.out.println("Thank You For Coming :) ");
	}

}
