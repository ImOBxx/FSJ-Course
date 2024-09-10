
interface ComputerScienceCourse
{
	void CS();
}

interface BusinessManagementCourse
{
	void BM();
}

class MultiDisciplinaryCourse implements ComputerScienceCourse, BusinessManagementCourse
{
	@Override 
	public void CS()
	{
		System.out.println("Course Content: C++.");
		System.out.println("Course Content: Java.");
	}
	
	@Override 
	public void BM()
	{
		System.out.println("Course Content: Sales.");
		System.out.println("Course Content: Enterpreneurship.");
	}
	
	void MD()
	{
		System.out.println("Course Content: Software Sales.");
		System.out.println("Course Content: Software Marketing.");
	}
	}



public class OOPsCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiDisciplinaryCourse obj = new MultiDisciplinaryCourse();
		obj.CS();
		obj.BM();
		obj.MD();
		

	}

}
