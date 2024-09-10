import java.util.Scanner;

public class Prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		int i;
		int count = 0;
		System.out.println("Enter a number: ");
		n = in.nextInt();
		for (i = 1; i <= n; i++)
		{
			if (n % i == 0)
			{
				
				count++;
			} 
		}
		
		if (count == 2)
		{
			System.out.println("The number is a prime number.");
			
			
		}
		else {
		
		
		System.out.println("This is not a prime number.");
		}
		}
				
		}
		

	


