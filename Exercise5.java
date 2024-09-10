import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Input A: ");
		a = sc.nextInt();
		System.out.println("Input B: ");
		b = sc.nextInt();
		System.out.println("Input C: ");
		c = sc.nextInt();
		if (a > b && a > c)
		{
			System.out.println("Greatest Number is A");
		}
		else if (b > c)
		{
			System.out.println("Greatest Number is B");
		}
		else 
		{
			System.out.println("Greatest Number is C");
		}
		
		
			
			
		}
		

	}


