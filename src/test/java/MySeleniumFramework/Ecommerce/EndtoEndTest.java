package MySeleniumFramework.Ecommerce;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import MySeleniumFramework.pageObjects.cartPage;
import MySeleniumFramework.pageObjects.loginPage;
import MySeleniumFramework.pageObjects.paymentPage;
import MySeleniumFramework.pageObjects.productCataloguePage;


public class EndtoEndTest {
	String productName="ZARA COAT 3";
@Test()
public void endtoendtest() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Documents/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	loginPage lp= new loginPage(driver);
	lp.gotoHomepage();
	lp.loginFunction();
	
	productCataloguePage pc=new productCataloguePage(driver);
	pc.getProductname(productName);
	pc.cartButton();
	
	cartPage cp=new cartPage(driver);
	cp.btnContshopclick();
	//List<WebElement> Products=driver.findElements(By.cssSelector(".mb-3"));
	/*for (WebElement Product : Products)
		System.out.println(Product.getText());*/
	//WebElement prod =	Products.stream().filter(product->
	//product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
	//prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	//driver.close();
	//ng-animating
	//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
	//driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
	//driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
	//driver.findElement(By.cssSelector(".totalRow button")).click();
	//driver.findElement(By.cssSelector(".btn.btn-primary:nth-child(1)")).click();
	paymentPage pp=new paymentPage(driver);
	
	WebElement drpdwnCountry=driver.findElement(By.cssSelector("[placeholder='Select Country']"));
	Actions a = new Actions(driver);
	a.sendKeys(drpdwnCountry, "india").build().perform();
	driver.findElement(By.cssSelector(".ta-item:nth-child(3)")).click();
	driver.findElement(By.cssSelector(".action__submit")).click();
}
}
