package FirstPkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before; //response code
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPgm1 {
ChromeDriver driver;
String baseurl="https://www.google.com";

@Before
public void set()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}

@Test
public void linkaccount() throws Exception
{
URL ob=new URL(baseurl);	
HttpURLConnection con=(HttpURLConnection)ob.openConnection();
con.connect();
if(con.getResponseCode()==200)
{
	System.out.println("valid---"+baseurl);
}
else
{
	System.out.println("invalid---"+baseurl);
}
}
}
