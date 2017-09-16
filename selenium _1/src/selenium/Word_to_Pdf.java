package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Word_to_Pdf {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/DEVIBALA/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		
        driver.findElement(By.name("q")).sendKeys("word to pdf convertor");
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.findElement(By.xpath("//*[@id='rso']/div/div/div[2]/div/div/h3/a")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div/div/div/div[4]/div/div/label/div[2]/div[1]/div/div[1]/p[1]")).click();
		Thread.sleep(2000);
		
		String filelocation="D:\\New folder\\my wish.docx";
		StringSelection string =new StringSelection(filelocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string,null);
		
		Thread.sleep(2000);
		Robot robot1= new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(10000);
		driver.findElement(By.className("db-active-area")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div/div/div/div[4]/div/div/div[1]/div[2]/div/a[1]/div[1]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.className("db-active-area")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
