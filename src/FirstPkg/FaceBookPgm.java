package FirstPkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookPgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");			//  go to the facebook page
		
		String actualtitle=driver.getTitle();			// to check whether a title is present
		//System.out.println(actualtitle);
 
		//--to check whether actual title and expected title are the same
		/*String expectedtitle="Facebook 123";
		if(actualtitle.equals(expectedtitle))
				{
			System.out.println("pass");
				}
		else
		{
			System.out.println("fail");
		}*/
		
		//------page source
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
