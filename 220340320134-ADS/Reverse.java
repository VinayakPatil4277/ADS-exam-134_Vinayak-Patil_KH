//Reverse a Linked List

class Reverse
{
	static node head;
	
	static class node
	{
		int data;
		node next;
		node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	static node reverse(node head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		node rest=reverse(head.next);
		head.next.next=head;
		
		head.next=null;
		return rest;
	}
	
	static void print()
	{
		node temp=head;
		while(temp != null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	static void push(int data)
	{
		node temp=new node(data);
		temp.next=head;
		head=temp;
	}
	
	
	public static void main(String... Args)
	{
	   /*System.out.println("Test Case 1");
	   
		push(5);
		push(4);
		push(3);
		push(2);
		push(1);
		
		System.out.println("Given linklist");
		print();
		
		head=reverse(head);
		System.out.println("reverse linklist");
		print();
		Delete(stack);*/
		
//___________________________________________________
      System.out.println("Test Case 2");
	   
		push(5);
		push(2);
		push(4);
		push(3);
		
		
		System.out.println("Given linklist");
		print();
		
		head=reverse(head);
		System.out.println("reverse linklist");
		print();		
	}
} 