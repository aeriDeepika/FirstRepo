package com.project.operations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        driver.navigate().to("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        WebElement element = driver.findElement(By.id("gsri_ok0"));
        action.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//input[contains(@aria-label,\"I'm Feeling Lucky\")]")).click();
        driver.findElement(By.id("lang-chooser")).click();

        driver.navigate().back();
        
        
        wait.until(ExpectedConditions.urlMatches("www.google.com"));
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("viewport")));
           
        
        WebElement element3=driver.findElement(By.xpath("//*[@id='gbwa']/div[1]/a"));
        element3.click();
        WebElement ele=driver.findElement(By.xpath("//*[@id='gb31']/span[1]"));
        action.moveToElement(ele).build().perform();
        driver.findElement(By.id("viewport")).click();             
        driver.findElement(By.id("lst-ib")).sendKeys("hello plz search");
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform(); 
        WebElement rightClickElement=driver.findElement(By.id("lst-ib"));
        action.contextClick(rightClickElement).build().perform();
        
//        WebElement elem = driver.findElement(By.id(""));
//        action.doubleClick(elem).build().perform();
        driver.close();
	}

}
