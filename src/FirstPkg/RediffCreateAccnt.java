package FirstPkg;
											//8/2/2024
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffCreateAccnt {
ChromeDriver driver;
	
	@Before
	public void setp()
	{
		driver=new ChromeDriver();
}

	@Test
	public void  buttontextverify()
	{		//to check  text present in the button
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		String buttontext=button.getAttribute("value");
		if(buttontext.equals("Create my account >>"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}