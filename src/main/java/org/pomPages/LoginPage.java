package org.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	private WebDriver driver;
	
	@FindBy(id="logoContainer")
	private WebElement Logo;

	@FindBy(id="username")
	private WebElement Uname;

	@FindBy(css =".textField.pwdfield")
	private WebElement password;

	@FindBy(id ="loginButton")
	private WebElement LoginBt;

	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
   public void LogoIsDisplayed() {
	   Logo.isDisplayed();
   }
   public void LoginWithValid(String UN,String Pwd) {
	   Uname.sendKeys(UN);
	   password.sendKeys(Pwd);
	   
   }
   public void LoginBtClick() {
	   LoginBt.click();
   }
   public String Title() {
	   return driver.getTitle();
   }
   

}
