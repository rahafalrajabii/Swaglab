
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTeastCasesSwagLab {
	WebDriver driver = new EdgeDriver();
	

	@BeforeTest
	public void mySetup() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void Login() {

		// Elements
		WebElement UserNameInputField = driver.findElement(By.id("user-name"));

		WebElement PasswordInputField = driver.findElement(By.id("password"));

		WebElement LoginButton = driver.findElement(By.id("login-button"));

		// Action
		UserNameInputField.sendKeys("standard_user");

		PasswordInputField.sendKeys("secret_sauce");

		LoginButton.click();

	}

	@Test(priority = 2)
	public void AddToCart() {
		// Elements

		WebElement FirstItem = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));

		WebElement SecoundItem = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	
		WebElement ThierdItem = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));

		// Action

		FirstItem.click();

		SecoundItem.click();

		ThierdItem.click();
	}

	
	@Test(priority = 3)
	public void RemoveFromTheCart() {

		// Elements

		WebElement FirstItem = driver.findElement(By.id("remove-sauce-labs-bike-light"));

		WebElement SecoundItem = driver.findElement(By.id("remove-sauce-labs-backpack"));
	
		WebElement ThierdItem = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));

		// Action

		FirstItem.click();

		SecoundItem.click();

		ThierdItem.click();
	}
	
	/**
	 * ااذه قررتي تضيفي مره تانيه ع الكارت بتسميه اسم جديد
	 * add to the cart after remove . l cant write add to cart 2
	 */

	@Test(priority = 4)
	
	
	public void AddToCartAfterRemove () {
		// Elements

		WebElement FirstItem = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));

		WebElement SecoundItem = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	
		WebElement ThierdItem = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));

		// Action

		FirstItem.click();

		SecoundItem.click();

		ThierdItem.click();
	}
	
	@Test(priority = 5)
	public void checkoutProcess () {
		driver.navigate().to("https://www.saucedemo.com/cart.html");
		
// driver.findElement(By.id("shopping_cart_container")).click();
		
		WebElement CheckoutButton =  driver.findElement(By.id("checkout"));
		CheckoutButton .click();
		

		//elements 
		WebElement firstName = driver.findElement(By.id("first-name"));
		WebElement lastName = driver.findElement(By.id("last-name"));
		WebElement PostalCode = driver.findElement(By.id("postal-code"));
		
		// actions
		
		firstName.sendKeys("Rahaf");
		lastName.sendKeys("Alrajabi");
		PostalCode.sendKeys("12345");

		WebElement ContinueButton= driver.findElement(By.name("continue"));
		 ContinueButton.click();
		 
		 WebElement finishButton = driver.findElement(By.id("finish"));
		 finishButton.click();
	
		

	}

	@Test(priority = 6)
	public void Logout () throws InterruptedException  {

		WebElement BurgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
		
		BurgerMenu.click();
		
		Thread.sleep(1000);
		
		 WebElement LogoutButtom = driver.findElement(By.id("logout_sidebar_link"));
		 
		 LogoutButtom.click();
	}

	
	
	@AfterTest
	public void AfterThetestIsDone() {
		driver.close();
	}
}
