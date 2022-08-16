/*Write a program to do the following process 
-Number of Duplicate Words in String
-Number of Words in Given String
-Occurrences of Each Character in String
-Remove Duplicate Words from String 
-Count of Vowels
*/
package Aug_16;


import java.util.Scanner;

public class Different_string_process {
	static Scanner sc= new Scanner(System.in);
	  static String str;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Different_string_process  obj=new Different_string_process ();// Creating object for the class
     obj.count_duplicatewords();// calling count the duplicate words method
		 obj.count_words(); // calling count total words method
obj.occurence_eachchar();// calling occurance for character  method
		obj. remove_duplicatewords(); // calling remove the duplicate words method
	obj.count_vowel();// calling count total vowels method
	}
	//creating accept class
	public static void accept() {
		System.out.println("Enter the string  of the user: "); 
		 str=sc.nextLine();// accept the string form user
		 str=str.toLowerCase();// convert string in lower case
	}
	
	
	//creating class for  count the duplicate words
		public static void count_duplicatewords() {
			System.out.println("\n\t\t.....THIS DISPLAY THE NUMBERS OF DUPLICATE WORDS IN STRING.....");
			 int count,j , i; // initialized the variable
			 accept();// display the details of accept class
System.out.println( "Duplicate words with the number of times it duplicate in string:");
			  String words[] = str.split(" ");   
			 for( i = 0; i < words.length; i++) {// for loop execute  for check the condition of index value of string 
		         count=1;   // now initialized the value of count
		         // for loop execute to check condition of index value  with string length 
				 for( j = i+1; j < words.length; j++) {    
		                if(words[i].equals(words[j])) {   
		                    count++;    // initilised the count value
		                    //Set words[j] to 0 to avoid printing visited word    
		                    words[j] = " ";    
		                }    }          
		            //Displays the duplicate word if count is greater than 1    
		            if(count > 1 && words[i] != " ") 
		            	 System.out.println(words[i]+"("+count+")");  
		            }}
		
		
	//	creating class to  the count total words in string
		public static void count_words() {
			System.out.println("\n\t\t.....THIS DISPLAY THE TOTAL NUMBER OF WORDS PRESENT IN STRING.....");
		int	count=0,i;// initialized the variable
		accept();// display the details of accept class
		// split method is used to split the word from sentence
			      String sentence[] = str.split(" ");
			      System.out.println("Words are:");
			      for(String s : sentence) 
			      {
			         System.out.println(s);	
			         }
		 char ch[]= new char[str.length()]; // create the new character array value with string length
		 // for loop execute to check condition of index value  with string length   
		 for( i=0;i<str.length();i++)  //
	            {   //Set ch[i] to char value at the given index value
	                ch[i]= str.charAt(i);  
	             // check the condition for character store in that index value
	                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) ) 
	                    count++;  // increment of count
	            }   
		       System.out.println("No of word in the string:"+count);  // display the count of string
		}		
		
		
//		creating class to  the display the occurance for character in string
			public void occurence_eachchar() {	
				System.out.println("\n\t\t.....THIS DISPLAY THE OCCURRENCE OF EACH CHARACTER PRESENT IN STRING.....");
				int i,j;// initialized the variable
			int[] count = new int[255]; 
				accept(); // display the details of accept class
				System.out.println(" Number of Occurrence of each letter are");
				 // for loop execute to check condition of index value  with string length 
				for ( i = 0; i < str.length(); i++) { 
					count[str.charAt(i)]++; // increment the count value which store char value at the given index value
				} 
				char[] ch = new char[str.length()];
				// for loop execute to check condition of index value  with string length 
				for ( i = 0; i <str.length(); i++) { 
					int find = 0;
					 //Set ch[i] to char value at the given index value
					ch[i] = str.charAt(i); 
					for ( j = 0; j <= i; j++) { 
						if (str.charAt(i) == ch[j]) 
							find++;	//increment of find value
					} 
					//Displays the occurence of each character if find equal to 1  
					if (find == 1) { 
						System.out.println(str.charAt(i)+"(" + count[str.charAt(i)]+")"); 
					} } } 
			
			
//			creating class to  the remove the duplicate words in string
		 public static void remove_duplicatewords()   
		    {  
			 System.out.println("\n\t\t.....THIS  REMOVE THE DUPLICATE WORDS FROM THE STRING.....");
			 int i,j,k;// initialized the variable
			 accept();// display the details from count the duplicate words
			 System.out.println("\nString after remove the duplicate words from string:");
			 String[] words=str.split(" ");
			 // for loop execute to check condition of index value  with string length 
				for( i=0;i<words.length;i++) {
					//excute if words[j] not equal to 0  
					if(words[i]!=" ") {
			// for loop execute to check condition of index value  with duplicate words length 
			for( j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
						words[j]=" ";
				}}}}
				// for loop execute to check condition print the string after remove duplicate words 
				for( k=0;k<words.length;k++) {
					if(words[k]!=" ") {
						System.out.print(words[k]+" ");
					}} }
		 
		 
//			creating class to  the count total vowels in string
		 public void count_vowel() {
			 System.out.println("\n\t\t.....THIS DISPLAY TOTAL NUMBER OF VOWELS PRESENT IN STRING.....");
		int count=0,i;	// initialized the variable
			 accept();// display the details of accept class
				
			 // for loop execute to check condition of index value with string length 
				for( i=0;i<str.length();i++) {	
					//check the condition of each character 
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	{
		System.out.println("Vowel present in string "+" "+str.charAt(i));//print the vowel present in the string
					count++;// increment of count
				}}
				System.out.println("Total number of vowel in string:"+count);// display the total number of vowels present in string
		 }
}
		

