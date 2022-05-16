package StepDefinitions;

import org.openqa.selenium.By;

public class Pageobject {
	
	public static final By sign_in = By.xpath("//a[@class='login']");
	
	public static final By Uname = By.id("email");
	
	public static final By Pwd = By.id("passwd");
	
	public static final By login = By.id("SubmitLogin");
	
	public static final By login_msg = By.xpath("//p[text()='There is 1 error']");

}
