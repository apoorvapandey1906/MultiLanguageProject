package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ElementUtils;



public class HomePage {
	
	private WebDriver driver;
	private ElementUtils elementUtils;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		elementUtils = new ElementUtils(driver);
		
	}
	
	public WebElement getHeaderElement(String headerValue) {
		String headerXpathValue = "//a[contains(text(),'"+headerValue+"')]";
		return elementUtils.getElement("xpath", headerXpathValue);
	}
	
	public boolean isHeaderPresent(String headerValue) {
		System.out.println( getHeaderElement(headerValue).getText());
		return getHeaderElement( headerValue).isDisplayed();
	}
	
	public WebElement getContactElement(String contactValue) {
		String contactXpathValue = "//a[contains(text(),'"+contactValue+"')]";
		
		return elementUtils.getElement("xpath", contactXpathValue);
	}
	
	public boolean isContactPresent(String contactValue) {
		System.out.println(getContactElement( contactValue).getText());
		return getContactElement( contactValue).isDisplayed();
	}

}
