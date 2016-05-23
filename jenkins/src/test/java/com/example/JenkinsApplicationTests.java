package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JenkinsApplication.class)
@WebAppConfiguration
public class JenkinsApplicationTests {
	
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void getIndex() {
		//driver.manage().window().maximize();
		driver.get("http://localhost:8088/");
		Assert.assertEquals("", driver.findElement(By.id("nome")).getText());
		Assert.assertEquals("", driver.findElement(By.id("email")).getText());
		
	}
	
	

}
