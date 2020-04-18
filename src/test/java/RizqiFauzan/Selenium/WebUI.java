package RizqiFauzan.Selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverWait wait;

		System.setProperty("webdriver.chrome.driver", "/Users/rizqifauzan/Downloads/chromedriver2");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		driver.get("https://demo.midtrans.com/");

		BasePage bs = new BasePage(driver);

		By btnBuy = By.className("buy");
		By btnCheckOut = By.xpath("//div[@class='cart-checkout']");
		By btnContinue = By.className("button-main-content");
		
		By itemCreditCard = By.xpath("//div[.='Credit Card']");
		By cardNumber = By.name("cardnumber");
		By expDate = By.xpath("//div[@id='application']/div[3]/div/div/div/form/div[2]/div[2]/input");
		By cvvNumber = By.xpath("//div[@id='application']/div[3]/div/div/div/form/div[2]/div[3]/input");
		By checkBoxPromo = By.name("promo");

		
		
		bs.click(btnBuy);
		bs.click(btnCheckOut);

		driver.switchTo().frame(0);
		bs.click(btnContinue);
		bs.click(itemCreditCard);
		
		bs.writeText(cardNumber, "4811 1111 1111 1114");
		bs.writeText(expDate, "02 21");
		bs.writeText(cvvNumber, "123");
		bs.click(checkBoxPromo);
		bs.click(btnContinue);

		driver.findElements(checkBoxPromo).get(0).click();


		
		
		
		
		

	}

	/*
	 * driver.findElement(By.xpath("//div[@class='cart-checkout']")).click();
	 * 
	 * driver.switchTo().frame(0);
	 * 
	 * driver.findElement(By.className("button-main-content")).click();
	 * 
	 * driver.findElement(By.xpath("//div[.='Credit Card']")).click();
	 * 
	 * driver.findElement(By.name("cardnumber")).sendKeys("4811 1111 1111 1114");
	 * driver.findElement(By.xpath(
	 * "//div[@id='application']/div[3]/div/div/div/form/div[2]/div[2]/input"))
	 * .sendKeys("02 21"); driver.findElement(By.xpath(
	 * "//div[@id='application']/div[3]/div/div/div/form/div[2]/div[3]/input"))
	 * .sendKeys("123");
	 * 
	 * driver.findElement(By.className("button-main-content")).click();
	 * driver.switchTo().frame(0);
	 * 
	 * wait.until(ExpectedConditions.elementToBeClickable(By.id("PaRes")));
	 * driver.findElement(By.id("PaRes")).sendKeys("112233");
	 * driver.findElement(By.name("ok")).click();
	 * 
	 * driver.switchTo().defaultContent(); driver.switchTo().frame(0);
	 * 
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("large"
	 * ))); String actualPrice =
	 * driver.findElement(By.className("large")).getText();
	 * assertEquals(actualPrice, "Rp 20,000");
	 * 
	 * String actualComment =
	 * driver.findElement(By.className("text-bold")).getText();
	 * assertEquals(actualComment, "Transaction successful");
	 * 
	 */

}
