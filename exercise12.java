import java.util.Scanner;

public class exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1;
int n;
int p;

Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
n=sc.nextInt();
while(i<=10)
{
	p=n*i;
	System.out.println(n + " * " + i + "=" + p);
	i++;
}


	}

}
