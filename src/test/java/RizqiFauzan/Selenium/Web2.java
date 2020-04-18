package RizqiFauzan.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Web2 {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverWait wait;

		System.setProperty("webdriver.chrome.driver", "/Users/rizqifauzan/Downloads/chromedriver2");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		driver.get("https://demo.opensourcepos.org/login");

		BasePage bs = new BasePage(driver);
		
		
		By inputUsername = By.name("username");
		By inputPassword = By.xpath("//input[@name='password']");
		By btnLogin = By.xpath("//input[@name='loginButton']");
		
		
		By abc = By.id("input_username");

		
		driver.findElement(inputUsername).sendKeys("admin");
		driver.findElement(inputPassword).sendKeys("password");
		driver.findElement(btnLogin).click();
		//////////////////////////////////////////
		bs.writeText(inputUsername, "admin");
		bs.writeText(inputPassword, "password");
		bs.click(btnLogin);

		String errorMessage = driver.findElement(By.xpath("//div[@class='error']")).getText();
		Assert.assertEquals("Ungültiger Benutzername oder Passwort.", errorMessage);
	}

}
