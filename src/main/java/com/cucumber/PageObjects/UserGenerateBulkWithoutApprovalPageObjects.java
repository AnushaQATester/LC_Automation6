package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserGenerateBulkWithoutApprovalPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click on admin settings dropdown
	By adminsettings= By.xpath("//a[@class='sub-icon'][normalize-space()='Settings']");

	//select the settings 
	By settings= By.xpath("//a[@href='settings']");

	//click on Approval checkbox
	By checkbox= By.xpath("//input[@id='approval_bulk_generation']");

	//scroll down and click on Submit
	By submit=By.xpath("//input[@value='Submit']");
	By ok= By.xpath("//button[normalize-space()='Ok']");

	//click on signout
	By signout= By.xpath("//a[normalize-space()='Signout']");

	//login with user credentials
	By username= By.xpath("//input[@placeholder='User Login']");
	By password= By.xpath("//input[@placeholder='Password']");
	By login= By.xpath("//input[@value='Login']");

	//click on certificate dropdown
	By certificate= By.xpath("//a[normalize-space()='Certificates']");

	//select the Bulk Generation
	By bulk= By.xpath("//a[normalize-space()='Generate Bulk']");

	//click on Certificate type
	By certtype= By.xpath("//option[text()='Auto']");

	//upload the Originals
	//By original= By.xpath("//*[@id=\"verificationfrm1\"]/div[1]/div[1]/div/div/div[3]/ul");

	//upload the CSV
	//By csv= By.xpath("//*[@id='datafile']");





	public UserGenerateBulkWithoutApprovalPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickonadminsettingsdropdown() throws InterruptedException {
		WebElement admsettings = testbase.waitForElement(Constants.driver.findElement(adminsettings), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(admsettings).build().perform();
		Thread.sleep(3000);

	}
	public void selectthesettings() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(settings), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(settings).click();
		Thread.sleep(3000);

	}

	public void clickonApprovalcheckbox() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(checkbox), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(checkbox).click();

		WebElement checkbox = driver.findElement(By.id("approval_bulk_generation"));
		boolean isChecked = checkbox.isSelected();
		if(isChecked=false) {
			checkbox.click();
		}

		Thread.sleep(2000);
	}	

	public void scrolldownandclickonSubmit() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		testbase.waitForElement(Constants.driver.findElement(submit), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(submit).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(ok), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok).click();
		Thread.sleep(2000);
	}	

	public void clickbysignout() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(signout), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(signout).click();
		Thread.sleep(2000);

	}	

	public void loginwithuserdetails() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(username), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(username).sendKeys("SahUser");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(password), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(password).sendKeys("User@1");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(login), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(login).click();
		Thread.sleep(2000);
	}

	public void clickoncertificatedropdown() throws InterruptedException {
		WebElement certificates = testbase.waitForElement(Constants.driver.findElement(certificate), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(certificates).build().perform();
		Thread.sleep(3000);
	}

	public void selecttheBulkGeneration() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(bulk), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(bulk).click();
		Thread.sleep(2000);
	}

	public void clickonCertificatetype() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certtype), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certtype).click();
		Thread.sleep(2000);

		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		WebElement Action=driver.findElement(By.xpath("//a[normalize-space()='LearningChain']"));
		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);


	}

	public void uploadthePDFfiles() throws InterruptedException {
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\admin\\Desktop\\Bulk data-(26-Mar-24)\\important-linux-commands-you-should-know-obooko-51.pdf");
		Thread.sleep(2000);
	}

	public void uploadthedatafiles() throws InterruptedException {
		driver.findElement(By.id("datafile")).sendKeys("D:\\For Automation Purpose\\data (57).csv");
		driver.findElement(By.xpath("//input[@name='gen_mail_institution']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("rcfrmsubmit")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("rcfrmsubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		Thread.sleep(3000);

	}

}