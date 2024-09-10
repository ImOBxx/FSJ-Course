import java.util.Scanner;

public class factoial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		int f = 1;
		int i;
		System.out.println("Enter a number to generate a factorial: ");
		n = in.nextInt();
		for (i = n; i >= 1; i--)
		{
			f = f * i;
		}

	}

}
