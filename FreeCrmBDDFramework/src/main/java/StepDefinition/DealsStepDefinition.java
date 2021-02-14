package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on login Page for deals$")
	public void user_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Softwares/webDrivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
	}
	
	@When("^title of login page is Free CRM for deals$")
	public void tile_of_login_page_is_free_CRM() {
		String title = driver.getTitle();
		//String ActualTitle = "CRMPRO[ - CRM software for customer relationship management, sales, and support.]";//"CRMPRO []- CRM software for c...";  //"CRMPRO  - CRM software for customer relationship management, sales, and support.";
		System.out.println(title);
		
		//Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title );

	}
	
	@Then("^user enters username and password for deals$")
	public void user_enters_username_and_password(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));		
	    
	}
	
	@Then("^user clicks on login button for deals$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
	}
	
	
	@Then("^user is on home page for deals$")
	public void user_is_on_home_page() {
		String title1 = driver.getTitle();
		System.out.println(title1);
		//Assert.assertEquals("CRMPRO", title1);
	    
	}
	
	@Then("^user moves to new deal page for deals$")
	public void user_moves_to_new_contact_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deals')]"))).build().perform();
	    driver.findElement(By.xpath("//a[contains(text(), 'New Deal')]")).click();
	}
	
	@Then("^user enters deal details for deals$")
	public void user_enters_contacts_details(DataTable dealData) {
		List<List<String>> dealsData = dealData.raw();
		driver.findElement(By.id("title")).sendKeys(dealsData.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(dealsData.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(dealsData.get(0).get(2));
		driver.findElement(By.id("commission")).sendKeys(dealsData.get(0).get(3));
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
		
	}
	
	@Then("^Close the Browser for deals$")
	public void Close_Browser() {
		driver.quit();
		//Assert.assertEquals("CRMPRO", title1);
	    
	}
	
	
	
}
