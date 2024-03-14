package TestNGpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGpgm {

	
	@BeforeTest
	public void setup()
	{
		System.out.println("browser open");

	}
	@BeforeMethod()
		public void urlopen()
		{
			System.out.println("URL open");

		}
@Test(priority=3)
public void test1()
{
	System.out.println("first test");
	}

@Test(priority=2,invocationCount=2,dependsOnMethods= {"test1"})
public void test2()
{
	System.out.println("second test");
	}

@Test(priority=1)

public void test3()
{
	System.out.println("third test");
	}
@AfterMethod
public void browserclose()
{
	System.out.println("browserclose");
	}
}