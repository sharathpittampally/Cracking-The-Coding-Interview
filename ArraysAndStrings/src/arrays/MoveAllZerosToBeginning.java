package arrays;

import java.util.Scanner;

public class MoveAllZerosToBeginning 
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
		int[] res = new MoveAllZerosToBeginning().process(ip);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(res[i]+" ");
		}
		s.close();
	}
	
	/**
	 * I will start iterating the input array from the end. If I encounter a non-zero number I will put it in the result from the back.
	 * If I encounter a zero then I will put it from the front.
	 * @param ip
	 * @return
	 */
	int[] process(int[] ip)
	{
		int[] result = new int[ip.length];
		int i=0,j=ip.length-1;
		for(int k=ip.length-1; k>=0; k--)
		{
			if(ip[k] != 0)
			{
				result[j] = ip[k];
				j--;
			}
			else
			{
				result[i] = ip[k];
				i++;
			}
		}
		return result;
	}
}
