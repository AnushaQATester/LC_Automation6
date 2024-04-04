package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserGenSingleByUploadingDOCfilePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	//click on certificate click Generate single 
	By certificates= By.xpath("//a[text()='Certificates ']");
	By single= By.xpath("//a[text()='Certificates ']/following-sibling::ul/li[1]/a");

	//click on Certificate type dropdown and select certificate type
	By certtype= By.xpath("/html/body/div/app-root/app-generate-certificates/div/div/div/div/div[2]/div/div/div[2]/select/option[7]");


	//Fill by the required fields
	By name= By.xpath("//input[@id='StudentName']");
	By mobile= By.xpath("//input[@id='studentMobile']");
	By email= By.xpath("//input[@id='StudentEmail']");
	By IssueMonth= By.xpath("//div[7]//div[1]//select[1]//option[9]");
	By AcademicRef= By.xpath("//input[@id='academicReferenceNumber']");
	By CertName= By.xpath("/html/body/div/app-root/app-generate-certificates/div/div/div/div/div[2]/div/div/div[3]/div/div/form/div[1]/div[6]/div/select/option[2]");
    By IssueYear= By.xpath("//div[8]//div[1]//select[1]//option[8]");


	//Upload DOC file into Upload the document field
	By upload= By.xpath("//input[@id='Uploadfile']");


	//click by next button
	By checkbox = By.name("gen_mail_institution");
	By next = By.xpath("//input[@class='btn btn-primary sw-btn-next']");
	By popup = By.xpath("//button[text()='Yes, Submit']");
	By ok = By.xpath("(//button[text()='No'])[2]");



	public UserGenSingleByUploadingDOCfilePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickoncertificateclickGeneratesingle() throws InterruptedException {
		WebElement adminsetting = testbase.waitForElement(Constants.driver.findElement(certificates), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(adminsetting).build().perform();
		Thread.sleep(3000);

	}

	public void clickonCertificatetypedropdownandselectcertificatetype() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(single), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(single).click();
		Thread.sleep(3000);
		Constants.driver.findElement(certtype).click();

	}

	public void Fillbytherequiredfields() throws InterruptedException {

		testbase.waitForElement(Constants.driver.findElement(name), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(name).sendKeys("Akshay");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(mobile), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mobile).sendKeys("8897473843");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(email), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(email).sendKeys("akshay@gmail.com");
		Thread.sleep(3000);

		testbase.waitForElement(Constants.driver.findElement(IssueMonth), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(IssueMonth).click();
		Thread.sleep(2000);


		testbase.waitForElement(Constants.driver.findElement(AcademicRef), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(AcademicRef).sendKeys("shgf37565");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(CertName), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(CertName).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(IssueYear), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(IssueYear).click();
		Thread.sleep(2000);

	}

	public void UploadDOCfileintoUploadthedocumentfield() throws InterruptedException {

		testbase.waitForElement(Constants.driver.findElement(upload), TIMEOUT_WAIT, POOLING_WAIT);
		String img= "D:\\LC_Automation Practice\\S-DOC.doc";

		Constants.driver.findElement(upload);
		WebElement Upload= testbase.waitForElement(Constants.driver.findElement(upload), TIMEOUT_WAIT, POOLING_WAIT);
		Upload.sendKeys(img);
		Thread.sleep(2000);
	}



	public void clickbynextbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(next), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(checkbox).click();
		Constants.driver.findElement(next).click();
		Thread.sleep(2000);
		Constants.driver.findElement(popup).click();
		Thread.sleep(2000);
		//Constants.driver.findElement(ok).click();
	}	


}