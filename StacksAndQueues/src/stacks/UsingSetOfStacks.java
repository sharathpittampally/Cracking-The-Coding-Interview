package stacks;

public class UsingSetOfStacks 
{
	public static void main(String[] args) 
	{
		//push operations
		SetOfStacks stacks = new SetOfStacks();
		for(int i=0;i<25;i++)
		{
			stacks.push(i);
		}
		
		//print
		System.out.println("setOfStacks after push: "+ stacks.getSetOfStacks());
		
		//pop operations - 6 pops
		
		for(int i = 0; i < 6; i++)
		{
			System.out.println("Pop-"+i+": "+stacks.pop());
		}
		
		//print
		System.out.println("setOfStacks after pop: "+stacks.getSetOfStacks());
		
	}
}
