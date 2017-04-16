package linkedlists;

import linkedlists.LinkedList.Node;

public class CycleDetection {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		Node head = ll.getLinkedList();
		Node curr = head;
		//We are making last node point to 6th node. So loop starting point is node 6.
		for(int i=0; i<5; i++)
		{
			curr = curr.getLink();
		}
		Node sixthNode = curr;
		curr = head;
		while(curr.getLink() != null)
		{
			curr = curr.getLink();
		}
		Node lastNode = curr;
		lastNode.setLink(sixthNode);
		curr = head;
		
		Node loopStartingPoint = new CycleDetection().startingPointOfLoop(curr);
		System.out.println("Loop starting node: "+loopStartingPoint.getData());
	}
	private Node startingPointOfLoop(Node head)
	{
		Node fast = head.getLink();
		Node slow = head;
		Node meetingPoint = null;
		while(fast!=null)
		{
			if(fast == slow)
			{
				meetingPoint = fast;
				break;
			}
			fast = fast.getLink().getLink();
			slow = slow.getLink();
		}
		
		//No loop
		if(meetingPoint == null)
		{
			return null;
		}
		Node temp = meetingPoint.getLink();
		int count = 1;
		//count number of nodes in loop.
		while(temp != meetingPoint)
		{
			count++;
			temp = temp.getLink();
		}
		
		//Now finding starting point. Start one pointer at head and another at count nodes from head. 
		//Move them at same pace. Point where they meet is the starting point.
		Node n1 = head;
		Node n2 = head;
		for(int i=1; i<=count; i++)
			n2 = n2.getLink();
		
		while(n1 != n2)
		{
			n1 = n1.getLink();
			n2 = n2.getLink();
		}
		
		return n1;
		
	}

}
