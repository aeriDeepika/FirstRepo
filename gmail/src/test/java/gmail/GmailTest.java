package gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//import org.testng.asserts.SoftAssert;
import java.lang.reflect.Method;

import com.project.operations.ChangeTheme;
import com.project.operations.ReadMessage;
import com.project.operations.SignIn;
import com.project.operations.SignOut;
import com.project.operations.WriteMessage;

public class GmailTest {

	 WebDriver driver;
	 ITestResult result;
	
	@BeforeClass
	public void beforeClass(){
	System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
  	driver = new ChromeDriver();
  	driver.get("https://www.gmail.com/");
  	driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod(Method method){
		 System.out.println("Test name: " + method.getName());
	}
	
	@AfterMethod
	public void afterMethod(){
		
		result = Reporter.getCurrentTestResult();
		switch (result.getStatus()) {
	    case ITestResult.SUCCESS:
	        System.out.println("======PASS=====");
	        break;

	    case ITestResult.FAILURE:
	        System.out.println("======FAIL=====");
	        break;

	    case ITestResult.SKIP:
	        System.out.println("======SKIP BLOCKED=====");
	       break;

	    default:
	        throw new RuntimeException("Invalid status");
	}
}
		
	@Test ( description = "Composing a new email", dependsOnMethods = { "signInuser" }, priority=2)
	public void writeMessage()
	{
		WriteMessage writeMessage=new WriteMessage();
		writeMessage.composeMail(driver);
		Reporter.log("Mail has been sent");
	}
	
	@Test ( description = "Changing Theme", priority=3, dependsOnMethods = { "writeMessage" })
	public void themeChange()
	{
		ChangeTheme themechn=new ChangeTheme();
		themechn.theme(driver);
//		String bodyText = driver.findElement(By.tagName("body")).getText();
//		Assert.assertEquals("Google apps", bodyText);
		Assert.assertTrue(driver.getPageSource().contains("Inbox"));
		Reporter.log("Theme Changed");
	}
	
	@Test (description = "Signing in to Gmail account", priority=1)
	public void signInuser()
	{
		SignIn signIn = new SignIn();
		Assert.assertEquals("Gmail", driver.getTitle());
		signIn.enterUserName(driver);
		signIn.clickNext(driver);
		signIn.enterPassword(driver);
		signIn.clickNext(driver);
		String pageSource = driver.getPageSource();
	    Assert.assertTrue(pageSource.contains("Gmail"));
//	    SoftAssert softAssertion= new SoftAssert();
//	    softAssertion.assertTrue(driver.getPageSource().contains("xyzz"));
		Reporter.log("Successfully logged in to the application");
	}
	@Test ( description = "Signing out from Gmail account", dependsOnMethods= {"readMessage"}, priority=5)
	public void signOut()
	{
		SignOut signof=new SignOut();
		signof.logOut(driver);
		String pageSource = driver.getPageSource();
	    Assert.assertTrue(pageSource.contains("Email or phone"));
		Reporter.log("Succesfully logged out");
	}
	@Test(dependsOnMethods= {"themeChange"}, priority=4)
	public void readMessage(){
		ReadMessage read=new ReadMessage();
		read.readMail(driver);
	}
	
	@AfterSuite
	public void afterSuit() {
		driver.close();
	}
}