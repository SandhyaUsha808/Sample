package FirstPkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
	}
	
	@Test
	public void  fbdropdown()
	{
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select D=new Select(day);
		D.selectByValue("20");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
        Select M=new Select(month);
		M.selectByVisibleText("Jun");
		
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select Y=new Select(year);
		Y.selectByIndex(28);

	}
}
