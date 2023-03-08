package Apna_package;

public class LinkedListnew {
	public static class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public void add_first(int data)
	{   Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public void add_last(int data)
	{   Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedListnew ll=new LinkedListnew();
     LinkedList lll=new LinkedList();
  
   ll.add_first(0);
     ll.add_last(5);
     lll.add_first(55);
     lll.printLL();
	}

}
