package MySeleniumFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import AbstractComponents.AbstractComponents;

public class productCataloguePage extends AbstractComponents {
	WebDriver driver;
	
	public productCataloguePage(WebDriver driver)
	{
		super.driver=driver;
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".mb-3")
	List<WebElement> Products;
	
	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
	WebElement btnCart;
	
	By productlist=By.cssSelector(".mb-3");
	
	public void getProductname(String productName)
	{
		waittillElementvisible(productlist);
		WebElement prod =	Products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	}

	
	
	

	



	//List<WebElement> Products=driver.findElements(By.cssSelector(".mb-3"));
	/*for (WebElement Product : Products)
		System.out.println(Product.getText());*/
	//driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
}
