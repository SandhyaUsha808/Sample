package TestNGpackage;
	import org.testng.annotations.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	public class ActionDragNDrop {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable");
		
	}
	@Test
	public void test()
	{
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act1=new Actions(driver);
		act1.dragAndDrop(source,dest);
		act1.perform();
		
		String text=dest.getText();
		if(text.equals("Dropped"))
		{
			System.out.println("dropped");
		}
		else
		{
			System.out.println("not expected");
		}
}
}