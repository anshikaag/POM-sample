package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//*[@id=\\\\\\\"email\\\\\\\"]")
	@CacheLookup //if the locators are not changing for basic website use this 
	WebElement txt_username;
	//create a constructor 
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
 //Similarly we can create all webelements in this page factory.
	//create functions or methods to perform actions on these webelements.
	
	public void enterUsername() {
	txt_username.sendKeys("Raghav");
	}
	}

