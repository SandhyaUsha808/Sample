package FirstPkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitPgm2 {
ChromeDriver driver;

@Before
public void setp()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}

@Test
public void titleverify()
{
	String title=driver.getTitle();
	System.out.println(title);		// print title
	String exp="Google";
	if(title.equals(exp))			// check actual and expected title are same
	{
		System.out.println("pass");	
	}
	else
	{
		System.out.println("fail");		
	}
	}

@Test
public void content()
{
	String sc=driver.getPageSource();
	System.out.println(sc);	
}

@After
public void browserclose()
{
	driver.quit();
}
}

