package webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String args[]) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Select sel = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
        sel.selectByVisibleText("Electronics");
  
	}

}
