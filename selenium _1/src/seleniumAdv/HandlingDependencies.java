package seleniumAdv;

import org.testng.annotations.Test;

public class HandlingDependencies {

	
	
	@Test(dependsOnMethods={"getgoodscore"})
	public void getjob(){
		System.out.println("i will get a job soon");
	}
	
	
	@Test(dependsOnMethods={"puthardwork"})
	public void getgoodscore(){
		System.out.println("i will get good marks");
	}
	
	
	@Test
	public void puthardwork(){
		System.out.println("i should put hardwork towards my work");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
