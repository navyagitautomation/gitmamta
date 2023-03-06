package TestNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	
	@Parameters({"URL"})
	@Test
	public void test31(String url)
	{
		System.out.println("Test31 == "+url);
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Beforetest  ");
	}
	
}
