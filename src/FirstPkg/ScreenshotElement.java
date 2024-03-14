package FirstPkg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;							//12/02/2024
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotElement {		// to take screenshot of a particular element
ChromeDriver driver;
String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception
	{
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	File src1=dayelement.getScreenshotAs(OutputType.FILE);	
	FileHandler.copy(src1,new File("./Screenshot1//Elementscrnsht1.png"));
	
	
	}
}
