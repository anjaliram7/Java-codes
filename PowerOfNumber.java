
import java.util.Scanner;
public class PowerOfNumber
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of base");
		int base=sc.nextInt();
		System.out.println("Enter the value of exponent");
		int exp=sc.nextInt();
		
		int result=1;
		while(exp != 0)
		{
		    result= result*base;
		    --exp;
		}
		System.out.println("Answer is " + result);
		sc.close();
		
		
	}
}
