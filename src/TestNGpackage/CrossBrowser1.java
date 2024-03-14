package TestNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser1 {
WebDriver driver;
@Parameters("browser")
@BeforeTest
public void setup(String b)
{
	if(b.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
		}
	
	else if(b.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		}
	
	else if(b.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
		}
}

@Test
public void fb()
{
	driver.get("https://www.facebook.com");
}
}
