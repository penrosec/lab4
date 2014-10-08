
public class LinkedList {
	private
	ListElement head;
	ListElement pcurr;
	
public	LinkedList()
	{
		head=null;
		pcurr=head;
	}
public void addElement(ListElement le)
{
	if(head==null)
	{
		head=le;
	}
	else
	{
		pcurr=head;
		while(pcurr.getNext()!=null)
		{
			pcurr=pcurr.getNext();
		}
	pcurr.next=le;
	le.previous=pcurr;
	}
	
	
}
public ListElement deleteElement(int index)
{
	pcurr=head;
	int i=1;
	while(i<index)
	{
		if (pcurr.next==null)
		{
			System.out.print("Index out of bounds");
			return pcurr;
		}
		i++;
		pcurr=pcurr.next;
	}
	ListElement temp=new ListElement();
	temp=pcurr;
	if(index==1)
	{
		pcurr.next.previous=null;
		head=pcurr.next;
		pcurr=null;
		return temp;
	}
	if(pcurr.next==null)
	{
		pcurr.previous.next=null;
		pcurr=null;
		return temp;
	}
	pcurr.previous.next=pcurr.next;
	pcurr.next.previous=pcurr.previous;
	pcurr=null;
	return temp;
	
}
public ListElement getElement(int index)
{
	pcurr=head;
	int i=1;
	while(i<index)
	{
		if (pcurr.next==null)
		{
			System.out.println("Index out of bounds");
			return pcurr;
		}
		i++;
		pcurr=pcurr.next;
		
	}
	return pcurr;
}
public void printLinkedListHead()
{
	pcurr=head;
	while (pcurr!=null)
	{
		System.out.println(pcurr.getData());
		pcurr=pcurr.next;
		
	}
}
public void printLinkedListTail()
{
	pcurr=head;
	while (pcurr.next!=null)
	{
		pcurr=pcurr.next;
	}
	while(pcurr!=null)
	{
		System.out.println(pcurr.getData());
		pcurr=pcurr.previous;
	}

}

public static void main(String[] args)
{
	LinkedList x= new LinkedList();
	ListElement y= new ListElement();
	ListElement z= new ListElement();
	ListElement a= new ListElement();
	y.setData(5);
	z.setData(4);
	a.setData(3);
	x.addElement(y);
	x.addElement(z);
	x.addElement(a);
	x.deleteElement(3);
	x.printLinkedListHead();
	System.out.println("break");
	x.printLinkedListTail();
}
}


