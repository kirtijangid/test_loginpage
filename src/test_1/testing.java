package test_1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class testing {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		
		driver.findElement(By.name("user_login")).sendKeys("username");
		
		driver.findElement(By.name("password")).sendKeys("password");
		
		driver.findElement(By.name("submit"));
		
		
				

	}

}
