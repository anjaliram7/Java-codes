import java.util.Scanner;
public class CheckPositiveNegative
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int num;
	    System.out.println("Enter an integer number");
	    num=sc.nextInt();
	    
	    if (num>=0){
	        if(num==0){
	            System.out.println("The number is zero");
	        }
	        else{
	            System.out.println("The number is positive");
	        }
	    }
	    else{
	        System.out.println("The number is negative");
	    }

	}
}
