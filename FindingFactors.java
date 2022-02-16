

import java.util.Scanner;
public class FindingFactors
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");				
		int number = sc.nextInt();
		System.out.println("Factors of "+number+" are :");
		
		if(number>0){
		for(int i = 1 ; i <= number ; i++)
		{
			if(number % i == 0)
				
				System.out.print(i+ " ");
		}
		}
		else{
		    System.out.println("No factor");
		}
		sc.close();													
	}
}