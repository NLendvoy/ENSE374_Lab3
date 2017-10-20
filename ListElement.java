public class ListElement 
{

	private int data;
	private ListElement next;
	
	public ListElement()
	{
		this.data = 0;
		this.next = null;
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
}