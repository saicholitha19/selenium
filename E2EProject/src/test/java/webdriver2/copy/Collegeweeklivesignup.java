package webdriver2.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Collegeweeklivesignup {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.collegeweeklive.com");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//signup
		driver.findElement(By.linkText("Sign up/Log in")).click();
		
		//Check Email button is clickble or not?
		WebDriverWait w = new WebDriverWait(driver,10);
		WebElement ele = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'register\']/button")));
		ele.click();
		//
		// Fluent wiat....Whileloop wait
		// Size =0, Element is not present
		// size =1,Element is present
		int i = 1;
		while (driver.findElements(By.name("firstName")).size() < 1) {// 0<1
			Thread.sleep(500);// wait for 0.5 sec
			System.out.println("Wait for element to b visible*****************");
			if (i > 30) {
				break;
			}
		} // while loop end
		
		driver.findElement(By.name("firstName")).sendKeys("sandhya");
		driver.findElement(By.name("lastName")).sendKeys("mupparaju");
		driver.findElement(By.name("emailAddress")).sendKeys("sandy@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("test12345");
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("INDIA");
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		// select month,day and year
		new Select(driver.findElement(By.id("questions_16_Month"))).selectByVisibleText("January");
		new Select(driver.findElement(By.id("questions_16_DayOfMonth"))).selectByVisibleText("1");
		new Select(driver.findElement(By.id("questions_16_DOBYear"))).selectByVisibleText("2003");

		// multi select
		driver.findElement(By.xpath(".//*[@id='questions[q_19]']/div[1]")).click();
		driver.findElement(By.xpath(".//*[@id='questions[q_19]']/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath(".//*[@id='questions[q_19]']/div[2]/div[3]/label")).click();
		driver.findElement(By.xpath(".//*[@id='questions[q_19]']/div[1]")).click();

		driver.findElement(By.xpath(".//*[@id='register']/div[7]/div/button")).click();
	}
}
