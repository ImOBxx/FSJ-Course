import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int P, R, T;
       Scanner p = new Scanner(System.in);
       System.out.println("Input Principal: ");
       P = p.nextInt();
       System.out.println("Input Rate Of Interest: ");
       R = p.nextInt();
       System.out.println("Input Time: ");
       T = p.nextInt();
       int SI = P * R * T / 100;
       System.out.println(SI);
       
    		  
		
		

	}

}
