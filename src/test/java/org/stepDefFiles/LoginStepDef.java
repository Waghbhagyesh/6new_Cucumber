package org.stepDefFiles;

import org.baseUtility.PropertiesUtil;
import org.driverFactory.DriverFactory;
import org.pomPages.LoginPage;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	LoginPage lp_obj=new LoginPage(DriverFactory.getDriver());
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		 DriverFactory.getDriver().get(PropertiesUtil.pu.getDataConfig("url"));
	}
	@Then("ActiTime logo should be displayed")
	public void acti_time_logo_should_be_displayed() {
	    lp_obj.LogoIsDisplayed();
	}
		
	@When("User enters valid credential")
	public void user_enters_valid_credential() {
	    lp_obj.LoginWithValid("admin", "manager");
	}
	@Then("User click on login button")
	public void user_click_on_login_button() {
	    lp_obj.LoginBtClick();
	}
	@Then("User should be navigate to dashboard")
	public void user_should_be_navigate_to_dashboard() {
		String Title1=lp_obj.Title();
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(Title1, "actiTIME -  Enter Time-Track");
	}






}
