package com.project.operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WriteMessage {
	
	private final By compose= By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3' and @role='button']");
	private final By reciver= By.xpath("//div/textarea[@dir='ltr' and @name='to']");
	private final By subject= By.xpath("//input[@name='subjectbox']");
	private final By body= By.xpath("//div[@class='Am Al editable LW-avf' and @aria-label='Message Body']");
	private final By send= By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3' and @aria-label='Send ‪(Ctrl-Enter)‬']");
	private final String to="aerideepika5@gmail.com";
	private final String subj="Subject for the mail";
	private final String bodyMess="Most test frameworks implement the basic concept of an assertion.";//, a method representing whether or not a logical condition holds after interaction with an AUT. Test frameworks generally declare methods whose names begin with the term assert and end with a term for a logical condition, e.g. assertEquals in JUnit.";
	
	public void composeMail(WebDriver driver)
	 {
		WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.elementToBeClickable(compose));
		 WebElement user=driver.findElement(compose);
		 user.click();
		 WebElement user1=driver.findElement(reciver);
		 user1.sendKeys(to);
		 WebElement user2=driver.findElement(subject);
		 user2.sendKeys(subj);
		 WebElement user3=driver.findElement(body);
		 user3.sendKeys(bodyMess);
		 WebElement user4=driver.findElement(send);
		 user4.click();
	 }

}
