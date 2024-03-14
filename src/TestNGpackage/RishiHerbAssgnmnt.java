package TestNGpackage;


//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RishiHerbAssgnmnt {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
	 ChromeOptions obj=new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(obj);
	driver.get("https://rishiherbalindia.linker.store/"); 
	//driver.manage().window().maximize();
	}

	@Test
	public void test1() throws Exception 
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		Thread.sleep(2000);//my accnt
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();		//registr
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("nimaa@gmail.com");	//email
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Sandhya20");		//paswrd
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();	//checkbox
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();		//submit
		Thread.sleep(5000);
	}
		//driver.navigate().back();
		//Thread.sleep(60000);
		//driver.navigate().back();
	@Test
	public void test2()  
	{
		WebElement sb=driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[1]/div[2]/div/ul/li[1]/a/span"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",sb);
				driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[1]/div[2]/div/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")).click();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));				//explicit wait
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[2]/form/p/a")));
		//driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/p/a")).click();	
		//driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();		//login
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("nimaa@gmail.com");	//email
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Sandhya20");	
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
	}
}
	

