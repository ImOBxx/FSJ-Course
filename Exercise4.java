import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double bp, hra, ta, da,sum;
	    System.out.println("Input Basic Pay: ");
	    bp = sc.nextInt();
	    
	    if (bp <= 30000) {
	    ta = (10 / 100.0) * bp;
	    hra = (20 / 100.0) * bp;
	    da = (30 / 100.0) * bp;
	    sum = (da + hra + ta + bp);
	 	    }
	    else if (bp >= 30000 && bp <= 50000) {
	    	ta = (15 / 100.0) * bp;
		    hra = (25 / 100.0) * bp;
		    da = (50 / 100.0) * bp;
		    sum = (da + hra + ta + bp);
		    
	    }
	    else if (bp >= 50000 && bp <= 100000) {
	    	ta = (25 / 100.0) * bp;
		    hra = (50 / 100.0) * bp;
		    da = (80 / 100.0) * bp;
		    sum = (da + hra + ta + bp);
		    
	    }
	    else {
	    	ta = (30 / 100.0) * bp;
		    hra = (55 / 100.0) * bp;
		    da = (90 / 100.0) * bp;
		    sum = (da + hra + ta + bp);
		    
	    }
		    
	    	
		    
	    System.out.println("Your CTC is: " + sum);
	    

	    	
	    }
	    
	    

	}


