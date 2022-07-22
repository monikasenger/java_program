// wap to accept the account detail from user and create a atm program using encapsulation
package thursday_project;

import java.util.Scanner;

import java.util.Scanner;

public class bank_account extends  atm_encapsul
{
	int acc_no,n,no,amount,balance=500;
String name,phone_no,acc_type;
int pin = 2612, entry;;
char ans;
Scanner sc=new Scanner(System.in);
//accept all the value 
public void accept_value()
{
System.out.println("Enter your Name of customer:");
name=sc.next();
System.out.println("Enter your phone number :");
phone_no=sc.next();
System.out.println("Enter your age:");
n=sc.nextInt();
set_age(n);
System.out.println("Enter Your account number:");
acc_no=sc.nextInt();
setAcc_no(no);
System.out.println("Enter Your account type:");
acc_type=sc.next();
}

//to display the all the details of customer
public void display()
{
	System.out.println("Name of customer:"+name);	
	System.out.println("phone number of customer:"+phone_no);	
	System.out.println("age of customer:"+get_age());	
	System.out.println("acount number of customer:"+getAcc_no());	
	System.out.println("type of account of customer:"+acc_type);	

		
		System.out.println("\t\t\t\t\tWELCOME ");
		//use of pin
	System.out.print("ENTER YOUR PIN: ");
	entry =sc.nextInt();
	if( entry != pin )
	{
		System.out.print("\nINCORRECT PIN. TRY AGAIN.");
		System.out.print("\n ENTER YOUR PIN: ");
		entry =sc.nextInt();
	}
	if( entry != pin )
	System.out.println("YOUR ACCOUNT HAS BEEN LOCKED");
	
	else if(entry==pin){

	System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	do {
	//start the atm processs
		System.out.println("type:- \n 1:withdrow \n 2: deposit \n 3:check balance ");
		System.out.print("Enter your type:");
		int type= sc.nextInt();
	switch(type) {
	case 1: withdrow();
	break;
	case 2: deposit();
	break;
	case 3:balance();
		break;
	default: System.out.println("invalid amount");
	}
	System.out.println("Do you want to do more transaction:  Y/N"); //if we use  want the atm process according to the use need
	 ans = sc.next().charAt(0); 
	}while(ans == 'y'|| ans =='Y');
	System.out.println("Thank You For Coming : ");

}}

//withdaw method
public void withdrow()
{
	System.out.println("enter the amount");
	amount = sc.nextInt();
	if(balance>=amount)
	{
		balance = balance - amount;
	System.out.println("amount is withdraw");	
	}
	else
	{
		System.out.println("Insufficient Balance");}
}

//deposit method
public void deposit()
{
	System.out.println("enter the amount");
	amount = sc.nextInt();
	balance= balance+ amount ;
	System.out.println("amount is deposit");
}

//balance method
public void balance()
	{
		System.out.println("Balance : "+balance);  
		System.out.println("");
	}
}	
