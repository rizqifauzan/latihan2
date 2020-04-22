package RizqiFauzan.Selenium.page.ospos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import RizqiFauzan.Selenium.BasePage;

public class GiftCardPage extends BasePage {

	public GiftCardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By btnNewGiftCard = By.cssSelector(".btn-info");
	By inputAmmout = By.id("giftcard_amount");
	By btnSubmit = By.id("submit");
	By lblAmount = By.xpath("//*[@id=\"table\"]/tbody//td[6]");
	
	public GiftCardPage verifyPage() {
		if(readText(btnNewGiftCard).contains("New Gift Card"))
		{
			System.out.println("Halaman Giftcard Tampil");
		}else {
			System.out.println("Halaman Giftcard Tidak Tampil");
		}
		return this;
	}
	
	public GiftCardPage addGiftCard(String usd)  {
		click(btnNewGiftCard);
		writeText(inputAmmout, usd);
		click(btnSubmit);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(btnSubmit);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	public GiftCardPage verifyLastCard(String usd) {
		if(readTextLastItem(lblAmount).equals(usd)) {
			System.out.println("Kartu berhasil dibuat");
		}else {
			System.out.println("Kartu gagal dibuat");
		}
		System.out.println();
		return this;
	}
	
}
