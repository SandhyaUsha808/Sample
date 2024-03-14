package FirstPkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoQA {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		 driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
			}
	
	@Test
	public void buttonverify()
	{
		
		
		/*driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
	    driver.switchTo().alert().accept();
	    
	    /*driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
	    driver.switchTo().alert().accept();
	    */
	    
	    driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Alert A=driver.switchTo().alert();
		String txt=A.getText();
if(txt.equals("Do you confirm action?"))
{
	System.out.println("pass");
	A.accept();
	}
else
{
	System.out.println("fail");
	A.accept();
}	


//driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
//driver.switchTo().alert().accept();
}
}
