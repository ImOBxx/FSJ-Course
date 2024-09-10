import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int n = 1;
	   int i;
	   int p;
	   Scanner in = new Scanner(System.in);
	   i = in.nextInt();
	   do 
	   { 
		   p = i * n;
		 System.out.println(i + " * " + n + " = " + p);
		 i++;
	   }
        while (n <= 10);
	   
	}

}
