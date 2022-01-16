import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-geolocation");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91798\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement username= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.sendKeys("8743026738");
		WebElement password= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		password.sendKeys("Iluvmylyfinagra1@");
		WebElement Login_button= driver.findElement(By.name("login"));
		Login_button.click();
		
		String Title= driver.getTitle();
		System.out.println(Title);
		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfAllElements());
		
		WebElement Post= driver.findElement(By.xpath("//*[@id=\"mount_0_0_+a\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div"));
		Post.click();

		WebElement Post_write= driver.findElement(By.xpath("//*[@id=\"mount_0_0_MU\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div"));
		Post_write.sendKeys("Hello! World");
		
		WebElement Post_Button= driver.findElement(By.xpath("//*[@id=\"mount_0_0_MU\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div"));
		Post_Button.click();

 driver.close();
	}

}
