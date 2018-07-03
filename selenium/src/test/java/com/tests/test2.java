package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 {
	@Test//to test or perform testing
	public void testGitHubLogin()
	{
		//for downloading exe file of a browser, since browsers are not developed by seleniumhq//
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b7c.06.13\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//create new object and open browser//
		driver.manage().window().maximize();// to maximize the browser
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("karthikmkulkarni22");
		driver.findElement(By.name("commit")).click();
		
		String title = driver.getTitle();//to check the the title of the page for validations
		Assert.assertEquals(title, "GitHub");//for validations, if it is false or expected !=actual, testing shouldnt continue or should throw an error
		System.out.println("continue with testing....");
	}

}
