package com.google;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Example {
	
	public static WebDriver driver;

	  @BeforeTest
	  public void beforeTest() {
	  }
	  
	  @Test
	  public void googleTest() {
		  
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			Assert.assertEquals(driver.getTitle(), "Google");

	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }
  


}
