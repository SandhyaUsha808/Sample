package FirstPkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffSelect {
	ChromeDriver driver;
	
	@Before
	public void setp()
	{
	 driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		boolean Chckbx=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		//boolean Chckbx=checkbox.isSelected();
		if(Chckbx)
		{
		System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
			}	
	}
}
