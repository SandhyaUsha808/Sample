package TestNGpackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker
{
	WebDriver driver;
	@BeforeTest
	public void open() 
	{
		driver=new ChromeDriver();
		String url="https://www.trivago.com/";
		driver.get(url);
		driver.manage().window().maximize();		
		
	}
	@Test
	public void testing()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]")).click();
		while(true)
		{
			WebElement Month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
			String text=Month.getText();
			if(text.equalsIgnoreCase("March 2024"))
			{
				System.out.println(text);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
			}
			
			
		}
		List<WebElement> dates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		for(WebElement all:dates)
		{
			String day=all.getText();
			System.out.println(day);
			if(day.equals("18"))
			{
				System.out.println(day);
				all.click();
				System.out.println("date is selected");
				break;
			}
			
		}
	}
}