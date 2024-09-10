import java.util.Scanner;

public class Arrya5 {

	
		// TODO Auto-generated method stub
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner in = new Scanner (System.in);
				int i;
				int sum = 0;
				
				int a[] = {1,2,3,4,5,78};
				
				int l=a.length;
				
				System.out.println("length"+ l);
				l--;
				System.out.println("length"+ l);
				
				for (i = 0; i <= l; i++)
				{
					System.out.println("Number: " + a[i]) ;
					sum = sum + a[i];
					
				}
				System.out.println(sum);

			}

		

	}


