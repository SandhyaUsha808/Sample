package FirstPkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPgm2 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		 driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/luminar/alert.html");
	}
	
	@Test
	public void buttonverify()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert A=driver.switchTo().alert();
		String B=A.getText();
if(B.equals("Hello, I am an alert box"))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}	
A.accept();
driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Sandhya");
driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Soman");
	}
}
