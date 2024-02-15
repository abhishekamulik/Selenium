package MySeleniumFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentPage {
	WebDriver driver;
	
	public paymentPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="\"[placeholder='Select Country']\"))")
	WebElement drpdwnCountry;
	
	Actions a = new Actions(driver);
	a.sendKeys(drpdwnCountry, "india").build().perform();
	driver.findElement(By.cssSelector(".ta-item:nth-child(3)")).click();
	driver.findElement(By.cssSelector(".action__submit")).click();

}
