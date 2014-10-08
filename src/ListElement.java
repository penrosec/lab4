
public class ListElement {
	private int data;
	 public ListElement next;
	public  ListElement previous;
	
public ListElement()
{
	data=0;
	next=null;
	previous=null;
}
public void setData(int Data)
{
	data=Data;
}
public int getData()
{
	return data;
}
public void setNext(ListElement le)
{
	next=le;
}
public ListElement getNext()
{
	return next;
}
public void setPrevious(ListElement le)
{
	previous=le;
}
public ListElement getPrevious()
{
	return previous;
}
}
