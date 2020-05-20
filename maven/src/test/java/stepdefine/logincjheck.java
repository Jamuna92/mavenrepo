package stepdefine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logincjheck {

WebDriver driver;

@Given("^open new browser and url for fb$")
public void open_new_browser_and_url_for_fb() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^user enter username and password$")
public void user_enter_username_and_password() throws Throwable {
	driver.findElement(By.name("email")).sendKeys("jamugoodly");
	driver.findElement(By.name("pass")).sendKeys("Select@123");
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@Then("^user click on login button$")
public void user_click_on_login_button() throws Throwable {
	driver.findElement(By.linkText("Log In")).click();
	Thread.sleep(300);
	
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}


	
	
	
	
	
	
	
	
	
}
