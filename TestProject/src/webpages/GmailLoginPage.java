package webpages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumberTest.Webutil;

public class GmailLoginPage {
 String usernametxtfld = ".//*[@id='identifierId']";
 String nxtbtn =".//*[@id='identifierNext']/content";
 String passwordtxtfld =".//*[@id='password']/div[1]/div/div[1]/input";
 String errmsg =".//*[@id='password']/div[2]/div[2]";



 public void enterUserName(String Username)
   {
	 Webutil.driver.findElement(By.xpath(usernametxtfld)).sendKeys(Username);
	 
 }
  
 public void clicknxtbtn()
 
 {
	 Webutil.driver.findElement(By.xpath(nxtbtn)).click();
 }
 
 
 public void enterpasswod(String Password)
 {
	 
	 Webutil.driver.findElement(By.xpath(passwordtxtfld)).sendKeys(Password);
 }

 public String chkerrormsg()
 {
	return Webutil.driver.findElement(By.xpath(errmsg)).getText();
 }
 
}
 
 