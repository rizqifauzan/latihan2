package RizqiFauzan.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage(WebDriver driver) {
		this.driver = driver;
        wait = new WebDriverWait(driver, 10);    }

    //Click Method
    public void click(By elementLocation) {
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).click();
    }

    //Write Text
    public void writeText(By elementLocation, String text) {
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).clear();
        driver.findElement(elementLocation).sendKeys(text);
    }

    //Read Text
    public String readText(By elementLocation) {
        waitVisibility(elementLocation);
        return driver.findElement(elementLocation).getText();
    } //Read Text
    
    
    public String readTextLastItem(By elementLocation) {
        waitVisibility(elementLocation);
    	int i = driver.findElements(elementLocation).size();
        return driver.findElements(elementLocation).get(i-1).getText();
    }

    //Wait
    public void waitVisibility(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    
    //Click Method
    public void clickLastItem(By elementLocation) {
        waitVisibility(elementLocation);
    	int i = driver.findElements(elementLocation).size();
    	driver.findElements(elementLocation).get(i-1).click();
    }
}