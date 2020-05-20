package stepD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smoketest {
WebDriver driver;
	@Given("^open google and facebook$")
	public void open_google_and_facebook() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	}

	@When("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("Jamugoodly@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Select@123");
	}

	@Then("^user is logged in$")
	public void user_is_logged_in() throws Throwable {
		
	driver.findElement(By.id("u_0_b")).click();
	driver.close();
	}


	
	
	
	
	
	
	
	
	
}
