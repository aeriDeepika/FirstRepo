package com.project.operations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	
	 private final By userName= By.id("identifierId");
	 private final By password= By.xpath("//input[@class='whsOnd zHQkBf' and @type='password']");
	 private final By next= By.xpath("//span[contains(text(),'Next')]");
	 private final String user_name="aerideepika5@gmail.com";
	 private final String passWord="123!@#abc";
	 
	
	 public void enterUserName(WebDriver driver)
	 {
		 WebElement user=driver.findElement(userName);
		 user.sendKeys(user_name);
	 }
	 
	 public void enterPassword(WebDriver driver)
	 {
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 WebElement user=driver.findElement(password);
		 user.sendKeys(passWord);
	 }
	 
	 public void clickNext(WebDriver driver)
	 {
		 WebElement user=driver.findElement(next);
		 user.click();
	 }

	 
}
