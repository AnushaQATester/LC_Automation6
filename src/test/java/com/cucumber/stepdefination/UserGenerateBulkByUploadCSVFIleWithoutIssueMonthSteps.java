package com.cucumber.stepdefination;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkByUploadCSVFileWithoutIssueMonthObjects;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserGenerateBulkByUploadCSVFIleWithoutIssueMonthSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserGenerateBulkByUploadCSVFileWithoutIssueMonthObjects withoutissuemonth;


	public UserGenerateBulkByUploadCSVFIleWithoutIssueMonthSteps(TestContext context) {
		this.testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		withoutissuemonth = testContext.getPageObjectManager().getwithoutissuemonth();

	}

	@Given("^the permission of the application$")
	public void the_permission_of_the_application() throws Throwable {

	}

	@When("^the User logs in successfully using un & pwd$")
	public void the_User_logs_in_successfully_using_un_pwd() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^confirm the appearance of a popup message$")
	public void confirm_the_appearance_of_a_popup_message() throws Throwable {
		//System.out.println("login success");
	}

	@Then("^proceed to the section titled Certificates tab$")
	public void proceed_to_the_section_titled_Certificates_tab() throws Throwable {
		//withoutissuemonth.ClickOnCertificates();
	}

	@Then("^select the option labeled Bulk Certificates$")
	public void select_the_option_labeled_Bulk_Certificates() throws Throwable {
		//withoutissuemonth.clickOnGenerateBulk(); 
	}

	@Then("^choose an item from the dropdown$")
	public void choose_an_item_from_the_dropdown() throws Throwable {
		//withoutissuemonth.clickOndropDown();
	}

	@Then("^upload both a JPG and a CSV filess at a time$")
	public void upload_both_a_JPG_and_a_CSV_filess_at_a_time() throws Throwable {
		//withoutissuemonth.files_upload();
	}

	@Then("^ensure that the checkbox is selected before saving it$")
	public void ensure_that_the_checkbox_is_selected_before_saving_it() throws Throwable {
		//withoutissuemonth.next_button();
	}

}
