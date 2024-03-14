package FirstPkg;
//------------------Structure of JUnit pgm-------------------

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitPgm1 {

	@Before
	public void browseropen()
	{
		System.out.println("URL load");
	}
	@Test
	public void test()
	{
		System.out.println("test activity");	
	}
	@After
	public void browserclose()
	{
		System.out.println("browserclose");	
	}
	
}
