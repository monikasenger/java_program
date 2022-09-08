/*Write a Java program to implement following options on LinkedList using collections.

Intersection
Union
Display
*/
package Sep_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;


public class Linked_List
{
 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 int num1, num2;// globally declared
  
  // main method
  public static void main(String args[]) throws IOException
  {
	  Linked_List li=new Linked_List();
	  li.union_intersection();
  }
  
  
  //method for union and intersection
  public void union_intersection() throws NumberFormatException, IOException {
    LinkedList list1 = new LinkedList();
    LinkedList list2 = new LinkedList();
    LinkedList list3 = new LinkedList();
    LinkedList list4 = new LinkedList();
  
    System.out.print("Enter no.of Elements in list1:");
  
    num1 = Integer.parseInt(br.readLine());
// loop for adding element in list1
    System.out.println("Enter Elements of list 1");
    for(int i=1; i <= num1; i++)
    {
      System.out.print("Enter Element "+i+": ");
      String element = br.readLine();
 
      if(!list1.contains(element))
 list1.add(element);
    }                                
    System.out.println("**=============**=================**");
    System.out.print("\nEnter no.of Elements in list 2:");
    num2 = Integer.parseInt(br.readLine());
  // loop for adding element in list2
    System.out.println("Enter Elements of list 2");
  
    for(int i=1; i <= num2; i++)
    {
      System.out.print("Enter Element "+i+": ");
      String element = br.readLine();
 
      if(!list2.contains(element))
 list2.add(element);
    } 
    System.out.println("**=============**=================**"); 
    
//sorting the list collection
    Collections.sort(list1);
    Collections.sort(list2);
    System.out.println("\nList 1:"+list1);
    System.out.println("List 2:"+list2);
    System.out.println("**=============**=================**");
    // loop for adding the element in union list
  for(int i=0; i < list1.size(); i++)
      list3.add(list1.get(i));
  for(int i=0; i < list2.size(); i++)
      if(!list1.contains(list2.get(i)))
 list3.add(list2.get(i));
    System.out.println("\nUnion: "+list3);
    System.out.println("**=============**=================**");
    
    // loop for adding the element in intersection list
    for(int i=0; i < list1.size(); i++)
       list4.add(list1.get(i));
    list4.retainAll(list2);
    System.out.println("\nIntersection: "+list4);
    System.out.println("**=============**=================**");
   }
}
