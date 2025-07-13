import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {

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
	public void AddAllItemsToTheCart() {
		
		
		// driver.findElement(By.classname(".btn.btn_primary.btn_smallbtn_inventory"));
		// static
				String[] mynames = { "ahmad", "ali", "anas", "omar" };

				System.out.println(mynames.length);

				// dyanmic
				
//				List<WebElement> prices = new ArrayList<WebElement>();
//				WebElement FirstItemPrice = driver.findElement(By.className("inventory_item_price"));
//				prices.add(FirstItemPrice);
//				System.out.println(prices.get(0).getText());
				
				/*
				 * يك بتطلع الاسعار بس بطيئه وانا مش حاجي ادخل واحد واحد فشو بعمل 
				 * تحت انا اجيت طلبت منه يطبعلي العنصر اندكس 5 الي هو العنصر رقم 6 
				 * System.out.println(AllThePrices.get(5).getText());
				 * */
				
				
				
			
				
			List<WebElement> AllThePrices = driver.findElements(By.className("inventory_item_price"));
//				System.out.println(AllThePrices.get(0).getText());
//				System.out.println(AllThePrices.get(1).getText());
//				System.out.println(AllThePrices.get(2).getText());
//				System.out.println(AllThePrices.get(3).getText());
//				System.out.println(AllThePrices.get(4).getText());
//				System.out.println(AllThePrices.get(5).getText());
				
				/*
				 * 
				 * 'هيك كمان رح يطبعلي كل الاسعار بس هل منطقي اقعد ادخلهم واحد واحد اذا كان عندي 2000 عنصر
				 * طبعا لا عشان هيك بعمل شئ اسمه فور لووب
				 * الي بتكرر نفس الاكشن اكتر من مره  */
				
				
			for (int i = 0 ; i < AllThePrices.size(); i++) {
				System.out.println(AllThePrices.get(i).getText());
					
				}
			List<WebElement> AllAddButton = driver.findElements(By.className("btn_primary"));
			for (int i = 0 ; i < AllAddButton.size(); i++) {
				
				if (i==3) {
					continue;
				}
				
				AllAddButton.get(i).click();
					
				}
			
			/*
			 * السوال القوي كيف بدي اضيف عنصر اه والتاني لا الثالث اه 
			 * i++
			 * بدل هيك بكتب 
			 * i=i+2
			 * 	for (int i = 0 ; i < AllAddButton.size(); i=i+2) {
			 * 0-2-4
			 * بضيفله 2 
			 * 
			 * 			for (int i = 1 ; i < AllAddButton.size(); i=i+2) {
			 * عدلت ال اي لواحد وضفت عليها تنين كيف رح تضيف 
			 * 1-3-5 id; هيك بطبع  

			 * */
			
		
			
			}
					
			
			
	}	
	



