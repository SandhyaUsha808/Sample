package FirstPkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class PgSource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
			{
			System.out.println("pass");
			}
		else
			{
			System.out.println("fail");
			}
	}

}
