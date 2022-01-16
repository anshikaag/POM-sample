package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignmentPage {
	WebDriver driver;
	
private By txt_username= By.xpath("//*[@id=\\\"email\\\"]");
private By txt_password= By.xpath("//*[@id=\"pass\"])");
private By login_button= By.name("login");
private By Post= By.xpath("//*[@id=\\\"mount_0_0_MU\\\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div\"");
private By Post_write= By.xpath("//*[@id=\\\"mount_0_0_MU\\\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div");
private By Post_button= By.xpath("//*[@id=\\\"mount_0_0_MU\\\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div");

public AssignmentPage(WebDriver driver) {
	this.driver= driver;
//    if (driver.getTitle().equals("")) {
//    	throw new IllegalStateException("This is not a login page"
//    			+ driver.getCurrentUrl());
//    	
//    }
}

public void enterUsername(String username) {
	driver.findElement(txt_username).sendKeys(username);
	}

public void enterPassword(String password) {
	driver.findElement(txt_password).sendKeys(password);
	driver.findElement(login_button).click();
	}

public void loginClick() {
	driver.findElement(login_button).click();
	}

public void PostClick() {
	driver.findElement(Post).click();
}
public void Post(String value) {
	driver.findElement(Post_write).sendKeys(value);;
}

public void PostButton() {
	driver.findElement(Post_button).click();
}
}
