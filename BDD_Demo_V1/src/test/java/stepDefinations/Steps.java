package stepDefinations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;
public class Steps {
	public WebDriver driver;
    public LoginPage lp;
    
    
    
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    lp=new LoginPage(driver);
	}

	@When("Users Opens URL {string}")
	public void users_opens_url(String url) {
		driver.get(url);
	}

	@When("Users enters Email as {string} and Password as {string}")
	public void users_enters_email_as_and_password_as(String uname, String pwd) {
		lp.setUsername(uname);
		lp.setPassword(pwd);
	}

	@When("Click on Login")
	public void click_on_login() {
		lp.clickLogin();
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful."))
		{
			driver.close();
			Assert.assertTrue(false);
		}else
		{
			Assert.assertEquals(title, driver.getTitle());
		}
	    
	}

	@When("User Click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		lp.clickLogout();
		driver.wait(3000);
	   
	}

	@Then("The Page Title Should be {string}")
	public void the_page_title_should_be(String string) {
	   
	}

	@Then("Close Browser")
	public void close_browser() {
		driver.close();
	}

   
}
