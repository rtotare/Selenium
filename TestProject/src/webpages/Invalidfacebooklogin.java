package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumberTest.Webutil;

public class Invalidfacebooklogin {
String fbusername=".//*[@id='email']";
String fbpassword=".//*[@id='pass']";
String fbloginbtn=".//*[@id='u_0_3']";
String fbmsg=".//*[@id='globalContainer']/div[3]/div/div/div";

public void enterFBusername(String username)
{
	
	Webutil.driver.findElement(By.xpath(fbusername)).sendKeys("Username"); 
}

public void enterFBpassword(String password)

{
    Webutil.driver.findElement(By.xpath(fbpassword)).sendKeys("password");
}

public void clickbtn()
{
	Webutil.driver.findElement(By.xpath(fbloginbtn)).click();
}

public String errorfbmsg()
{
	return Webutil.driver.findElement(By.xpath(fbmsg)).getText();
	}

}
