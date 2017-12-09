package webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver fb = new FirefoxDriver();
		fb.get("https://en-gb.facebook.com");
		fb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(fb.getCurrentUrl());
		fb.findElement(By.className("firstname")).sendKeys("manisha");
		fb.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("sing");
		fb.findElement(By.xpath(".//*[@id='u_0_p']")).sendKeys("7709660456");
		fb.findElement(By.xpath(".//*[@id='u_0_w']")).sendKeys("7709660456");
		fb.findElement(By.xpath(".//*[@id='day']")).sendKeys("19");
		fb.findElement(By.xpath(".//*[@id='month']")).sendKeys("oct");
		fb.findElement(By.xpath(".//*[@id='year']")).sendKeys("1990");
		fb.findElement(By.xpath(".//*[@id='u_0_3']")).click();
	}

}
