package RizqiFauzan.Selenium.testOSPOS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import RizqiFauzan.Selenium.page.ospos.LoginPage;

public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverWait wait;

		System.setProperty("webdriver.chrome.driver", "/Users/rizqifauzan/Downloads/chromedriver2");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.goToLoginPage()
			.inputCreadential("admin", "pointofsale")
			.goToHomePage()
			.verifyUsername("John Doe")
			.goToGiftCard()
			.verifyPage()
			.addGiftCard("70")
			.verifyLastCard("$70.00");
		
		driver.quit();
	}
}
