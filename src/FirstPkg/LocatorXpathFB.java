package FirstPkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathFB {
ChromeDriver driver;
	
	@Before
	public void setp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("abc");
	//diver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcdef");
		driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
	