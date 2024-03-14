package FirstPkg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
		//to take screenshot of a full page
public class Scrnshot {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception
	{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
	FileHandler.copy(src,new File("D://scrnsht1.png"));
	}
}
