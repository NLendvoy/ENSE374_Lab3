import java.util.Scanner;
import java.util.Stack;

public class Main 
{

	public static void main(String[] args) 
	{

		int userIn = 0;
		
		LinkedList list = new LinkedList();
		
		Scanner input = new Scanner(System.in);

		System.out.println("What would you like to do? ");
		
		
		int userIn2;
		
		while (userIn != 6)
		{
			System.out.println("Add Element (1)   Retrieve (2)   Delete (3)   Print (4)   Print Reverse (5)   Exit (6)");
			userIn = input.nextInt();
			
			switch(userIn)
			{
			case 1: 
				System.out.println("What number would you like to input? ");
				userIn2 = input.nextInt();
				ListElement le = new ListElement();
				le.setData(userIn2);
				list.addElement(le);
				break;
			
			case 2:
				System.out.println("What index would you like to retrieve? ");
				userIn2 = input.nextInt();
				System.out.print(list.getElement(userIn2).getData());
				input.nextLine();
				break;
				
			case 3:
				System.out.println("What index would you like to delete? ");
				userIn2 = input.nextInt();
				list.deleteElement(userIn2);
				System.out.println("\n");
				break;
				
			case 4:
				list.printLinkedListHead();
				System.out.println("\n");
				break;
				
			case 5:
				list.printLinkedListTail();
				input.nextLine();
				break;
			}
		}
		input.close();
	}
}