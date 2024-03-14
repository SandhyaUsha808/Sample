package FirstPkg;

import org.junit.Before;

public class LocatorPgm1 {
	ChromeDriver driver;
	
	@Before
	public void setp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();
	}
	
	
	

}
