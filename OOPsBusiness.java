
class BusinessExec
{
	String name;
	
	BusinessExec(String name)
	{
		this.name = name;
	}
	
	public void skills()
	{
		System.out.println(name + "has skills ");
	}
	
	
	
	
}

interface MarketingExp
{
	
}

interface FinanceExp
{
	
}

class MarketingFinanceExp extends BusinessExec implements MarketingExp, FinanceExp
{

	MarketingFinanceExp(String name) {
		super(name);
		
	}
	
}

public class OOPsBusiness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MarketingFinanceExp obj = new  MarketingFinanceExp("Alex");
		

	}

}
