package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.Scenario;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   @FindBy(id="Email")
   WebElement txtEmail;
   
   @FindBy(id="Password")
   WebElement txtPassword;
   
   @FindBy(xpath="//button[contains(.,'Log in')]")
   WebElement btnLogin;
 
   @FindBy(linkText="Logout")
   WebElement lnkLogout;
   
   public void setUsername(String uname)
   {
	   txtEmail.clear();
	   txtEmail.sendKeys(uname);
   }
   
   public void setPassword(String pwd)
   {
	   txtPassword.clear();
	   txtPassword.sendKeys(pwd);
   }
   
   public void clickLogin()
   {
	   btnLogin.click();
   }
   
   public void clickLogout()
   {
	   lnkLogout.click();
   }
   
   

}
