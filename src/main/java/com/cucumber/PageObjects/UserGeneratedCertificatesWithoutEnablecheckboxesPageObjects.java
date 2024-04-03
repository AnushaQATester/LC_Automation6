package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserGeneratedCertificatesWithoutEnablecheckboxesPageObjects {
	WebDriver driver;
	TestBase testbase;

	By	reports= By.xpath("//a[text()='Reports ']");
	
	By genc	=By.xpath("//a[text()='Generated Certificates ']");
	
	By ok=By.xpath("//button[text()='Ok']");
	
	By	c=By.xpath("//div[@class='card-header']/div[2]/select");
	
	By action = By.xpath("//select[@id='bulk_action']");
	
	By g=By.xpath("//input[@value='Go']");
	
	By o=By.xpath("//button[text()='Ok']");
	
	
	public UserGeneratedCertificatesWithoutEnablecheckboxesPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clcikonreportsandgenearatedcertiifcates()
	{
		WebElement Certificates=Constants.driver.findElement(reports);
		Actions act=new Actions(driver);
		act.moveToElement(Certificates).perform();
        Constants.driver.findElement(genc).click();
        
	}
	
	public void selectValueCertificate() throws InterruptedException
	
	{
		//driver.findElement(ok).click();
		WebElement ele2 = driver.findElement(c);
		Thread.sleep(2000);
		Select sc1=new Select(ele2);
		sc1.selectByValue("MBA");
		Thread.sleep(2000);
	}

	public void performclickoperation() throws InterruptedException
	
	{
		WebElement ActionDrpdwn = driver.findElement(action);
		Select s1=new Select(ActionDrpdwn);
		String[] valueToselect= {"1","2","3","4","5"};
		for(String value:valueToselect)
			
		{
			s1.selectByValue(value);
			Thread.sleep(1000);
			driver.findElement(g).click();
			driver.findElement(o).click();
			Thread.sleep(2000);
		}
	}
}
