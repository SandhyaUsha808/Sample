package FirstPkg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;							//12/02/2024
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class ScnshotSample {
	ChromeDriver driver;
	String ur="https://rishiherbalindia.linker.store/";

		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(ur);
			
			//driver.get("https://rishiherbalindia.linker.store/");
			driver.manage().window().maximize();
		}
			
		@Test
		public void test() throws Exception
		{

			WebElement P=driver.findElement(By.xpath("//*[@id=\"footer-link-list\"]/li[1]/a"));
			File src2=P.getScreenshotAs(OutputType.FILE);	
			FileHandler.copy(src2,new File("./Scrnshot2//pr.png")); 
		}
}
