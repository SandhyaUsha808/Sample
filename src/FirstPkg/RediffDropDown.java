package FirstPkg;
																		//09/02/2024
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffDropDown {
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
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select obj1=new Select(day);
		obj1.selectByValue("20");
		
		
		List<WebElement> li = obj1.getOptions();
		System.out.println("Count of days : "+li.size());	
		
		/*for(WebElement s:li)		// to print the elements in the drop down
		{
			System.out.println(s.getText());
		}*/
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
        Select obj2=new Select(month);
		obj2.selectByVisibleText("JUN");
		
		List<WebElement> li2 = obj2.getOptions();            // to print the count of months
		System.out.println("Count of months : "+li2.size());
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select obj3=new Select(year);
		obj3.selectByIndex(28);

		List<WebElement> li3 = obj3.getOptions();
		System.out.println("Count of years : "+li3.size());
}
}