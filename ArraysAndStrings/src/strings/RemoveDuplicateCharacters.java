package strings;

import java.util.Scanner;

public class RemoveDuplicateCharacters 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = scan.next();
		final String res = new RemoveDuplicateCharacters().removeDuplicateChars(input);
		System.out.println("removed dups: "+res);
		scan.close();
	}
	
	//Without using any buffer. O(N^2).
	private String removeDuplicateChars(final String str)
	{
		char[] chars = str.toCharArray();
		int l = str.length();
		int finalLength = l;
		
		for(int i = 0; i<l; i++)
		{
			for(int j = 1; j<l; j++)
			{
				if(chars[i] == chars[j] && chars[i] != '$')
				{
					chars[j] = '$';
					finalLength--;
				}
			}
		}
		
		char[] result = new char[finalLength];
		int j=0;
		for(int i=0; i<finalLength; i++)
		{
			if(chars[i] != '$')
			{
				result[j] = chars[i];
				j++;
			}
		}
		return new String(result);
	}
}
