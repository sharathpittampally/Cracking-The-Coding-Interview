package linkedlists;

import java.util.Scanner;

import linkedlists.LinkedList.Node;

public class NthToLastElement 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		Node nthFromLast = new NthToLastElement().nthToLastElement(ll.getLinkedList(), n);
		System.out.println("Nth from last node: "+nthFromLast.getData());
		scan.close();
	}
	
	private Node nthToLastElement(Node head, int n)
	{
		Node curr = head;
		Node nthNode = head;
		for(int i=0; i<n; i++)
		{
			curr = curr.getLink();
		}
		while(curr != null)
		{
			curr = curr.getLink();
			nthNode = nthNode.getLink();
		}
		return nthNode;
	}
}
