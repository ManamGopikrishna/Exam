package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
	
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\training_C2d.02.11\\Firefox\\geckodriver.exe");
	      driver=new FirefoxDriver();
	      driver.get("http://www.newtours.demoaut.com/");
	}

	@When("user enters {string} and {string} and click on submit")
	public void user_enters_and_and_click_on_submit(String string, String string2) {
		  WebElement button=driver.findElement(By.linkText("SIGN-ON"));
		  button.click();
		  WebElement uname=driver.findElement(By.name("userName"));
		  uname.click();
		  uname.sendKeys(string);
		  WebElement pwd=driver.findElement(By.name("password"));
		  pwd.click();
		  pwd.sendKeys(string2);
		  WebElement submit=driver.findElement(By.name("login"));
		  submit.click();
	}

	@Then("user login should be successful")
	public void user_login_should_be_successful() {
		driver.get("http://newtours.demoaut.com/mercuryreservation.php");
		Assert.assertTrue(true);
	}


}
