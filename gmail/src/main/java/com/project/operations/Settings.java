package com.project.operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Settings {
	
	static By setting= By.xpath("//div[@aria-label='Settings' and @data-tooltip='Settings']");
	
	public static void settings(WebDriver driver)
	 {

		 WebElement user=driver.findElement(setting);
		 user.click();
			
	 }
}
