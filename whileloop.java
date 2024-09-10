import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		
		int n;
		int i=1;
		while (i <= 10)
		
		{
			n = a * i;
			System.out.println(a + " * " + i + " = " + n);
			i++;
			
		}
		
		

	}

}
