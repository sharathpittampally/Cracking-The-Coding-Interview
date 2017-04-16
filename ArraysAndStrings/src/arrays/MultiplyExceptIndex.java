package arrays;

import java.util.Scanner;

public class MultiplyExceptIndex 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length:");
		int n = s.nextInt();
		int[] ip = new int[n];
		System.out.println("Enter the array:");
		for(int i=0; i<n; i++)
		{
			ip[i] = s.nextInt();
		}
		int[] res = new MultiplyExceptIndex().process(ip);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(res[i]+", ");
		}
		s.close();
	}
	
	/**
	 * Multiplies all numbers except that particular index.
	 * Example: i/p = [1,2,3,4] o/p = [24, 12, 8, 6].
	 */
	private int[] process(int[] ip)
	{
		int[] result = new int[ip.length];
		//first multiply all numbers
		int x = ip[0];
		for(int i=0; i<ip.length; i++)
		{
			x = x*ip[i];
		}
		
		for(int i=0;i<ip.length; i++)
		{
			result[i] = x / ip[i];
		}
		return result;
	}
}
