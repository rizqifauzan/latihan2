package RizqiFauzan.Selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import RizqiFauzan.Selenium.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	String baseURL = "https://demo.midtrans.com/";

	By btnBuy = By.className("buy");
	By btnCheckOut = By.xpath("//div[@class='cart-checkout']");
	By btnContinue = By.className("button-main-content");

	By itemCreditCard = By.xpath("//div[.='Credit Card']");
	By cardNumber = By.name("cardnumber");
	By expDate = By.xpath("//div[@id='application']/div[3]/div/div/div/form/div[2]/div[2]/input");
	By cvvNumber = By.xpath("//div[@id='application']/div[3]/div/div/div/form/div[2]/div[3]/input");
	By checkBoxPromo = By.name("promo");

	public HomePage goToDemo() {
		driver.get(baseURL);
		return this;
	}

	public HomePage checkOut() {
		click(btnBuy);
		click(btnCheckOut);
		return this;
	}

	public HomePage confirmItem() {
		driver.switchTo().frame(0);
		click(btnContinue);
		return this;
	}

	public HomePage payWIthCC(String ccNumber, String expDat, String cvvNum) {
		click(itemCreditCard);
		writeText(cardNumber, ccNumber);
		writeText(expDate, expDat);
		writeText(cvvNumber, cvvNum);
		clickLastItem(checkBoxPromo);
		click(btnContinue);
		return this;
	}
	
	
	public HomePage inputOTP() {
		return this;
	}
	
	public HomePage verivyTrxValid() {
		return this;
	}

}
