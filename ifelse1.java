import java.util.Scanner;

public class ifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner in = new Scanner(System.in);
		System.out.println("Input Age: ");
		age = in.nextInt();
		if (age >= 18)
		{
			System.out.println("The candidate is allowed to vote!");
		}
		else {
			System.out.println("The candidate is not allowed to vote, sorry. ");
			
		}
		

	}

}
