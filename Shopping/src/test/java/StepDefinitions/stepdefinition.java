package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
	
	private WebDriver driver=null;
	
	@Given("I navigate to the login page")
	public void iNavigateToTheLoginPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");
		Thread.sleep(10000);
		driver.findElement(Pageobject.sign_in).click();
		Thread.sleep(10000);
	}
	@When("I enter the following for {string} and {string}")
	public void iEnterTheFollowingForLogin(String username,String password) throws InterruptedException {
	   WebElement uname = driver.findElement(Pageobject.Uname);
	   uname.sendKeys(username);
	   WebElement pwd = driver.findElement(Pageobject.Pwd);
	   pwd.sendKeys(password);
	   driver.findElement(Pageobject.login).click();
	   Thread.sleep(5000);
	}
	@Then("Login should be successful")
	public void loginShouldBeSuccessful() {
		
		String Login_msg = driver.findElement(Pageobject.login_msg).getText();
		if(Login_msg.equals("There is 1 error"))
		{
			System.out.println("Login Successful");
		}
		driver.quit();
	    
	}


}
