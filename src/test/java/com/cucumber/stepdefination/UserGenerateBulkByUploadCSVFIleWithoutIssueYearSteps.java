package com.cucumber.stepdefination;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkByUploadCSVFileWithoutIssueMonthObjects;
import com.cucumber.PageObjects.UserGenerateBulkByUploadCSVFileWithoutIssueYearObjects;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserGenerateBulkByUploadCSVFIleWithoutIssueYearSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserGenerateBulkByUploadCSVFileWithoutIssueYearObjects withoutissueyear;


	public UserGenerateBulkByUploadCSVFIleWithoutIssueYearSteps(TestContext context) {
		this.testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		withoutissueyear = testContext.getPageObjectManager().getwithoutissueyear();

	}

	@Given("^the permission of the application(\\d+)$")
	public void the_permission_of_the_application(int arg1) throws Throwable {
		
	}

	@When("^the user logs in successfully using UN & PWD$")
	public void the_user_logs_in_successfully_using_UN_PWD() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(4000);
	}

	@Then("^confirm the Appearance of a Popup Message$")
	public void confirm_the_Appearance_of_a_Popup_Message() throws Throwable {
		//System.out.println("login success");
	}

	@Then("^proceed to the section titled Certificates tab(\\d+)$")
	public void proceed_to_the_section_titled_Certificates_tab(int arg1) throws Throwable {
		//withoutissueyear.proceedtothesectiontitledCertificatestab1();
	}

	@Then("^select the option labeled Bulk Certificates(\\d+)$")
	public void select_the_option_labeled_Bulk_Certificates(int arg1) throws Throwable {
		//withoutissueyear.selecttheoptionlabeledBulkCertificates1();
	}

	@Then("^choose an item from the Dropdown(\\d+)$")
	public void choose_an_item_from_the_Dropdown(int arg1) throws Throwable {
		//withoutissueyear.chooseanitemfromtheDropdown1();
	}

	@Then("^upload both a JPG(\\d+) and a CSV(\\d+) filess at a time$")
	public void upload_both_a_JPG_and_a_CSV_filess_at_a_time(int arg1, int arg2) throws Throwable {
		//withoutissueyear.uploadbothaJPG1andaCSV1filessatatime();
	}

	@Then("^Ensure that the Checkbox is Selected before Save it$")
	public void ensure_that_the_Checkbox_is_Selected_before_Save_it() throws Throwable {
		//withoutissueyear.EnsurethattheCheckboxisSelectedbeforeSaveit();
	}

}