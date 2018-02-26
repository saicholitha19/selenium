package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeBrowserLaunch {

	public static void main(String[] args) throws Exception {
		// webdriver object creation
		WebDriver driver;
		// launch browser: identify supported exe file where the .exe file located in
		// our system
		// System.setProperty("Key","Path of the browser .exe file");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// URL type
		driver.get("https://www.facebook.com/");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Explicitly wait
		WebDriverWait w = new WebDriverWait(driver, 10);
		 w.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));

		// Fluent wiat....Whileloop wait
		// Size =0, Element is not present
		// size =1,Element is present
		int i = 1;
		while (driver.findElements(By.name("firstname")).size() < 1) {// 0<1
			Thread.sleep(500);// wait for 0.5 sec
			System.out.println("Wait for element to b visible*****************");
			if (i >30) {
				break;
			}
		} // while loop end

		// type any text to firstname edit box
		driver.findElement(By.name("firstname")).sendKeys("sandhya");
		// type any text to lastname edit box
		driver.findElement(By.name("lastname")).sendKeys("mupparaju");
		// type any text to mobile number or email edit box
		driver.findElement(By.name("reg_email__")).sendKeys("sandy@gmail.com");
		// type any text to password edit box
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
		// select radio button for gender
		driver.findElement(By.name("Sex")).click();
		driver.findElement(By.name("websubmit")).click();
	}

}
