package MySeleniumFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartPage {
	
	WebDriver driver;
	public cartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(css="By.cssSelector(\'.btn.btn-primary:nth-child(1)\'");
	WebElement btnContinueShopping;

	public void btnContshopclick()
	{
		btnContinueShopping.click();
	}

}
