import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int n;
		int p;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		n = in.nextInt();
		while (i <= 10)
		{
			p = n * i;
			System.out.println(n + " * " + i + " = " + p);
			i++;
			
		}

	}

}
