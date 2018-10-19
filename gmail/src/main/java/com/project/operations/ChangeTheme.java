package com.project.operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangeTheme {

	static By click1=By.xpath("//*[contains(@aria-label,'Settings')]");
	static By clickLink1= By.xpath("//*[contains(text(),'Themes')]");
	static By clickLink2= By.xpath("//div[@bgid='custom-3']");
	static By clickLink3= By.xpath("//div[contains(text(),'Save')]");
	
	public static void theme(WebDriver driver)
	 {
		WebElement user0=driver.findElement(click1);
		 user0.click();
		 WebElement user=driver.findElement(clickLink1);
		 user.click();
		 WebElement user1=driver.findElement(clickLink2);
		 user1.click();
		 WebElement user2=driver.findElement(clickLink3);
		 user2.click();
	
	 }
}
