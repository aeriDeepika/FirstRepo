package com.project.operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SignOut {

	private final By logout= By.xpath("//a/span[@class='gb_9a gbii' or @class='Kj-JD-Jh a7F']");
	private final By confirm= By.xpath("//div/a[contains(text(),'Sign out')]");
	
	public void logOut(WebDriver driver)
	 {
//		driver.manage().wait(10000);
		 WebElement user=driver.findElement(logout);
		 user.click();
		 
		 WebElement user1=driver.findElement(confirm);
		 user1.click();
	 }
}
