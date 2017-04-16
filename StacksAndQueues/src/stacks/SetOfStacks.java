package stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SetOfStacks 
{
	private final List<Stack<Integer>> setOfStacks = new ArrayList<>();
	private static int threshold = 10;
	
	public void push(int a)
	{
		if(setOfStacks.size() == 0)
		{
			Stack<Integer> firstStack = new Stack<>();
			firstStack.push(a);
			setOfStacks.add(firstStack);
			return;
		}
		Stack<Integer> lastStack = setOfStacks.get(setOfStacks.size() - 1);
		if(lastStack.size() == threshold)
		{
			Stack<Integer> newStack = new Stack<>();
			newStack.push(a);
			setOfStacks.add(newStack);
		}
		else
		{
			lastStack.push(a);
		}
	}
	
	public int pop()
	{
		if(setOfStacks.size() == 0)
		{
			System.out.println("No elements to return");
			return 0;
		}
		Stack<Integer> lastStack = setOfStacks.get(setOfStacks.size() - 1);
		if(lastStack.size() == 1)
		{
			int elem = lastStack.pop();
			setOfStacks.remove(lastStack);
			return elem;
		}
		return lastStack.pop();
	}
	
	public List<Stack<Integer>> getSetOfStacks()
	{
		return setOfStacks;
	}
}
