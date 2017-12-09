package webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver bk= new FirefoxDriver();
 bk.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
 System.out.println(bk.getCurrentUrl());
 bk.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
 bk.manage().window().maximize();
 bk.findElement(By.linkText("Sign up")).click();
 bk.findElement(By.name("userRegistrationForm:userName")).sendKeys("kpinki");
 //bk.findElement(By.linkText("Check Availability")).click();
 bk.findElement(By.partialLinkText("Check")).click();
 bk.findElement(By.name("userRegistrationForm:password")).sendKeys("Passw0rd123");
  bk.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("Passw0rd123");
  Select sel = new Select(bk.findElement(By.name("userRegistrationForm:securityQ")));
  sel.selectByIndex(3);
  bk.findElement(By.id("userRegistrationForm:securityAnswer")).sendKeys("xyzt");
  Select sel1 = new Select(bk.findElement(By.id("userRegistrationForm:prelan")));
  sel1.selectByVisibleText("English");
 // bk.findElement(By.id("userRegistrationForm:firstName")).sendKeys("pinu");
  bk.findElement(By.cssSelector("input#userRegistrationForm:firstName")).sendKeys("tej");
  bk.findElement(By.id("userRegistrationForm:middleName")).sendKeys("yogesh");
  bk.findElement(By.id("userRegistrationForm:lastName")).sendKeys("murade");
 //bk.findElement(By.name("userRegistrationForm:gender")).
				  
  bk.findElement(By.cssSelector("input#userRegistrationForm:email")).sendKeys("rutu1910@gmail.com"); //css tag#id
 bk.findElement(By.className("textfield01")).sendKeys("+91");
 bk.findElement(By.id("userRegistrationForm:mobile")).sendKeys("6548974145");
 
  
 // Select sel = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
  //sel.selectByVisibleText("Electronics");
	}

}
