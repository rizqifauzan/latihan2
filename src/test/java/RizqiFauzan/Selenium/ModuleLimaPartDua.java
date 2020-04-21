package RizqiFauzan.Selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModuleLimaPartDua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		WebDriver driver;
		WebDriverWait wait;
		
		//1. Buka browser Chrome baru. √
		System.setProperty("webdriver.chrome.driver", "/Users/fatoni/chromedriver80");
		driver = new ChromeDriver();
		
		//2. Buka https://sekolahqa.com/ √
		String UrlAwal = "https://www.sekolahqa.com/";
		driver.get(UrlAwal);
		
		//3. Get Page Title name dan Title length √
		String TitleName = driver.getTitle();
		Integer TitleLength = TitleName.length();
		
		//4. Print Page Title dan Title length pada Eclipse Console. √
		System.out.println(TitleName);
		System.out.println(TitleLength);
		
		//5. Get Page URL dan lakukan pengecekan (verify) apakah halaman yang dibuka benar sesuai seperti yang diminta.
		// Verifikasi apakah URL yang SEKARANG sama dengan URL yang kita minta di AWAL √
		String UrlSekarang = driver.getCurrentUrl();
		assertEquals(UrlSekarang, UrlAwal);
		
		//6. Get Page Source(HTML Source code) dan Page Source length √
		String PageSource = driver.getPageSource();
		Integer PageSourceLength = PageSource.length();
		
		//7. Print Page Length pada Eclipse Console.
		System.out.println(PageSourceLength);
		
		//8. TutupBrowser.
		driver.quit(); // atau driver.close()
		
	}
}
