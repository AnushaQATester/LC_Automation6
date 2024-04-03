package com.cucumber.PageObjects;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import com.cucumber.TestBase.TestBase;
import com.cucumber.managers.FileReaderManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.excelGeniricUtillity;
import com.google.common.collect.Table.Cell;

public class UserGenSingleByUploadingJPEGfilePageObjects {

	WebDriver driver;
	TestBase testbase;

	By	c=By.xpath("//a[text()='Certificates ']");
	By	gs=By.xpath("//a[text()='Generate single ']");
	By	ct=By.xpath("//div[@class='col-md-12']/div/div/select");
    By	sn=By.name("StudentName");
	By	sm=By.name("StudentEmail");
	By	smn=By.name("studentMobile");
	By	acf=By.name("academicReferenceNumber");
	By	cn=By.xpath("(//div[@class=\"row\"])[3]/div[6]/div/select");
	By	month=By.xpath("(//div[@class='form-group'])[7]/select");
	By	year=By.xpath("(//div[@class='form-group'])[8]/select");
	By certficupload=By.xpath("//input[@type='file']");
	By	chb=By.xpath("//input[@type='checkbox']");
	By	sbmt=By.xpath("//input[@type='submit']");
	By	surebtn=By.xpath("//button[text()='Yes, Submit']");

	public UserGenSingleByUploadingJPEGfilePageObjects(WebDriver driver) 
	{

		this.driver=driver;
		testbase=new TestBase();
	}

	public void clickoncertificateandgenearatesingle()
	{
		Constants.driver.findElement(c).click();
		Constants.driver.findElement(gs).click();
	}
	public void selectCertificate() throws InterruptedException
	
	{

		WebElement CertificateType = driver.findElement(ct);
		Select sc=new Select(CertificateType);
		sc.selectByVisibleText("BSC");
		Thread.sleep(3000);
	}
	
	public void fillStudentDeatils() throws Exception
	{


		excelGeniricUtillity ex = new excelGeniricUtillity();

		//Reading Student data from Excel 

		String stun = ex.getDataFromExcel("User", 9, 0);
		String stumail = ex.getDataFromExcel("User", 9, 1);
		String stuMoble = ex.getDataFromExcel("User", 9, 2);
		String stuRefrence = ex.getDataFromExcel("User", 9, 3);
		String certiname = ex.getDataFromExcel("User", 9, 4);
		String mnth = ex.getDataFromExcel("User", 9, 5);
		//    String yer = eUtil.readDatafromExcel("Sheet1", 1, 6);

		//System.out.println(yer);

		Constants.driver.findElement(sn).sendKeys(stun);
		Constants.driver.findElement(sm).sendKeys(stumail);
		Constants.driver.findElement(smn).sendKeys(stuMoble);
		Constants.driver.findElement(acf).sendKeys(stuRefrence);

		//Select the Certificate Name
		WebElement SelectCertificateName = driver.findElement(cn);
		Select sc1=new Select(SelectCertificateName);
		sc1.selectByValue(certiname);

		//select the month

		WebElement issuemonth = driver.findElement(month);
		Select sc2=new Select(issuemonth);
		sc2.selectByVisibleText(mnth);

		//	    select year

		WebElement issueYear = driver.findElement(year);
		Select sc3=new Select(issueYear);
		sc3.selectByVisibleText("2019");

	}
	
	public void uploadCertificate()
	
	{
		driver.findElement(certficupload).sendKeys("D:\\LC_Automation Practice\\Screenshot (13).jpeg");
		driver.findElement(chb).click();
		driver.findElement(sbmt).click();
		driver.findElement(surebtn).click();

	}
}




