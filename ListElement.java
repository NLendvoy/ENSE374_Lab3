public class ListElement 
{

	private int data;
	private ListElement next;
	private ListElement prev;
	
	public ListElement()
	{
		this.data = 0;
		this.next = null;
		this.prev = null;
	}
	
	public void setData(int data)
	{
		this.data = data; 
	}
	
	public int getData()
	{
		return data;
	}
	
	public ListElement getNext()
	{
		return this.next;
	}
	
	public void setNext(ListElement nextNode)
	{
		this.next = nextNode;
	}
	
	public ListElement getPrev()
	{
		return this.prev;
	}
	
	public void setPrev(ListElement prevNode)
	{
		this.prev = prevNode;
	}
}