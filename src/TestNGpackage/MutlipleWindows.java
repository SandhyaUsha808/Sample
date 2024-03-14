package TestNGpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MutlipleWindows {
	
ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
	String parentWindow=driver.getWindowHandle();
	System.out.println("parent window title" +driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
	
	
	
	Set<String> allwindowhandles=driver.getWindowHandles();
	for(String v:allwindowhandles)
	{
		System.out.println(v);
	
	if(!v.equalsIgnoreCase(parentWindow))
	{
		driver.switchTo().window(v);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("sandhya@gmail.com");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input"));
		driver.close();
		}
	driver.switchTo().window(parentWindow);
	}
	}
}
