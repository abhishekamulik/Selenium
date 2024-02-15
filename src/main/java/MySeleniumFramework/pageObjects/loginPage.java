package MySeleniumFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="userEmail")
	WebElement txtboxLogin;
	
	@FindBy(id="userPassword")
	WebElement txtpwdLogin;
	
	@FindBy(id="login")
	WebElement btnLogin;
	
	public void loginFunction()
	{
	txtboxLogin.sendKeys("abhim@gmail.com");
	txtpwdLogin.sendKeys("Collections71!");
	btnLogin.click();
	}
	
	public void gotoHomepage()
	{
		driver.get("https://www.rahulshettyacademy.com/client/");

	}
	//WebElement txtboxLogin=driver.findElement(By.id("userEmail")).sendKeys("abhim@gmail.com");
	//WebElement txtpwdLogin=driver.findElement(By.id("userPassword")).sendKeys("Collections71!");
	//WebElement btnLogin = driver.findElement(By.id("login")).click();
}
