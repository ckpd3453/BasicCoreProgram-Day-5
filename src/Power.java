import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the n'th no: ");
        int n = scanner.nextInt();
		int p=1;
		for(int a=1; a <= n; a++)
		{
			p=(p*2);
					
		}
		System.out.println("2 to the power of " + n + "= " + p);
	}

}
