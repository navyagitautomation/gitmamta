package TestNg;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	
	@Parameters({"URL"})
	@Test
	public void test22(String url)
	{
		System.out.println("test 22    URL=="+url);
	}
	
	@Test
	public void test23()
	{
		System.out.println("test23");
	}
	
	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("Before method --I am First  method in Test2 ");
	}
	
}
