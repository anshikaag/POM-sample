package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_pf {
	@FindBy(id="logout")
	WebElement btn_logout;
	HomePage_pf home;
	//create a constructor 
		WebDriver driver;
		public HomePage_pf(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
	public void checkLogoutIsDisplayed() {
	}
}


