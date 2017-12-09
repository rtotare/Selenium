package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());

driver.close(); // close current instance
//driver.quit(); //close all the browser tabs


	}

}
