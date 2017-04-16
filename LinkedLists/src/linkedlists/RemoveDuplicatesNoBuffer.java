package linkedlists;

import linkedlists.LinkedList.Node;

public class RemoveDuplicatesNoBuffer 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		Node listWithoutDups = new RemoveDuplicatesNoBuffer().removeDuplicates(ll.getLinkedList());
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
		final Node newhead = head;
		Node curr = head;
		Node runner = null;
		Node prevRunner = null;
		
		while(curr != null)
		{
			runner = curr;
			while(runner.getLink() != null)
			{
				prevRunner = runner;
				runner = runner.getLink();
				if(runner.getData() == curr.getData())
				{
					prevRunner.setLink(runner.getLink());
					runner = prevRunner.getLink();
				}
			}
			curr = curr.getLink();
		}
		return newhead;
	}
}
