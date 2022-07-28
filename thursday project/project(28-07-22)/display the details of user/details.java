package exception_project;

import java.util.Scanner;

public class details  extends use_encapsulation{
	String name, Address,id,s; 
	private  String password,user_Id;
	 String Phone_No;
	static int pass_length=8;
	 Scanner sc= new Scanner(System.in);
	 //creating accept class
public void accept() {
	setUser_Id(user_Id);
	System.out.println("Enter your Name :");
	name=sc.next();
	System.out.println("Enter your phone number :");
	Phone_No=sc.next();
	System.out.println("Enter your address number :");
	Address=sc.next();
	
	id(); // displaying the id class
}
//  class for id
public void id()
{
	System.out.print("user_Id : ");
	try { /// use of try catch
		id = sc.next();
		setUser_Id(id);
		if(id.length() != 8)
		{
			throw new Exception("Enter the Valid Id ........");	
		}
		else
		{
				password();		
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println("The ID Should be maximun 8 length.");
		System.exit(0);
	}
}
// class for password
	public void password()
	{
		System.out.print("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n"); 
               s = sc.next();
               setPassword(s);
			try { // try catch for password
				if (is_Valid_Password(s)) {
		            System.out.println("Password is valid: " + s);
		            show();
		        } else {
		        	throw new Exception("Not a valid password: ");
		           }
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		
	}	
	// class for checking the condition for password length
		public static boolean is_Valid_Password(String password) {

	        if (password.length() < pass_length) return false;

	        int charCount = 0;
	        int numCount = 0;
	        for (int i = 0; i < password.length(); i++) {
	            char ch = password.charAt(i);
	            if (is_Numeric(ch)) numCount++;
	            else if (is_Letter(ch)) charCount++;
	            else return false;
	        }
	        return (charCount >= 2 && numCount >= 2);
	    }
		// class for checking the condition for password letter in capital letter
	    public static boolean is_Letter(char ch) {
	        ch = Character.toUpperCase(ch);
	        return (ch >= 'A' && ch <= 'Z');
	    }

	 // class for checking the condition for password number
	    public static boolean is_Numeric(char ch) {

	        return (ch >= '0' && ch <= '9');
	    }
	    // class of showing all the details of user
	    public void show()
		{
			System.out.println("Your name : "+name);
			System.out.println("Your Phone No : "+Phone_No);
			System.out.println("Your Address : "+ Address);
			System.out.println("Your Id : "+getUser_Id());
			System.out.println("Your Password : "+getPassword());
			
		}

}
