package FirstPkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
	//	System.out.println(actualtitle);
		
		//----to check if the actual title and expected title are the same
		
		String expectedtitle="Google 123";
		if(actualtitle.equals(expectedtitle))
				{
			System.out.println("pass");
				}
		else
		{
			System.out.println("fail");
		}
}
}
