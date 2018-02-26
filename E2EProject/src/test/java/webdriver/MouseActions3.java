package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
		Actions a = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/a"));
		//get the tool tip for application
		String title = e.getAttribute("title");
		System.out.println(title);
		
		a.moveToElement(e);
		a.contextClick(e).sendKeys(Keys.ARROW_DOWN).build().perform();

	}

}
