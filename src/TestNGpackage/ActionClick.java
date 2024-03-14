package TestNGpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionClick {
ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		Actions act1=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act1.contextClick(right).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]ul/li[1]/span")).click();
		Alert a=driver.switchTo().alert();
		 System.out.println(a.getText());
		 a.accept();
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act1.doubleClick(doubleclick).perform();
		Alert b=driver.switchTo().alert();
		 System.out.println(b.getText());
		 b.accept();	
	
}
}
//