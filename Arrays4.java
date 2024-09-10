import java.util.Scanner;

public class Arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int i;
		int sum = 0;
		int a[] = new int [5];
		for (i = 0; i <= 4; i++)
		{
			System.out.println("Enter Number: ");
			a[i] = in.nextInt();
		}
		
		for (i = 0; i <= 4; i++)
		{
			System.out.println("Number: " + a[i]) ;
			sum = sum + a[i];
			
		}
		System.out.println(sum);

	}

}
