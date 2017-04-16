package linkedlists;

public class LinkedList 
{
	Node n1 = new Node(4, null);
	Node n2 = new Node(6, null);
	Node n3 = new Node(5, null);
	Node n4 = new Node(9, null);
	Node n5 = new Node(2, null);
	Node n6 = new Node(6, null);
	Node n7 = new Node(4, null);
	Node n8 = new Node(5, null);
	Node n9 = new Node(9, null);
	Node n10 = new Node(10, null);
	
	public LinkedList()
	{
		n1.setLink(n2);
		n2.setLink(n3);
		n3.setLink(n4);
		n4.setLink(n5);
		n5.setLink(n6);
		n6.setLink(n7);
		n7.setLink(n8);
		n8.setLink(n9);
		n9.setLink(n10);
	}
	
	public Node getLinkedList()
	{
		return n1;
	}
	
	public static class Node
	{
		int data;
		Node link;
		Node(int data, Node link)
		{
			this.data = data;
			this.link = link;
		}
		public void setLink(Node link)
		{
			this.link = link;
		}
		public int getData() 
		{
			return data;
		}
		public Node getLink() 
		{
			return link;
		}
		
	}
}
