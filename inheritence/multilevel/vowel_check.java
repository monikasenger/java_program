package inheritence;

public class vowel_check extends greater_no {
	 public static void vowel()
	 {
		 greater();
		 System.out.print("Enter the Characters : ");
	     
	     ch = sc.next().charAt(0);
	     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
	     {
	         System.out.println("It is Vowel : "+ch);
	     }

	     else
	         System.out.print("It is Consonent : "+ch);
	 }
}
