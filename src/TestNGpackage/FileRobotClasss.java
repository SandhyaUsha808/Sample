package TestNGpackage;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class FileRobotClasss {

ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}
	
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");	
	}
	
	
	@Test
	public void test1() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		fileUpload("C:\\Users\\HP\\Desktop\\luminar\\Rishiherbalsss.pdf");
}
	

	public void fileUpload(String p) throws AWTException {
		// to copy path to clipboard
		StringSelection str=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, str);
	
	//to paste into system window
	Robot rob=new Robot();
	rob.delay(5000);
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_V);
	rob.keyRelease(KeyEvent.VK_V);
	rob.keyPress(KeyEvent.VK_ENTER);
	}
}