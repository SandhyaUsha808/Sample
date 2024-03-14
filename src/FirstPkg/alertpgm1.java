package FirstPkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class alertpgm1 {
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
	    driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("a123");
	}
	}

