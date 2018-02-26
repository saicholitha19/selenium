package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomisedXPATH {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://service.mail.com/registration.html?edition=us&lang=en&#.7518-header-signup2-1");
		
		driver.findElement(By.xpath(".//*[@tabindex='1']")).sendKeys("Sandhya");
		driver.findElement(By.xpath(".//*[@tabindex='2']")).sendKeys("Mupparaju");
		new Select( driver.findElement(By.xpath(".//*[@tabindex='3']"))).selectByVisibleText("Female");
		new Select( driver.findElement(By.xpath(".//*[@tabindex='4']"))).selectByVisibleText("Jan");
		new Select( driver.findElement(By.xpath(".//*[@tabindex='5']"))).selectByVisibleText("1");
		new Select( driver.findElement(By.xpath(".//*[@tabindex='6']"))).selectByVisibleText("2000");
		new Select( driver.findElement(By.xpath(".//*[@tabindex='7']"))).selectByVisibleText("United States");
		driver.findElement(By.xpath(".//*[@tabindex='8']")).sendKeys("sandhyamupparaju");
		driver.findElement(By.xpath(".//*[@tabindex='10']")).sendKeys("Abc12345");
		driver.findElement(By.xpath(".//*[@tabindex='11']")).sendKeys("Abc12345");
		driver.findElement(By.xpath(".//*[@tabindex='12']")).sendKeys("sandymupparaju@gmail.com");
		new Select( driver.findElement(By.xpath(".//*[@tabindex='13']"))).selectByVisibleText("What was the make of your first car?");
		driver.findElement(By.xpath(".//*[@tabindex='14']")).sendKeys("Honda");
		driver.findElement(By.xpath(".//*[@tabindex='15']")).click();
	}

}
