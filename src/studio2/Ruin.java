package studio2;

import java.util.Scanner;

public class Ruin {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double startAmount, winChance, winLimit;
		System.out.println("What is your starting amount?");
		startAmount = in.nextDouble();
		System.out.println("What is the win probability?");
		winChance = in.nextDouble();
		System.out.println("What is the win limit?");
		winLimit = in.nextDouble();
		double random;
		System.out.println("How many days of simulations do you want to run? ");
		int totalSimulations = in.nextInt();	
		int amountSuccesses, amountRuins;
		amountSuccesses = 0;
		amountRuins = 0;
		for (int i = 0;i<totalSimulations;i++);
		{
			while ((startAmount< (startAmount + winLimit)) && (startAmount > 0))
			{	random = Math.random();
			if(random<winChance)
			{ startAmount++;
			}
			else
			{ startAmount--;
			}
			if (startAmount==0)
			{
				amountRuins = amountRuins+1;
			}
			else
			{
				amountSuccesses=amountSuccesses+1;
			}
				
			System.out.println(amountSuccesses);
			
			System.out.println(amountRuins);
			}
		}
	
		
	}
	}
