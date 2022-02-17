import java.util.Scanner;

public class Factors 
{
	//main class
	public static void main(String[] args) 
	{
		int number;
		//user input number
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ::");
		number = scanner.nextInt();
		
		//To find the factor of the given no.
		for (int i = 2; i < number; i++) 
		{
			if (number % i == 0) 
			{
				//To find the prime factor
				for (int j = 2; j <= i; j++) 
				{
					if ((i % j) == 0) 
					{
						if (j == i) 
						{
							//result
							System.out.println("Prime Factor of " + number + " = " + j);
						}
						else 
						{
							break;
						}
					}
				}
			}
		}
	}

}
