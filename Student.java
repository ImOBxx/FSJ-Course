import java.util.Scanner;

public class Student {
	
//instance variables
	int h,e,m,t;
	double per;
	public Student(String name, String team, String nation) {
		// TODO Auto-generated constructor stub
	}

	//member methods
	void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input The Marks Of Hindi: ");
		h = in.nextInt();
		System.out.println("Input The Marks Of English: ");
		e = in.nextInt();
		System.out.println("Input The Marks Of Maths: ");
		m = in.nextInt();
		
		
	}
	
	void calc()
	{
		t = h + e + m;
		per = (t / 300.0) * 100;
		
	}
	void display()
	{
		System.out.println("Your Percentage: " + per + "%");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.input();
		obj.calc();
		obj.display();
} 
}
