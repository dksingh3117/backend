/**
 * 
 */
package com.sample.work;

import java.util.Scanner;

/**
 * 
 *
 */
public class IntLinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		IntLinkedList list = new IntLinkedList(); 
		 
        System.out.println("Singly Linked List Test\n");          
        char ch;
          //Perform list operations  
        do
        {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. Insert element");
            System.out.println("2. Remove tail element");
            System.out.println("3. Remove all elements from target");
            
            int choice = scan.nextInt();            
            switch (choice)
            {                       
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insertElement( scan.nextInt() );                     
                break;                                                          
            case 2 : 
                    list.deleteLast();
                break;
            case 3 : 
            	 System.out.println("Enter integer element to remove");
                list.deletElements(scan.nextInt() );
            break;
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
             //Display List   
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');       

	}

}
