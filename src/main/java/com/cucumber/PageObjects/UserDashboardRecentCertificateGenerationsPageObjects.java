package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserDashboardRecentCertificateGenerationsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//scroll by vertical
	By scroll = By.xpath("//a[normalize-space()='LearningChain']");

	//click on the cerificate type dropdown and select the type
	By type = By.xpath("/html/body/div/app-root/app-dashboard/body/div/div/div[2]/div/div[5]/div[1]/div/div/div[1]/div/select");

	//click on the student name 
	By studentname = By.xpath("/html/body/div/app-root/app-dashboard/body/div/div/div[2]/div/div[5]/div[1]/div/div/div[2]/table/tbody/tr/td[1]/a");

	//click and scroll the page
	By page = By.xpath("//a[@class='btn btn-sm btn-primary-light']");

	//click on the print button.
	By print = By.xpath("//a[text()='Print']");



	public UserDashboardRecentCertificateGenerationsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void scrollbyvertical() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(scroll), TIMEOUT_WAIT,POOLING_WAIT);

		JavascriptExecutor jse1=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//h5[normalize-space()='Recent Certificate Verifications']"));

		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);




	}
	public void clickonthecerificatetypedropdownandselectthetype() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(type), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(type).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/app-root/app-dashboard/body/div/div/div[2]/div/div[5]/div[1]/div/div/div[1]/div/select/option[2]")).click();
		Thread.sleep(2000);
	}

	public void clickonthestudentname() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(studentname), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(studentname).click();
		Thread.sleep(3000);
	}


	public void clickandscrollthepage() throws InterruptedException {
		//testbase.waitForElement(Constants.driver.findElement(page), TIMEOUT_WAIT,POOLING_WAIT);
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
	}


	public void clickontheprintbutton() throws InterruptedException {
		//testbase.waitForElement(Constants.driver.findElement(print), TIMEOUT_WAIT,POOLING_WAIT);
		
		
//		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());	
//		WebElement element1 = driver.findElement(By.xpath("//a[text()='Print']"));
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		int y1 = element1.getLocation().getY();
//		js1.executeScript("window.scrollBy(0,"+y1+")", element1);
//		Thread.sleep(2000);
//       element1.click();        

	}


}