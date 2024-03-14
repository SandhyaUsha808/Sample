package TestNGpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGparameter {
@Parameters("a")
@Test
public void method1(String v)
{
	System.out.println("values is:"+v);
}
}
