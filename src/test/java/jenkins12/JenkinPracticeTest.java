package jenkins12;

import org.testng.annotations.Test;

public class JenkinPracticeTest {

	
	@Test(groups = "smoke")
	public void sachinTest()
	{
		System.out.println("sachinZenkinTestsmoke1");
	}
	@Test
	public void sachinTest1()
	{
		System.out.println("sachinZenkinTest");
	}
	
	@Test(groups = "smoke")
	public void sachinTest2()
	{
		System.out.println("sachinZenkinTestsmoke2");
	}
}
