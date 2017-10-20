import java.util.Stack;

public class LinkedList 
{
	private ListElement head;
	private ListElement tail;
	public int size;
	
	public LinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public void addElement(ListElement le)
	{
		ListElement element = new ListElement();
		
		if (head == null)
		{
			head = element;
			head.setData(le.getData());
			tail = head;
		}
		else
		{
			tail.setNext(element);
			element.setPrev(tail);
			tail = element;
			tail.setData(le.getData()); 
		}
		
		size++;
	}
	
	public ListElement getElement(int index)
	{
		ListElement current = head;
		for (int i = 0; i < index; i++)
		{
			current = current.getNext();
		}
		return current;
	}
	
	public ListElement deleteElement(int index)
	{
		ListElement current = head;
		
		if (index == 0)
			head = head.getNext();
		else 
		{
			for (int i = 0; i < index - 1; i++)
			{
				current = current.getNext();
			}
		}
		current.setNext(current.getNext().getNext());
		size --;
		
		current.getNext();
		return current;
	}
	
	public void printLinkedListTail()
	{
		ListElement current = tail;
		if (size == 0)
			System.out.println("List is empty");
		else
		{
			for(int i = 0; i < size; i++)
			{
				if ((i+1) != size)
					System.out.print(current.getData() + "<-");
				else
					System.out.print(current.getData());
				current = current.getPrev();
			}
			System.out.println();
		}
	}
	
	public void printLinkedListHead()
	{
		ListElement current = head;
		if (size == 0)
			System.out.println("List is empty");
		else 
		{
			for (int i = 0; i < size; i++)
			{
				if ((i+1) != size)
					System.out.print(current.getData() + "->");
				else
					System.out.print(current.getData());
				
				current = current.getNext();
			}
			System.out.println();
		}
	}
}