package Apna_package;

public class LinkedList {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node head;
	public static Node tail;
	public static int size;

	public void add_first(int data) {
		size++;
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

	public void add_last(int data) {
		size++;
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}

	public void rev_ll() {
		Node previous = head;
		Node current = head;
		Node next;
		current = previous.next;
		next = current.next;
		previous.next = null;
		while (next != null) {
			current.next = previous;
			previous = current;
			current = next;
			next = current.next;
		}

		current.next = previous;
		head = current;

	}

	public void revll2() {
		Node prev = null;
		Node current = tail = head;

		Node Next;
		while (current != null) {
			Next = current.next;
			current.next = prev;
			prev = current;
			current = Next;

		}
		head = prev;

	}

	public void remove_nth_from_last(int n) {
		int size = 0;
		Node temp = head;
		Node prev = head;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		int i = 1;
		if (n == size) {
			head = head.next;
		} else {
			while (i < size - n) {
				prev = prev.next;
				i++;
			}
			prev.next = prev.next.next;
		}
	}

	public void printLL() {
		Node temp = head;
		if (head == null) {
			System.out.println("Null");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
//    public void delete_n_from_last(int n) {
//    	int size =0;
//    	Node temp=head;
//    	while(temp!=null) {
//    		size++;
//    		temp=temp.next;
//    	}
//    	Node prev=head;
//    	int i=0;
//    	while(i!=n-k) {
//    		
//    	}
//    	
//    }

	public void add_in_middle(int index, int data) {
		if (index == 0) {
			add_first(data);
			return;
		}
		size++;
		Node temp = head;
		Node To_be_added = new Node(data);
		int count = 0;
		while (count != index - 1) {
			temp = temp.next;
			count++;
		}
		To_be_added.next = temp.next;
		temp.next = To_be_added;
	}

	public int delete_first() {
		if (size == 0) {
			System.out.println("this linked list is empty");
			return Integer.MIN_VALUE;
		} else if (size == 1) {
			int m = head.data;
			head = tail = null;
			return m;
		} else {
			int val = head.data;
			head = head.next;
			size--;
			return val;
		}
	}

	public int delete_last() {
		if (size == 0) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		} else if (size == 1) {
			int val = head.data;
			head = tail = null;
			return val;
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			int val = tail.data;
			temp.next = null;
			size--;
			return val;
		}
	}

	public int search_in_linkedList(int key) {
		int i = 0;
		Node temp = head;
		if (head.data == key) {
			return i;
		}
		while (temp.data != key && temp.next != null) {
			temp = temp.next;
			i++;
		}
		if (i >= size - 1) {
			return -1;
		} else {
			return i;
		}
	}

	public int helper(Node head, int key) {
		if (head == null) {
			return -1;
		}
		if (head.data == key) {
			return 0;
		}
		int idx = helper(head.next, key);
		if (idx == -1) {
			return idx;
		}
		return idx + 1;
	}

	public int recursive_search(int key) {
		return helper(head, key);
	}

	public Node find_mid(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}
		return slow;
	}

	 

	public Boolean check_cycle(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				System.out.println("cycle exists");
				return true;
			}

		}
		return false;

	}

	public void remove_cycle(Node head) {
		Node fast = head;
		Node slow = head;
		int count = 0;
		while (fast.next != null && fast != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				count = 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("LL doesnot contain cycle");
		} else {
			slow = head;
			Node prev = null;
			while (slow != fast) {
				slow = slow.next;
				prev = fast;
				fast = fast.next;
			}
			prev.next = null;
		}
	}

	// fast=head.next initially
	public Node findmid(Node head) {
		Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public void merge(Node Righthead, Node Lefthead) {
		Node left = Lefthead;
		Node Right = Righthead;
		Node temp = new Node(-1);
		while (left.next != null && Right.next != null) {
			if (left.data > Right.data) {
				temp.next = left;
				left = left.next;
			} else {
				temp.next = Right;
				Right = Right.next;

			}
			temp = temp.next;

		}
		while (left.next != null) {
			temp.next = left;
			temp = temp.next;
			left = left.next;
		}
		while (Right.next != null) {
			temp.next = Right;
			temp = temp.next;
			Right = Right.next;
		}
	}

	public Node merge_sort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node mid = findmid(head);
		Node Righthead = mid.next;
		mid.next = null;
		Node Lefthead = head;
		Node newRight = merge_sort(Righthead);
		Node newLeft = merge_sort(Lefthead);
		merge(newRight, newLeft);

		return head;

	}

	public void Zig_ZagLL(Node head) {
		// first find mid node
		Node mid = findmid(head);
		// now rev second half
		Node current = mid.next;
		mid.next=null;
		Node prev = null;
		Node nextt;
		while (current != null) {
			nextt = current.next;
			current.next = prev;
			prev = current;
			current = nextt;
		}
		Node Righthead = prev;//head of right side
		// now we have to merge alternatively
		Node lefthead = head;
		Node L1;
		Node L2;
		Node R1;
		Node R2;
		
		L1=lefthead.next;
		L2=L1.next;
		R1=Righthead.next;
		R2=R1.next;
		while(L2!=null&&R2!=null) {
			
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
//		ll.add_first(5);
//		ll.add_first(6);
//		ll.add_last(8);
//		ll.add_first(0);
//		ll.add_first(5);
//		ll.add_in_middle(2, 4);

//		ll.printLL();
//		System.out.println(ll.size);
//		System.out.println(ll.delete_first());
//		System.out.println(ll.delete_last());
//		System.out.println(ll.size);
//      System.out.println(ll.search_in_linkedList(15));  
//		System.out.println(ll.recursive_search(8));
//		ll.rev_ll();

//		ll.printLL();
//		ll.revll2();
////		ll.remove_nth_from_last(3);
//		ll.printLL();
		ll.add_first(1);
		ll.add_first(2);
		System.out.println(ll.is_Pallindrome(head));
//		ll.add_first(3);
//		ll.add_first(3);
//		ll.add_first(2);
//		ll.add_first(1);
//		Node nw=head.next.next.next;
//		tail.next=nw;
//		ll.remove_cycle(head);
//		System.out.println(ll.check_cycle(head));
//		ll.merge_sort(head);
//		ll.printLL();


//		System.out.println(ll.is_Pallindrome(head));
	}

}
