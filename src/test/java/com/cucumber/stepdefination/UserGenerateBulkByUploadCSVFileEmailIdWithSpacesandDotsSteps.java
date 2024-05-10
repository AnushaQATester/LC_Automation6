package com.cucumber.stepdefination;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkUploadCSVFileEmailIdWithSpacesandDotsPageObjects;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserGenerateBulkByUploadCSVFileEmailIdWithSpacesandDotsSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserGenerateBulkUploadCSVFileEmailIdWithSpacesandDotsPageObjects bulkinvalidcsv;
	
	public UserGenerateBulkByUploadCSVFileEmailIdWithSpacesandDotsSteps(TestContext context) {
		this.testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		bulkinvalidcsv =testContext.getPageObjectManager().getbulkinvalidcsv();
      
	}

	
	@Given("^the application is launched$")
	public void the_application_is_launched() throws Throwable {
	    
	}

	@When("^User enters credentials and logs in$")
	public void user_enters_credentials_and_logs_in() throws Throwable {
		login.Logintoappln("SahUser", "User@1"); 
		Thread.sleep(4000);
	    
	}

	@Then("^a popup is displayed$")
	public void a_popup_is_displayed() throws Throwable {
		//System.out.println("login sucessful");
	    
	}

	@Then("^I click on the Certificates option$")
	public void i_click_on_the_Certificates_option() throws Throwable {
		//bulkinvalidcsv.ClickOnCertificates();
	   
	}

	@Then("^I click on the Bulk Certificates option$")
	public void i_click_on_the_Bulk_Certificates_option() throws Throwable {
		//bulkinvalidcsv.clickOnGenerateBulk();
	    
	}

	@Then("^I select a value from the dropdown$")
	public void i_select_a_value_from_the_dropdown() throws Throwable {
		//bulkinvalidcsv.clickOndropDown();
	   
	}

	@Then("^I upload a JPG file &CSV file$")
	public void i_upload_a_JPG_file_CSV_file() throws Throwable {
		//bulkinvalidcsv.files_upload();
		//Thread.sleep(2000);
	    
	}

	@Then("^I click on the checkbox and save button$")
	public void i_click_on_the_checkbox_and_save_button() throws Throwable {
		//bulkinvalidcsv.next_button();
	   
	}
}
