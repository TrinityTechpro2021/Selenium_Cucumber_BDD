//package StepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
////import junit.framework.Assert;
//
////import junit.framework.Assert;
//
//import org.junit.Assert;
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//	
//	@Given("^user is already on login Page$")
//	public void user_already_on_login_page() {
//		
//		System.setProperty("webdriver.chrome.driver", "C:/Softwares/webDrivers/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		
//		driver.get("https://classic.freecrm.com/index.html");
//		
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void tile_of_login_page_is_free_CRM() {
//		String title = driver.getTitle();
//		//String ActualTitle = "CRMPRO[ - CRM software for customer relationship management, sales, and support.]";//"CRMPRO []- CRM software for c...";  //"CRMPRO  - CRM software for customer relationship management, sales, and support.";
//		System.out.println(title);
//		
//		//Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title );
//		
//		
//	}
//	
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username, String password) {
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);		
//	    
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginBtn);
//		
//	}
//	
//	
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//		String title1 = driver.getTitle();
//		System.out.println(title1);
//		//Assert.assertEquals("CRMPRO", title1);
//	    
//	}
//	
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]"))).build().perform();
//	    driver.findElement(By.xpath("//a[contains(text(), 'New Contact')]")).click();
//	}
//	
//	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_contacts_details(String firstname, String lastname, String position) {
//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		driver.findElement(By.id("surname")).sendKeys(lastname);
//		driver.findElement(By.id("company_position")).sendKeys(position);
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	    
//	}
//	
//	@Then("^Close the Browser$")
//	public void Close_Browser() {
//		driver.quit();
//		//Assert.assertEquals("CRMPRO", title1);
//	    
//	}
//	
//	
//
//	
//
//}
