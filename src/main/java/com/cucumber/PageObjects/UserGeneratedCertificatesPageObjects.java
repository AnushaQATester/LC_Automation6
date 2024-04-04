package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserGeneratedCertificatesPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click on reports type
	By reports = By.xpath("//a[normalize-space()='Reports']");

	//Click the generated certificates 
	By generated = By.xpath("//a[normalize-space()='Generated Certificates']");

	// Click on the pop up mssage
	By ok3 = By.xpath("//button[normalize-space()='Ok']");

	// Click on the certificate type dropdown
	By dropdown1 = By.xpath("//select[@class='selectBatchSingle ng-untouched ng-pristine ng-valid']");

	//Select the certificate type
	By selectvalue = By.xpath("/html/body/div/app-root/app-generated-certificates-all/body/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/select/option[1]");

	// click on the View Generated Certificate Text
	By popup = By.xpath("//h3[@class='mb-0 card-title']");

	//Click the academic reference number 
	By name = By.xpath("//input[@placeholder='academic Reference Number']");

	//Click on sendmail icon then click Ok button
	By sendmail =By.xpath("//i[@class='fa fa-envelope-o mx-2']");
	By ok =By.xpath("//button[normalize-space()='Ok']");

	//Click the revoke icon then click the Ok
	//By revoke = By.xpath("//i[@class='fa fa-undo mx-2']");
	//By ok1 = By.xpath("//button[normalize-space()='Ok']");

	//Click on download original certificate icon then click the Ok
	By originalcertificates = By.xpath("//tbody/tr[1]/td[9]/a[3]/i[1]");

	//Click on Download QR Code icon then click the Ok
	By qrcode = By.xpath("//tbody/tr[1]/td[9]/a[4]/i[1]");

	//Click the header checkbox
	By checkbox = By.xpath("//*[@id='rowid']");

	//Click the action dropdown
	By action = By.xpath("//select[@id='bulk_action']");

	//select the SendMail then click the GO 
	By select = By.xpath("//input[@value='Go']");

	// Click on SendMail Ok button
	By button  =By.xpath("//button[normalize-space()='Ok']");



	public UserGeneratedCertificatesPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}


	public void clickonreportstype() throws InterruptedException {
		WebElement inst = testbase.waitForElement(Constants.driver.findElement(reports), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act1 = new Actions(driver);
		act1.moveToElement(inst).build().perform();
		Thread.sleep(3000);

	}

	public void Clickthegeneratedcertificates () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(generated), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(generated).click();
		Thread.sleep(3000);

//		testbase.waitForElement(Constants.driver.findElement(ok3), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(ok3).click();
//		Thread.sleep(1000);

		testbase.waitForElement(Constants.driver.findElement(dropdown1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(dropdown1).click();
		Thread.sleep(1000);

		testbase.waitForElement(Constants.driver.findElement(selectvalue), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(selectvalue).click();
		Thread.sleep(1000);

		testbase.waitForElement(Constants.driver.findElement(popup), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(popup).click();
	}

	public void Clicktheacademicreferencenumber () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(name), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(name).sendKeys("HT34567");
		Thread.sleep(2000);
        JavascriptExecutor jse1=(JavascriptExecutor) driver;
        WebElement Action=driver.findElement(By.xpath("//*[@id=\"example\"]/thead/tr/th[9]"));
        jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);
	}
	
	public void ClickonsendmailiconthenclickOkbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(sendmail), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(sendmail).click();
		Constants.driver.findElement(ok).click();
		Thread.sleep(4000);

	}
	
	public void ClicktherevokeiconthenclicktheOk() throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(revoke), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(revoke).click();
//		Constants.driver.findElement(ok1).click();
//		Thread.sleep(4000);


	}
	
	public void ClickondownloadoriginalcertificateiconthenclicktheOk() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(originalcertificates), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(originalcertificates).click();
		Thread.sleep(4000);

	}

	public void ClickonDownloadQRCodeiconthenclicktheOk() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(qrcode), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(qrcode).click();
		Thread.sleep(4000);

	}

	public void Clicktheheadercheckbox() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(checkbox), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(checkbox).click();
		Thread.sleep(2000);
		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		WebElement Action=driver.findElement(By.xpath("//select[@id='bulk_action']"));
		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);
	}

	public void Clicktheactiondropdown() throws InterruptedException {
		WebElement drop = testbase.waitForElement(Constants.driver.findElement(action), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(action).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@name='bulk_action']//option[2]")).click();
		Thread.sleep(3000);

	}

	public void selecttheSendMailthenclicktheGO () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(select), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(select).click();
		Thread.sleep(3000);
	}

	public void clicktheOk() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(button), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(button).click();
		Thread.sleep(2000);


	}

}
