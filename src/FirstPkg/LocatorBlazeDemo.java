package FirstPkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBlazeDemo {
ChromeDriver driver;
	
	@Before
	public void setp()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("name")).sendKeys("abc123",Keys.ENTER);
		driver.findElement(By.name("company")).sendKeys("sand",Keys.ENTER);
		driver.findElement(By.name("email")).sendKeys("abc",Keys.ENTER);
		driver.findElement(By.id("password")).sendKeys("abcdef",Keys.ENTER);
		driver.findElement(By.name("password_confirmation")).sendKeys("abcdef",Keys.ENTER);
		//driver.findElement(By.className("btn btn-primary")).click();
}
}