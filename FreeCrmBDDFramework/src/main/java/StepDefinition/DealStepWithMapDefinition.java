package StepDefinition;

import java.util.List;
import java.util.Map;

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

public class DealStepWithMapDefinition {
	
WebDriver driver;
	
	@Given("^user is already on login Page for dealsmap$")
	public void user_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Softwares/webDrivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
	}
	
	@When("^title of login page is Free CRM for dealsmap$")
	public void tile_of_login_page_is_free_CRM() {
		String title = driver.getTitle();
		//String ActualTitle = "CRMPRO[ - CRM software for customer relationship management, sales, and support.]";//"CRMPRO []- CRM software for c...";  //"CRMPRO  - CRM software for customer relationship management, sales, and support.";
		System.out.println(title);
		
		//Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title );

	}
	
	@Then("^user enters username and password for dealsmap$")
	public void user_enters_username_and_password(DataTable credentials) {
		//List<List<String>> data = credentials.raw();
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
		driver.findElement(By.name("username")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));	
		}
	    
	}
	
	@Then("^user clicks on login button for dealsmap$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
	}
	
	
	@Then("^user is on home page for dealsmap$")
	public void user_is_on_home_page() {
		String title1 = driver.getTitle();
		System.out.println(title1);
		//Assert.assertEquals("CRMPRO", title1);
	    
	}
	
	@Then("^user moves to new deal page for dealsmap$")
	public void user_moves_to_new_contact_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deals')]"))).build().perform();
	    driver.findElement(By.xpath("//a[contains(text(), 'New Deal')]")).click();
	}
	
	@Then("^user enters deal details for dealsmap$")
	public void user_enters_contacts_details(DataTable dealData) {
		//List<List<String>> dealsData = dealData.raw();
		for(Map<String, String> dealsData : dealData.asMaps(String.class, String.class)) {
		driver.findElement(By.id("title")).sendKeys(dealsData.get("title"));
		driver.findElement(By.id("amount")).sendKeys(dealsData.get("amount"));
		driver.findElement(By.id("probability")).sendKeys(dealsData.get("probability"));
		driver.findElement(By.id("commission")).sendKeys(dealsData.get("commission"));
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
		}
		
	}
	
	@Then("^Close the Browser for dealsmap$")
	public void Close_Browser() {
		driver.quit();
		//Assert.assertEquals("CRMPRO", title1);
	    
	}

}
