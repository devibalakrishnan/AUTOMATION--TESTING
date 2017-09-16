package selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/DEVIBALA/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://employment.delhigovt.nic.in/dee/f_registration.asp");
		driver.manage().window().maximize();					
		WebElement dropdown=driver.findElement(By.name("c_fname"));
        dropdown.sendKeys("DEVI");
		//Thread.sleep(2000);
		
        WebElement dropdown1=driver.findElement(By.name("c_mname"));
        dropdown1.sendKeys("BALA");
        WebElement dropdown2=driver.findElement(By.name("c_lname"));
        dropdown2.sendKeys("KRISHNAN");
        WebElement dropdown3=driver.findElement(By.name("c_fhname"));
        dropdown3.sendKeys("BALAKRISHNAN");
        WebElement dropdown4=driver.findElement(By.name("c_mhname"));
        dropdown4.sendKeys("RAJATHI");
      /*  WebElement dropdown5=driver.findElement(By.xpath("//*[@id='cand']/form/table/tbody/tr[1]/td/fieldset/table/tbody/tr[3]/td[2]/a/img"));
		dropdown5.click();
		Alert pro_alert=driver.switchTo().alert();
		 WebElement dropdown6=driver.findElement(By.name("MonthSelector"));
		 Select selectm=new Select(dropdown);
		 selectm.selectByVisibleText("july");*/
		/**/
		
		
		
		
		
		WebElement searchBox=driver.findElement(By.xpath("//*[@id='cand']/form/table/tbody/tr[1]/td/fieldset/table/tbody/tr[3]/td[2]/a"));
		searchBox.click();
		
		
		   WebElement dropdown7=driver.findElement(By.xpath("//*[@id='cand']/form/table/tbody/tr[1]/td/fieldset/table/tbody/tr[4]/td[2]/select"));
	          dropdown7.click();
	          Select selectm2=new Select(dropdown7);
	  		selectm2.selectByValue("1");
		
	  		
	  		 WebElement dropdown8=driver.findElement(By.xpath("//*[@id='cand']/form/table/tbody/tr[1]/td/fieldset/table/tbody/tr[5]/td[2]/select"));
	          dropdown8.click();
	          Select selectm3=new Select(dropdown8);
	  		selectm3.selectByVisibleText("OBC");
	  		
	  		 WebElement dropdown9=driver.findElement(By.xpath("//*[@id='cand']/form/table/tbody/tr[1]/td/fieldset/table/tbody/tr[3]/td[3]/select"));
	          dropdown9.click();
	          Select selectm4=new Select(dropdown9);
	  		selectm4.selectByVisibleText("Female");
	  		
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		          
		         
		          WebElement dropdowna=driver.findElement(By.name("MonthSelector"));
		          dropdowna.click();
		          Select selectm1=new Select(dropdowna);
		  		selectm1.selectByVisibleText("July");
		         
		  		 WebElement dropdownb=driver.findElement(By.name("YearSelector"));
		          dropdownb.click();
		          Select selectm22=new Select(dropdownb);
		  		selectm22.selectByVisibleText("1997");
		  		
		  		WebElement dropdownc=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[1]/font/a"));
		          dropdownc.click();
		          
	
		  		
		  		
//		          WebElement cal=driver.findElement(By.name("MonthSelector"));
//		  		cal.click();
		          
		  		/*WebElement year=driver.findElement(By.name("YearSelector"));
		  		year.click();
		  
		  		WebElement date=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[4]/font/a"));
		  		date.click();
		  		*/
		        
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
		
		
		
		
	          
		
		
		
		
		
		
		

	}

}
