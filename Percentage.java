import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M, H, P;
		Scanner in = new Scanner(System.in);
		System.out.println("Input Marks of Mathematics: ");
		M = in.nextInt();
		System.out.println("Input Marks of Physics: ");
		P = in.nextInt();
		System.out.println("Input Marks of Hindi");
		H = in.nextInt();
		double average = ( M + H + P )/ 300 * 100;
		System.out.println(average);
		
	    
	    
	    
		

	}

}
