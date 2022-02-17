import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
			//user input value
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter Year:");
         	int year =scanner.nextInt();
         	
         	//Checking for leap year
         	       if ((year % 4 == 0) && (year % 100!= 0) || (year %400 == 0))
         	       {
   	                    System.out.println("Year is a leap year");
         	       }
   	               else
   	               {
   	                   System.out.println("Year is not a leap year");
   	               }
	}

}
