package FirstPkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown
{
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void  dropdown()
	{
		WebElement drpdwn=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select select=new Select(drpdwn);
		
		select.selectByValue("20");
		
		WebElement drpdwn1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
        Select selectmonth=new Select(drpdwn1);
		
		selectmonth.selectByVisibleText("JUN");
		
		WebElement drpdwn2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select selectyear=new Select(drpdwn2);
				
		selectyear.selectByIndex(28);
	}
	}

