package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MevanParameterTest {

	@Test
	public void mevanTest()
	{
		String s = System.getProperty("browser");
		if(s.equalsIgnoreCase("chrome"))
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		
		}
	}
}
