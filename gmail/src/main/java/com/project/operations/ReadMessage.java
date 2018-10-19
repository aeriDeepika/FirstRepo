package com.project.operations;

import java.util.List;

import javax.mail.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadMessage {
	
	private final By read= By.xpath("//*[@class='yW']/span");
	
	public void readMail(WebDriver driver)
	 {
	List<WebElement> a = driver.findElements(read);
    System.out.println(a.size());
    for (int i = 0; i < a.size(); i++) {
        System.out.println(a.get(i).getText());
        if (a.get(i).getText().equals("Important")) 
            {                                           
            a.get(i).click();
        }
    }
}
	
	
    
}