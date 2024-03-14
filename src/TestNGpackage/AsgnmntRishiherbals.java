package TestNGpackage;
//import java.io.File;
//import java.net.HttpURLConnection;
//import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys; 
//import org.openqa.selenium.OutputType; 
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.io.FileHandler; 
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AsgnmntRishiherbals 

{
ChromeDriver driver;
@BeforeTest
public void set()
{
 ChromeOptions obj=new ChromeOptions();
	obj.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(obj);
driver.get("https://rishiherbalindia.linker.store/"); 
driver.manage().window().maximize();
}

@Test
public void test() throws Exception
{
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"top- links\"]/ul/li[1]/a/span")).click();
	Thread.sleep(7000);
driver.findElement(By.xpath("//*[@id=\"top- links\"]/ul/li[1]/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay- v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("sndya@gmail.com");
driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay- v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Sandya20");
driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay- v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
Thread.sleep(8000);
driver.findElement(By.xpath("//button[@class='btn btn-primaryv2']")).click();
Thread.sleep(10000);
 
driver.findElement(By.xpath("//*[@id=\"cont-login-with- email\"]/form/div[1]/input"));
driver.findElement(By.xpath("//*[@id=\"cont-login-with- email\"]/form/div[2]/input")).sendKeys("Sandya20");
Thread.sleep(12000);
driver.findElement(By.xpath("//*[@id=\"cont-login-with- email\"]/form/button[1]")).click();
Thread.sleep(17000); 
driver.findElement(By.name("query")).sendKeys("Herbal Agro Growth Booster",Keys.ENTER);
Thread.sleep(18000); 
driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/h4/a")).click();
 
driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();

driver.navigate().back(); 
driver.navigate().back();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
 

driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/h4/a")).click();
 
driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();

driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click(); driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click(); driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click(); 
Thread.sleep(2000);
//JavascriptExecutor objj=(JavascriptExecutor)driver; objj.executeScript("window.scrollBy(0,2400)","");
 

driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[ 2]/a")).click();
}
/*
@Test
public void screencapture() throws Exception
{
	WebElement Privacy1=driver.findElement(By.xpath("//*[@id=\"footer-link-list\"]/li[1]/a"));
	File src2=Privacy1.getScreenshotAs(OutputType.FILE);	
	FileHandler.copy(src2,new File("./ScreenshotRH//privacypolicy.png")); 
}
@Test
public void response() throws Exception
{
String data="https://rishiherbalindia.linker.store/"; driver.get(data);
URL ob=new URL(data);
 
HttpURLConnection Con=(HttpURLConnection)ob.openConnection();
Con.connect();
if(Con.getResponseCode()==200)
{
 
	System.out.println("Valid link");
}
else
{

System.out.println("Invalid link");
}
}*/
}


