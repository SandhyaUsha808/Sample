package FirstPkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JustdialNotifctn {
ChromeDriver driver;
@Before
public void setup()
{
	/* incase , facing any issue with chrome, use the below code:
	ChromeOptions obj=new ChromeOptions();
	obj.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(obj);
	driver.get("https://www.justdial.com/");
}
	*/
	
	
	// to remove notifications from a website
	ChromeOptions obj=new ChromeOptions();
	obj.addArguments("----disable notifications");
	driver=new ChromeDriver(obj);
	
}
@Test
public void tst()
{
	driver.get("https://www.justdial.com/");
}
}
