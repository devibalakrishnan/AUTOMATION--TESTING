package seleniumAdv;

import org.testng.annotations.Test;

public class TestGroup {

	@Test(groups={"carrot"})
	public void carrot()
	{
		System.out.println("i love to eat raw carrot");
	}
	
	@Test(groups={"carrot"})
	public void carrot1()
	{
		System.out.println("i hate to eat carrot gravy");
	}
	
	@Test(groups={"brinjal"})
	public void brinjal()
	{
		System.out.println("i love to eat brinjal gravy ");
	}
	@Test(groups={"brinjal"})
	public void brinjal1()
	{
		System.out.println("i hate to eat raw brinjal ");
	}
	
	@Test(groups={"ladysfinger"})
	public void ladysfinger()
	{
		System.out.println("i love to eat ladysfinger gravy ");
	}

	@Test(groups={"ladysfinger"})
	public void ladysfinger1()
	{
		System.out.println("i hate to eat raw ladysfinger ");
	}
	
	
	
}
