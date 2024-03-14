package TestNGpackage;
import org.testng.annotations.Test;

//import java.io.File;
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Assignment {
ChromeDriver driver;
String url="https://rishiherbalindia.linker.store/";

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
		
/*	
	@Test
	public void test1() throws Exception  
	{
		Thread.sleep(30000);
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("sandhya.usha775770@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Sandhya20");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
		
		
		//driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[1]/button/span")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));				//explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")));
driver.navigate().back();    */
//}
	@Test
	public void test2() 					//login'
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Thread.sleep(18000);
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));				//explicit wait
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")));
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")).click();
		driver.findElement(By.id("register-model-signin-link"));
		//driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("sandhya.usha775770@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Sandhya20");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
		//Thread.sleep(20000);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal Agro Growth Booster",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/h4/a")).click();
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/h4/a")).click();
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
	}

		/*@Test
		public void screenshot() throws Exception
		{
		WebElement Privacy=driver.findElement(By.xpath("//*[@id=\"footer-link-list\"]/li[1]/a"));
		File src2=Privacy.getScreenshotAs(OutputType.FILE);	
		FileHandler.copy(src2,new File("./ScreenshotPP//privacypolicy.png")); 
		}
		
		@Test
		public void response() throws IOException
		{
		 URL obj=new URL(url);	
		HttpURLConnection con=(HttpURLConnection)obj.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("--------VALID LINK----------"+url);
		}
		else
		{
			System.out.println("------INVALID LINK------"+url);
		} */
		}


