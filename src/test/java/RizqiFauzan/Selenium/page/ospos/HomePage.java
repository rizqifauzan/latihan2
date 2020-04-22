package RizqiFauzan.Selenium.page.ospos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import RizqiFauzan.Selenium.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By username = By.xpath("/html/body/div/div[1]/div/div[2]/a[1]");
	By btnGiftCard = By.xpath("//li[8]/a[contains(.,'Gift Cards')]");

	public HomePage verifyUsername(String expected) {
		if (readText(username).equals(expected)) {
			System.out.println("user sesuai");
		} else {
			System.out.println(readText(username) + " tidak sesuai " + expected);
		}
		return this;
	}

	
	public GiftCardPage goToGiftCard() {
		click(btnGiftCard);
		return new GiftCardPage(driver);
	}
	
	
}
