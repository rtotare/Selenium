package Practice;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Validusername {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getTitle());

	


		}
	}