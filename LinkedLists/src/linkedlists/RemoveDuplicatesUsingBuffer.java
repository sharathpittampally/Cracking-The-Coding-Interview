package linkedlists;

import java.util.HashSet;
import java.util.Set;

import linkedlists.LinkedList.Node;

public class RemoveDuplicatesUsingBuffer 
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		Node listWithoutDups = new RemoveDuplicatesUsingBuffer().removeDuplicates(ll.getLinkedList());
		//printing
		System.out.println("Removed duplicates: ");
		while(listWithoutDups != null)
		{
			System.out.print(listWithoutDups.getData()+", ");
			listWithoutDups = listWithoutDups.getLink();
		}
	}
	
	private Node removeDuplicates(Node head)
	{
		final Set<Integer> setOfNodes = new HashSet<>();
		Node newHead = head;
		Node prev = null;
		Node curr = head;
		while(curr != null)
		{
			if(setOfNodes.contains(curr.getData()))
			{
				prev.setLink(curr.getLink());
				curr.setLink(null);
				curr = prev.getLink();
			}
			else
			{
				setOfNodes.add(curr.getData());
				prev = curr;
				curr = curr.getLink();
			}
		}
		return newHead;
	}
}
