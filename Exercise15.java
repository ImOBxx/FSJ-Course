import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int p;
		int i=1;
		System.out.println("Enter Number");
		a=in.nextInt();
		do
		{
			p=a*i;
			System.out.println(p);
			i++;
			
						
		}
		
		while(i<=10);
		
	}

}
