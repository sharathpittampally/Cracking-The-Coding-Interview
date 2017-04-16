package largestPrimeFactor;

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		long number = scan.nextLong();
		long largestPrime = new LargestPrimeFactor().largestPrimeFactor(number);
		if(largestPrime == 0)
			System.out.println("No prime factors.");
		else
			System.out.println("Largest prime factor: "+largestPrime);
		scan.close();
	}
	
	//prime factorization: if the target number is divisible by a prime
	//then divide the number repeatedly by the prime untill it is divisible once it is no longer divisible
	//then go to the next prime.
	private long largestPrimeFactor(long number)
	{
		for(int i = 2; i<=number; i++)
		{
			if(number % i == 0 && number > i)
			{
				while(number % i == 0)
				{
					number = number / i;
				}
			}
			if(i >= number)
				return i;
		}
		return 0;
	}
}
