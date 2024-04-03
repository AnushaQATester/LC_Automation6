package com.cucumber.stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkByUploadCSVFileWithEmptyStudentNamePageObjects;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserGenerateBulkByUploadCSVFileWithEmptyStudentNameSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserGenerateBulkByUploadCSVFileWithEmptyStudentNamePageObjects emptystuname1;
	
	public UserGenerateBulkByUploadCSVFileWithEmptyStudentNameSteps(TestContext context) {
		this.testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		emptystuname1 =testContext.getPageObjectManager().getemptystuname1();
		
	}

	@Given("^the access of the application$")
	public void the_access_of_the_application() throws Throwable {
	    
	}

	@When("^User login successfully using un & pwd$")
	public void user_login_successfully_using_un_pwd() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(3000);
	}

	@Then("^confirm the appearance of a popup$")
	public void confirm_the_appearance_of_a_popup() throws Throwable {
	   System.out.println("login done");
	}

	@Then("^proceed to the section  Certificates tab$")
	public void proceed_to_the_section_Certificates_tab() throws Throwable {
		emptystuname1.ClickOnCertificates();
	}

	@Then("^select the option  emptystuname1 Certificates$")
	public void select_the_option_emptystuname1_Certificates() throws Throwable {
		emptystuname1.clickOnGenerateBulk1();
	    
	}

	@Then("^choose item from  dropdown$")
	public void choose_item_from_dropdown() throws Throwable {
		emptystuname1.clickOndropDown();
	   
	}

	@Then("^upload both a JPG and CSV filess at atime$")
	public void upload_both_a_JPG_and_CSV_filess_at_atime() throws Throwable {
		emptystuname1.files_upload();
	    
	}

	@Then("^ensure  the checkbox selected before saving it$")
	public void ensure_the_checkbox_selected_before_saving_it() throws Throwable {
	    emptystuname1.next_button();
	}


	
}
