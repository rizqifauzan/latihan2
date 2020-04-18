package RizqiFauzan.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import RizqiFauzan.Selenium.page.HomePage;

public class TestMidtrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		WebDriver driver;
		WebDriverWait wait;

		System.setProperty("webdriver.chrome.driver", "/Users/rizqifauzan/Downloads/chromedriver2");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage hm = new HomePage(driver);
		
		String ccNumber = "4811 1111 1111 1114";
		String expDat = "02 21";
		String cvvNum = "123";
		
		hm.goToDemo()
			.checkOut()
			.confirmItem()
			.payWIthCC(ccNumber, expDat, cvvNum);
	}

}
