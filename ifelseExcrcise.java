import java.util.Scanner;

public class ifelseExcrcise {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int maths, physics, biology;
		System.out.println("Input Maths Marks: ");
		maths = sc.nextInt();
		System.out.println("Input Phyiscs Marks: ");
		physics = sc.nextInt();
		System.out.println("Input Biology Marks: ");
		biology = sc.nextInt();
		
		double sum=maths+physics+biology;
		System.out.println("Total:" + sum);
		
		
	    double percentage = (maths + physics + biology)/ 300.0 * 100;
		System.out.println("Percentage:" + percentage);
		
		
		if (percentage >=90)
		{
			System.out.println("Grade -A");
		}
			
		
		else if(percentage>=80 && percentage<90)
		{
				
				System.out.println("Grade-B");
		}
		
		
		else if(percentage>=70 && percentage<80)
		{
		
		 System.out.println("Grade-C");
		}
		
	
		else
		{
			
			System.out.println("Grade-D");
		}
	
				
		
		
		
		
			}

}
