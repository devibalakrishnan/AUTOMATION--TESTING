package selenium;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://DEVIBALA//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.manage().window().maximize();
		


		//clicking the alertbutton
		WebElement alertButton=driver.findElement(By.xpath("/html/body/p[1]/table/tbody/tr/td[1]/form/input"));
		alertButton.click();

		//switch to alert and accept it
		/*org.openqa.selenium.Alert alert=driver.switchTo().alert();
		alert.accept();
		 */
		//clicking confirm button
		/*WebElement confirmbutton=driver.findElement(By.xpath("/html/body/p[1]/table/tbody/tr/td[1]/form/input"));
		//Thread.sleep(2000);
		confirmbutton.click();*/

		//switch to confirm and accept
		/*org.openqa.selenium.Alert con_alert=driver.switchTo().alert();
		//Thread.sleep(2000);
		con_alert.accept();
		con_alert.accept();*/

		//clicking prompt button
		/*WebElement promptbutton=driver.findElement(By.xpath("/html/body/p[1]/table/tbody/tr/td[1]/form/input"));
		Thread.sleep(2000);
		promptbutton.click();*/
		
		//clicking prompt
		WebElement prompt=driver.findElement(By.xpath("//*[@id='contentcolumn']/div[7]/table/tbody/tr/td[2]/form/input"));
		Thread.sleep(2000);
		prompt.click();

		//switch to prompt and sendkeys
		Alert pro_alert=driver.switchTo().alert();
		pro_alert.sendKeys("dev");
		pro_alert.accept();
		String text=pro_alert.getText();
		
		System.out.println(text);
		pro_alert.accept(); 


		
		//Arul's code remove this if needed
		/*
		WebElement prompt=driver.findElement(By.name("B4"));
		prompt.click();
		
		Thread.sleep(2000);
		Alert prompt_alert=driver.switchTo().alert();
		prompt_alert.sendKeys("Agni");
		prompt_alert.accept();

		System.out.println(prompt_alert.getText());
		
		//driver.switchTo().alert().sendKeys("Agni");
		*/

	}

}
