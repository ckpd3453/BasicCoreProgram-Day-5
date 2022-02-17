import java.util.Scanner;

public class QuotientRemainder 
{

	public static void main(String[] args) 
	{
		//user input value
		 Scanner scanner = new Scanner(System.in);  
		 System.out.println("Enter the first number:");  
		 int a = scanner.nextInt();
         System.out.println("Enter the first number:");  
         int b = scanner.nextInt();

          //logic
	       int quotient = a / b;
	       int remainder = a % b;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	}

}
