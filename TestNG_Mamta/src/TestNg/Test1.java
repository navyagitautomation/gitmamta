package TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	

	@AfterSuite
	public void Aftersuite1()
	{
		System.out.println("After suite --I am Last");
	}
	@Parameters({"URL"})
	@Test
	public void test11(String urlname)
	{
		System.out.println(urlname); 
		System.out.println("Test 11");
	}
	
	@BeforeSuite
	public void Beforesuite1()
	{
		System.out.println("Before suite --I am First ");
	}
	
	
	@Test
	public void test12()
	{
		System.out.println("test 12");
	}
	
	@Test
	public void test13()
	{
		System.out.println("test13");
	}
	// @BeforeSuite   @AfterSuite
	//@BeforeClass    @AfterClass
	//@BeforeMethod   @AfterMethod
	//@BeforeTest     @AfterTest 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
