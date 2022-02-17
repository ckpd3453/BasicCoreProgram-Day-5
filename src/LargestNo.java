import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		int a, b, c, largest, temp;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number:");
		a = scanner.nextInt();
		System.out.println("Enter the second number:");
		b = scanner.nextInt();
		System.out.println("Enter the third number:");
		c = scanner.nextInt();

		// comparing a and b
		temp = a > b ? a : b;

		// comparing the temp and c
		largest = c > temp ? c : temp;

		System.out.println("The largest number is: " + largest);
	}

}
