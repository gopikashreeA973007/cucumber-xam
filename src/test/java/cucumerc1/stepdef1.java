package cucumerc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef1 {
	WebDriver driver;
	
	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    
	}

	@When("user navigates to registration page")
	public void user_navigates_to_registration_page() {
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("user enters with the username as {string}")
	public void user_enters_with_the_username_as(String string) {
	    driver.findElement(By.id("userName")).sendKeys("gopika");
	}

	@When("user enters with the firstname as {string}")
	public void user_enters_with_the_firstname_as(String string) {
	   driver.findElement(By.id("firstName")).sendKeys("gopi");
	}

	@When("user enters with the lastname as {string}")
	public void user_enters_with_the_lastname_as(String string) {
		driver.findElement(By.id("lastName")).sendKeys("gopi");
	}

	@When("user enters with the password as {string}")
	public void user_enters_with_the_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@When("user enters with the confirm password as {string}")
	public void user_enters_with_the_confirm_password_as(String string) {
		driver.findElement(By.id("pass_confirmation")).sendKeys("Password123");
	}

	@When("user enters with the gender as {string}")
	public void user_enters_with_the_gender_as(String string) {
		driver.findElement(By.id("gender")).click();
	}

	@When("user enters with the email as {string}")
	public void user_enters_with_the_email_as(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys("rthigopika@gmail.com");
	}

	@When("user enters with the mobile number as {string}")
	public void user_enters_with_the_mobile_number_as(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys("9840692787");
		
	}

	@When("user enters with the dob as {string}")
	public void user_enters_with_the_dob_as(String string) {
		driver.findElement(By.id("dob")).sendKeys("20/02/1998");
	}

	@When("user enters with the address as {string}")
	public void user_enters_with_the_address_as(String string) {
		driver.findElement(By.id("address")).sendKeys("perungalathur");
	}

	@When("user enters with the security as {string}")
	public void user_enters_with_the_security_as(String string) {
		driver.findElement(By.id("securityQuestion")).sendKeys("what is your nick name");
	}

	@When("user enters with the answer as {string}")
	public void user_enters_with_the_answer_as(String string) {
		driver.findElement(By.id("answer")).sendKeys("aarthi");
	}

	@Then("verify registration successfull")
	public void verify_registration_successfull() {
		driver.findElement(By.name("Submit")).click();
	    
	}

}
