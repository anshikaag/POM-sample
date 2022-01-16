package StepDefinition;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AssignmentPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AssignmentOne {
	
	WebDriver driver;
	AssignmentPage login;
	
	@Given("^User is on facebook login page$")
	public void user_is_on_facebook_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91798\\Downloads\\chromedriver\\chromedriver.exe");
        driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	    }

		@When("^User enters the (.*)$")
	public void user_enters_the_username(String username) throws Throwable {
		login= new AssignmentPage(driver);
	    login.enterUsername(username);
	    
	
	}
	

	@When("^User enters (.*)$")
	public void user_enters_password(String password) throws Throwable {
		  login.enterPassword(password);
			
	}

	@Then("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		login.loginClick();
     
	}

	@Then("^User is navigated to hoem screen$")
	public void user_is_navigated_to_hoem_screen() throws Throwable {
	String Title= driver.getTitle();
	System.out.println(Title);
    Assert.assertEquals(Title, "Facebook");
	}


	@Then("^User clicks on post functionality$")
	public void user_clicks_on_post_functionality() throws Throwable {
     login.PostClick();		
	}

	@Then("^User enters \"([^\"]*)\" in post$")
	public void user_enters_in_post(String arg1) throws Throwable {
  login.Post("Hello World!");
		
	}

	
	
	@Then("^User clicks on post button$")
	public void user_clicks_on_post_button() throws Throwable {
	login.PostButton();
		
	}

	@Then("^Post is suceesfully posted and visible on hoem screen\\.$")
	public void post_is_suceesfully_posted_and_visible_on_hoem_screen() throws Throwable {
	
	
	}

}
