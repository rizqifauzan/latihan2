package RizqiFauzan.Selenium.page.ospos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import RizqiFauzan.Selenium.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	String baseUrl = "https://demo.opensourcepos.org/login";

	By inputUsername = By.name("username");
	By inputPassword = By.xpath("//input[@name='password']");
	By btnLogin = By.xpath("//input[@name='loginButton']");
	By errorMessage = By.xpath("//div[@class='error']");

	public LoginPage goToLoginPage() {
		driver.get(baseUrl);
		return this;
	}

	public LoginPage inputCreadential(String username, String password) {
		writeText(inputUsername, username);
		writeText(inputPassword, password);
		click(btnLogin);
		return this;
	}

	public HomePage goToHomePage() {
		return new HomePage(driver);
	}

	public LoginPage verifyInvalidCredential() {
		Assert.assertEquals(readText(errorMessage), "Invalid Username or Password");
		return this;
	}

}
