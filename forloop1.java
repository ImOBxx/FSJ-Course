import java.util.Scanner;

public class forloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		int i;
		int p;
		System.out.println("Give the number for the corresponding table: ");
	    n = in.nextInt();
	    
	    
	    for (i = 1; i <= 10; i++)
	    {
	    	p=n*i;
	    	
	    	System.out.println(n + " * " + i + " = " + p);
	    }
	    
		

	}

}
