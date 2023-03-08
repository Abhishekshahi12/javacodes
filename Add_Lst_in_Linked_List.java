package Apna_package;

public class Add_Lst_in_Linked_List {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
            this.data=data;
            this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public void Add_last(int data)
	{
		Node New_Node=new Node(data);
		if(head==null)
		{
			head.next=New_Node;
			New_Node.next=null;
			return;
		}else {
		while(head.next!=null)
		{
			head=head.next;
		}
		head.next=New_Node;
		New_Node.next=null;
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add_Lst_in_Linked_List ll=new Add_Lst_in_Linked_List();
		ll.Add_last(45);
		ll.Add_last(56);
		ll.Add_last(5566);
		while(head.next!=null)
		{
			System.out.println(head.data);
		}

	}

}
